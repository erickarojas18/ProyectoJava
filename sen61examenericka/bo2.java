
package com.mycompany.sen61examenericka;
import java.util.*;

public class bo2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tiempoActual = 0;
        ArrayList<Integer> rafagaG = new ArrayList<>();
        Queue<String> colaEspera = new LinkedList<>();
        List<String> tiposPacientes = new ArrayList<>();
        List<Integer> tiemposLlegada = new ArrayList<>();
        List<Integer> tiemposAtencion = new ArrayList<>();
        List<Integer> tiemposEspera = new ArrayList<>();

        mostrarEstadisticas(tiposPacientes, tiemposLlegada, tiemposAtencion, tiemposEspera, rafagaG, colaEspera, tiempoActual);
    }
     static int pideValor(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    static int menu() {
        System.out.println("Indique su categoría: ");
        System.out.println("1. Adulto Mayor (8-10)");
        System.out.println("2. General (6-7)");
        System.out.println("3. Especiales (4-5)");
        System.out.println("4. Emergencias (0-3)");
        System.out.println("5. Salir");
        return pideValor("Elija una opción...");
    }

    // ... (resto del código permanece sin cambios)

    public static void mostrarEstadisticas(List<String> tiposPacientes, List<Integer> tiemposLlegada,
                                           List<Integer> tiemposAtencion, List<Integer> tiemposEspera,
                                           ArrayList<Integer> rafagaG, Queue<String> colaEspera, int tiempoActual) {
        int tiempoFinalizacion = 0;

        while (true) {
            int opcion = menu();
            switch (opcion) {
                case 1:
                    agregarPaciente(colaEspera, tiposPacientes, tiemposLlegada, tiemposAtencion, "Adulto Mayor", tiempoActual, rafagaG);
                    break;
                case 2:
                    agregarPaciente(colaEspera, tiposPacientes, tiemposLlegada, tiemposAtencion, "General", tiempoActual, rafagaG);
                    break;
                case 3:
                    agregarPaciente(colaEspera, tiposPacientes, tiemposLlegada, tiemposAtencion, "Especiales", tiempoActual, rafagaG);
                    break;
                case 4:
                    agregarPaciente(colaEspera, tiposPacientes, tiemposLlegada, tiemposAtencion, "Emergencias", tiempoActual, rafagaG);
                    break;
                case 5:
                    tiempoFinalizacion = tiempoActual;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

            if (opcion == 5) {
                break;
            }
            int tiempoFinalizacion1;

            atenderPacientes(colaEspera, tiposPacientes, tiemposLlegada, tiemposAtencion, tiemposEspera, tiempoActual,tiempoFinalizacion1);
        }

        copia(rafagaG, tiposPacientes, tiemposEspera, tiempoFinalizacion);
    }

    static void copia(ArrayList<Integer> rafagaG, List<String> tiposPacientes, List<Integer> tiemposEspera, int tiempoFinalizacion) {
        if (!rafagaG.isEmpty()) {
            List<Integer> rafagaOrdenada = new ArrayList<>(rafagaG);
            Collections.sort(rafagaOrdenada);
            int primeraPos = rafagaOrdenada.get(0);

            for (int j = primeraPos; j >= 1; j--) {
                primeraPos--;
                System.out.println(primeraPos);
            }
            int totalTiempoEspera = 0;

            System.out.println("Estadísticas de atención:");

            for (int i = 0; i < tiposPacientes.size(); i++) {
                int tiempoEspera = tiemposEspera.get(i);
                totalTiempoEspera = totalTiempoEspera + tiempoEspera;

                System.out.println("Tiempo de espera del paciente " + (i + 1) + ": " + tiempoEspera);
            }

            double tiempoPromedioEspera = totalTiempoEspera / (double) tiposPacientes.size();
            System.out.println("Tiempo promedio de espera: " + tiempoPromedioEspera);

            System.out.println("Tiempo de finalización: " + tiempoFinalizacion);
        } else {
            System.out.println("No hay pacientes en la lista rafagaG.");
        }
    }

    // ... (resto del código permanece sin cambios)

    public static int generarTiempoAtencion(String tipo) {
        Random random = new Random();

        if (tipo.equals("Adulto Mayor")) {
            return random.nextInt(3) + 8; // Rango: 8-10
        } else if (tipo.equals("General")) {
            return random.nextInt(2) + 6; // Rango: 6-7
        } else if (tipo.equals("Especiales")) {
            return random.nextInt(2) + 4; // Rango: 4-5
        } else if (tipo.equals("Emergencias")) {
            return random.nextInt(4); // Rango: 0-3
        } else {
            return 0;
        }
    }

    public static void agregarPaciente(Queue<String> colaEspera, List<String> tiposPacientes, List<Integer> tiemposLlegada,
                                       List<Integer> tiemposAtencion, String tipo, int tiempoActual, ArrayList<Integer> rafagaG) {
        int tiempoAtencion = generarTiempoAtencion(tipo);
        System.out.println("El tiempo de consulta es: " + tiempoAtencion);
        rafagaG.add(tiempoAtencion);

        if (tipo.equals("Emergencias")) {
            if (!colaEspera.isEmpty()) {
                // Atender al paciente de emergencia antes de agregarlo a la cola
                System.out.println("Atendiendo paciente de emergencia...");
                String pacienteEmergencia = colaEspera.poll();
                int index = tiposPacientes.indexOf(pacienteEmergencia);
                int tiempoEspera = tiempoActual - tiemposLlegada.get(index);
                int tiempoRetorno = tiempoEspera + tiemposAtencion.get(index);

                System.out.println("Tiempo de espera del paciente: " + tiempoEspera);
                System.out.println("Tiempo de retorno del paciente: " + tiempoRetorno);
                tiempoActual += tiempoAtencion;
            }
        }

        colaEspera.add(tipo);
        tiposPacientes.add(tipo);
        tiemposLlegada.add(tiempoActual);
        tiemposAtencion.add(tiempoAtencion);
        System.out.println("Llegó un paciente de tipo " + tipo);
    }
    
    public static void atenderPacientes(Queue<String> colaEspera, List<String> tiposPacientes, List<Integer> tiemposLlegada,
                                    List<Integer> tiemposAtencion, List<Integer> tiemposEspera, int tiempoActual,int tiempoFinalizacion) {
    List<String> pacientesTemporales = new ArrayList<>(colaEspera);
    pacientesTemporales.sort(Comparator.comparingInt(p -> tiemposAtencion.get(tiposPacientes.indexOf(p))));

    if (!pacientesTemporales.isEmpty()) {
        String primerPaciente = pacientesTemporales.get(0);
        if (primerPaciente.equals("Emergencias")) {
            System.out.println("Atendiendo paciente de emergencia...");
            int index = tiposPacientes.indexOf(primerPaciente);
            int tiempoAtencion = tiemposAtencion.get(index);

            int tiempoEspera = tiempoActual - tiemposLlegada.get(index);
            int tiempoRetorno = tiempoFinalizacion - tiempoAtencion;
            tiemposEspera.add(tiempoEspera); // Agrega el nuevo tiempo de espera a la lista

            tiempoActual += tiempoAtencion;

            System.out.println("Tiempo de espera del paciente: " + tiempoEspera);
            System.out.println("Tiempo de retorno del paciente: " + tiempoRetorno);

            pacientesTemporales.remove(primerPaciente); // Remueve al paciente de emergencia de la lista
        }
    }

    // Continúa atendiendo a los demás pacientes
    for (String pacienteActual : pacientesTemporales) {
        System.out.println("Atendiendo paciente de tipo " + pacienteActual);

        int index = tiposPacientes.indexOf(pacienteActual);
        int tiempoAtencion = tiemposAtencion.get(index);

        int tiempoEspera = tiempoActual - tiemposLlegada.get(index);
        int tiempoRetorno = tiempoEspera + tiempoAtencion; // Calcula el tiempo total de retorno

        tiemposEspera.add(tiempoEspera); // Agrega el nuevo tiempo de espera a la lista

        tiempoActual += tiempoAtencion;

        System.out.println("Tiempo de espera del paciente: " + tiempoEspera);
        System.out.println("Tiempo de retorno del paciente: " + tiempoRetorno);
    }
}


}







       
    

   




    

 
    

