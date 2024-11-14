import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {
    public static int[][] arrays;

    public static void generateArrays() {
        int[] sizes = { 10, 100, 1000, 5000, 10000, 30000 };
        arrays = new int[sizes.length][];

        Random random = new Random();

        // Generar el primer arreglo de 10 elementos aleatorios
        arrays[0] = new int[sizes[0]];
        for (int j = 0; j < sizes[0]; j++) {
            arrays[0][j] = random.nextInt(30000) + 1;
        }

        // Generar los arreglos restantes tomando el arreglo previo y agregando más
        // elementos
        for (int i = 1; i < sizes.length; i++) {
            // Copiar el arreglo anterior y añadir el nuevo tamaño
            arrays[i] = Arrays.copyOf(arrays[i - 1], sizes[i]);
            // Añadir valores adicionales aleatorios desde el último tamaño al actual
            for (int j = sizes[i - 1]; j < sizes[i]; j++) {
                arrays[i][j] = random.nextInt(30000) + 1;
            }
        }
        System.out.println("Arreglos generados con éxito.");
    }

    public static void printArrays() {
        int[] sizes = { 10, 100, 1000, 5000, 10000, 30000 };
        for (int i = 0; i < sizes.length; i++) {
            int lastValue = arrays[i][arrays[i].length - 1]; // Obtener el último valor
            System.out.println("Arreglo de tamaño " + sizes[i] + " (último valor: " + lastValue + ")");
        }
    }
}
