
package com.mycompany.snakeericka;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Graphics extends JPanel implements ActionListener {

    static final int WIDTH = 600;
    static final int HEIGHT = 600;
    static final int TICK_SIZE = 40;
    static final int BOARD_SIZE = (WIDTH * HEIGHT) / (TICK_SIZE * TICK_SIZE);

    final Font font = new Font("TimesRoman", Font.BOLD, 30);

    int[] snakePosX = new int[BOARD_SIZE];
    int[] snakePosY = new int[BOARD_SIZE];
    int snakeLength;
    String[] nombre = new String[15];
    int starTime;
    Food food;
    int foodEaten;
    int puntos;
    char direction = 'R';
    boolean isMoving = false;
    final Timer timer = new Timer(250, this);

    int bestTime = Integer.MAX_VALUE; // Inicializar el mejor tiempo con un valor alto

    public Graphics() {

        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                if (isMoving) {
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_LEFT:
                            if (direction != 'R') {
                                direction = 'L';
                            }
                            break;
                        case KeyEvent.VK_RIGHT:
                            if (direction != 'L') {
                                direction = 'R';
                            }
                            break;
                        case KeyEvent.VK_UP:
                            if (direction != 'D') {
                                direction = 'U';
                            }
                            break;
                        case KeyEvent.VK_DOWN:
                            if (direction != 'U') {
                                direction = 'D';
                            }
                            break;
                    }
                } else {
                    start();
                }
            }
        });

        start();

    }

    protected void start() {
        String playerName = JOptionPane.showInputDialog(this, "Ingresa tu nombre:");

        if (playerName != null && !playerName.isEmpty()) {
            for (int i = 0; i < nombre.length; i++) {
                if (nombre[i] == null) {
                    nombre[i] = playerName;
                    break;
                }
            }
            snakePosX = new int[BOARD_SIZE];
            snakePosY = new int[BOARD_SIZE];
            snakeLength = 5;
            foodEaten = 0;
            direction = 'R';
            isMoving = true;
            spawnFood();
            timer.start();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa un nombre válido.");
            isMoving = false; // Detenemos el juego si no se ingresa un nombre válido.
        }
    }

    // Realizo los segmentos de la serpiente y el alimento.
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        if (isMoving) {
            g.setColor(Color.PINK);
            g.fillOval(food.getPosX(), food.getPosY(), TICK_SIZE, TICK_SIZE);

            g.setColor(Color.GREEN);
            for (int i = 0; i < snakeLength; i++) {
                g.fillRect(snakePosX[i], snakePosY[i], TICK_SIZE, TICK_SIZE);
            }
        }

    }

    protected void move() {
        for (int i = snakeLength; i > 0; i--) {
            snakePosX[i] = snakePosX[i - 1];
            snakePosY[i] = snakePosY[i - 1];
        }

        switch (direction) {
            case 'U' ->
                snakePosY[0] -= TICK_SIZE;
            case 'D' ->
                snakePosY[0] += TICK_SIZE;
            case 'L' ->
                snakePosX[0] -= TICK_SIZE;
            case 'R' ->
                snakePosX[0] += TICK_SIZE;
        }
    }

    protected void spawnFood() {
        food = new Food();
    }
    //si la serpiente alcanza el alimento aumenta su tamnaño y genera un nuevo alimento 

    protected void eatFood() {
        if ((snakePosX[0] == food.getPosX()) && (snakePosY[0] == food.getPosY())) {
            snakeLength++;
            foodEaten++;
            if (foodEaten == 6) {
                isMoving = !isMoving;
            }
            spawnFood();
        }
    }

    //Defino el for para recorrer el cuerpo de la serpiente,y cuando ella colisione con si misma el juego se detiene. 
    protected void collisionTest() {
        for (int i = snakeLength; i > 0; i--) {
            if ((snakePosX[0] == snakePosX[i]) && (snakePosY[0] == snakePosY[i])) {
                isMoving = false;
                break;
            }
        }

        if (snakePosX[0] < 0 || snakePosX[0] > WIDTH - TICK_SIZE || snakePosY[0] < 0 || snakePosY[0] > HEIGHT - TICK_SIZE) {
            isMoving = false;
        }

        if (!isMoving) {
            puntos= foodEaten* 5; 
            timer.stop();


//            if (foodEaten==6) {
////            puntos *=2;// Duplica la puntuación si no hay desaciertos
////            isMoving=!isMoving;
//                JOptionPane.showMessageDialog(this, "¡Has ganado! Puntuación: " + (puntos));
//            } else {
//                JOptionPane.showMessageDialog(this, "Has perdido. Puntuación: " + (puntos));
//            }
        }
    }

    //controla el ciclo principal del juego y guarda puntuacion del juego
    public void actionPerformed(ActionEvent e) {
        if (isMoving) {
            move();
            collisionTest();
            eatFood();
        }
        repaint();

        if (!isMoving) {
            saveScores();
            timer.stop();
            if (foodEaten==6) {
            puntos= foodEaten* 5;
            puntos *=2;// Duplica la puntuación si no hay desaciertos
            //isMoving=!isMoving;
            JOptionPane.showMessageDialog(this, "¡Has ganado! Puntuación: " + (puntos));
            

            } else {
             JOptionPane.showMessageDialog(this, "Has perdido. Puntuación: " + (puntos));
            }

        }
    }

    protected void saveScores() {
        String filePath = "puntos.txt"; // Ruta del archivo donde se guardarán los datos

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String formattedDate = dateFormat.format(currentDate);

            writer.write(formattedDate + "-" + nombre[0] + ": " + (puntos) + " puntos\n");
            JOptionPane.showMessageDialog(this, "Datos guardados en " + filePath);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + ex.getMessage());
        }
    }

}
