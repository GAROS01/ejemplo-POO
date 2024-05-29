import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final ArrayList<Clientes> listaClientes = new ArrayList<>();
    private final ArrayList<Manicuristas> listaManicuristas = new ArrayList<>();
    private final ArrayList<Citas> listaCitas = new ArrayList<>();

    public void desplegarMenu() {
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar un cliente");
            System.out.println("2. Registrar un manicurista");
            System.out.println("3. Agendar una cita");
            System.out.println("4. Ver citas agendadas");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    registrarManicurista();
                    break;
                case 3:
                    agendarCita();
                    break;
                case 4:
                    citasAgendadas();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        } while (opcion != 5);
    }

    private void registrarCliente() {
        System.out.println("Ingrese los datos del cliente:");
        System.out.print("ID: ");
        int idCliente = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nombre: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellidoCliente = scanner.nextLine();
        System.out.print("Telefono: ");
        String telefonoCliente = scanner.nextLine();
        System.out.print("Correo: ");
        String correoCliente = scanner.nextLine();
        System.out.print("Observaciones: ");
        String observacionesCliente = scanner.nextLine();
        // Crear un objeto de la clase Clientes
        Clientes cliente = new Clientes(idCliente, nombreCliente, apellidoCliente, telefonoCliente, correoCliente, observacionesCliente);
        listaClientes.add(cliente);
    }

    private void registrarManicurista() {
        System.out.println("Ingrese los datos de la manicurista:");
        System.out.print("ID: ");
        int idManicurista = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nombre: ");
        String nombreManicurista = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellidoManicurista = scanner.nextLine();
        System.out.print("Telefono: ");
        String telefonoManicurista = scanner.nextLine();
        System.out.print("Correo: ");
        String correoManicurista = scanner.nextLine();
        // Crear un objeto de la clase Manicuristas
        Manicuristas manicurista = new Manicuristas(idManicurista, nombreManicurista, apellidoManicurista, telefonoManicurista, correoManicurista);
        listaManicuristas.add(manicurista);
    }

    private void agendarCita() {
        System.out.println("Ingrese los datos de la cita:");
        System.out.print("ID: ");
        int idCita = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        System.out.print("Fecha: ");
        String fechaCita = scanner.nextLine();
        System.out.print("Hora: ");
        String horaCita = scanner.nextLine();
        System.out.print("Servicio: ");
        String servicioCita = scanner.nextLine();
        Clientes cliente = obtenerCliente();
        Manicuristas manicurista = obtenerManicurista();
        // Crear un objeto de la clase Citas
        Citas cita = new Citas(idCita, fechaCita, horaCita, servicioCita, cliente, manicurista);
        listaCitas.add(cita);
    }

    private void citasAgendadas() {
        System.out.println("Citas agendadas:");
        for (Citas cita : listaCitas) {
            System.out.println("ID: " + cita.getId());
            System.out.println("Fecha: " + cita.getFecha());
            System.out.println("Hora: " + cita.getHora());
            System.out.println("Servicio: " + cita.getServicio());
            System.out.println("Cliente: " + cita.getCliente().getNombre() + " " + cita.getCliente().getApellido());
            System.out.println("Manicurista: " + cita.getManicurista().getNombre() + " " + cita.getManicurista().getApellido());
            System.out.println();
        }
    }

    private Clientes obtenerCliente() {
        System.out.print("Ingrese el índice del cliente: ");
        int indiceCliente = scanner.nextInt();
        scanner.nextLine();
        return listaClientes.get(indiceCliente - 1);
    }

    private Manicuristas obtenerManicurista() {
        System.out.print("Ingrese el índice de la manicurista: ");
        int indiceManicurista = scanner.nextInt();
        scanner.nextLine();
        return listaManicuristas.get(indiceManicurista - 1);
    }
}