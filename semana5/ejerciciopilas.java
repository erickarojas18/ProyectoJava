import java.util.Scanner;
import java.util.Stack;

public class ejerciciopilas {
    public static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        llenar(pila);
        
        System.out.println("Invocando el método por segunda vez...");
        llenar(pila);
        
        imprimirPila(pila);
        
        pila = extraerValor(pila);
        
        imprimirPila(pila);
    }
    
    public static void llenar(Stack<Integer> pila) {
        System.out.println("Llenar la pila:");
        
        if (pila.isEmpty()) {
            System.out.println("Agregando el primer valor...");
        }
        
        while (true) {
            System.out.print("Ingrese un valor entero (0 para terminar): ");
            int valor = leer.nextInt();
            
            if (valor == 0) {
                break;
            }
            
            if (pila.size() >= 10) {
                System.out.println("La pila está llena, no se puede agregar más valores.");
                break;
            }
            
            pila.push(valor);
            System.out.println("Valor agregado a la pila.");
            
            System.out.print("¿Desea continuar? (S/N): ");
            String respuesta = leer.next();
            
            if (respuesta.equalsIgnoreCase("N")) {
                break;
            } else if (!respuesta.equalsIgnoreCase("S")) {
                System.out.println("Respuesta inválida. Solo se permite S o N. Saliendo...");
                break;
            }
        }
    }
    
    public static Stack<Integer> extraerValor(Stack<Integer> pila) {
        System.out.println("\nExtraer valor de la pila:");
        
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía, no se puede extraer ningún valor.");
            return pila;
        }
        
        imprimirPila(pila);
        
        System.out.print("Ingrese el valor que desea extraer de la pila: ");
        int valorExtraer = leer.nextInt();
        
        Stack<Integer> pilaAuxiliar = new Stack<>();
        boolean encontrado = false;
        
        while (!pila.isEmpty()) {
            int valor = pila.pop();
            
            if (valor == valorExtraer) {
                System.out.println("Valor extraído de la pila: " + valor);
                encontrado = true;
                break;
            } else {
                pilaAuxiliar.push(valor);
            }
        }
        
        while (!pilaAuxiliar.isEmpty()) {
            pila.push(pilaAuxiliar.pop());
        }
        
        if (!encontrado) {
            System.out.println("El valor no se encontró en la pila.");
        }
        
        return pila;
    }
    
    public static void imprimirPila(Stack<Integer> pila) {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Contenido de la pila:");
            for (Integer valor : pila) {
                System.out.println(valor);
            }
        }
    }
}
