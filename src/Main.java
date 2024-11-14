import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Generar Arreglos aleatorios con diferente tamaño");
            System.out.println("2. Seleccionar método de ordenamiento y medir tiempos");
            System.out.println("3. Buscar último valor de cada arreglo con búsqueda binaria");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    ArrayGenerator.generateArrays();
                    ArrayGenerator.printArrays();
                    break;
                case 2:
                    showSortingMenu();
                    break;
                case 3:
                    TimeMeasure.measureBinarySearchTime();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 4);

        scanner.close();
    }

    private static void showSortingMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSeleccione el método de ordenamiento:");
        System.out.println("1. Burbuja con Ajuste");
        System.out.println("2. Selección");
        System.out.println("3. Inserción");
        System.out.print("Seleccione una opción: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                TimeMeasure.measureSortingTime("BubbleSort");
                break;
            case 2:
                TimeMeasure.measureSortingTime("SelectionSort");
                break;
            case 3:
                TimeMeasure.measureSortingTime("InsertionSort");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
