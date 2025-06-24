import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("\n1. Agregar carta");
            System.out.println("2. Listar cartas");
            System.out.println("3. Eliminar carta");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    try {
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Tipo: ");
                        String tipo = scanner.nextLine();
                        System.out.print("Ataque: ");
                        int ataque = Integer.parseInt(scanner.nextLine());
                        System.out.print("Defensa: ");
                        int defensa = Integer.parseInt(scanner.nextLine());

                        Carta carta = new Carta(nombre, tipo, ataque, defensa);
                        inventario.agregarCarta(carta);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Ataque y defensa deben ser números.");
                    } catch (Exception e) {
                        System.out.println("Error inesperado: " + e.getMessage());
                    }
                    break;

                case "2":
                    inventario.listarCartas();
                    break;

                case "3":
                    System.out.print("Nombre de la carta a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    inventario.eliminarCarta(nombreEliminar);
                    break;

                case "4":
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}    