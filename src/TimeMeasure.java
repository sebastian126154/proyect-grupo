public class TimeMeasure {
    public static void measureSortingTime(String sortMethod) {
        int[] sizes = { 10, 100, 1000, 5000, 10000, 30000 };

        for (int i = 0; i < sizes.length; i++) {
            int[] array = ArrayGenerator.arrays[i].clone();
            long start, end;

            switch (sortMethod) {
                case "BubbleSort":
                    start = System.nanoTime();
                    BubbleSort.sort(array);
                    end = System.nanoTime();
                    System.out.println("Burbuja con Ajuste: Con " + sizes[i] + " valores el tiempo es de "
                            + (end - start) / 1e9 + " seg.");
                    break;
                case "SelectionSort":
                    start = System.nanoTime();
                    SelectionSort.sort(array);
                    end = System.nanoTime();
                    System.out.println(
                            "Selección: Con " + sizes[i] + " valores el tiempo es de " + (end - start) / 1e9 + " seg.");
                    break;
                case "InsertionSort":
                    start = System.nanoTime();
                    InsertionSort.sort(array);
                    end = System.nanoTime();
                    System.out.println(
                            "Inserción: Con " + sizes[i] + " valores el tiempo es de " + (end - start) / 1e9 + " seg.");
                    break;
                default:
                    System.out.println("Método de ordenamiento no válido.");
            }
        }
    }

    public static void measureBinarySearchTime() {
        int[] sizes = { 10, 100, 1000, 5000, 10000, 30000 };

        for (int i = 0; i < sizes.length; i++) {
            int[] array = ArrayGenerator.arrays[i].clone();
            InsertionSort.sort(array); // Ordenamos previamente para búsqueda binaria

            int target = array[array.length - 1]; // Último valor del arreglo
            long start, end;

            // Búsqueda Binaria Normal
            start = System.nanoTime();
            BinarySearch.binarySearch(array, target);
            end = System.nanoTime();
            System.out.println(
                    "Búsqueda Binaria Normal en arreglo de " + sizes[i] + ": " + (end - start) / 1e9 + " seg.");

            // Búsqueda Binaria Recursiva
            start = System.nanoTime();
            BinarySearch.recursiveBinarySearch(array, target, 0, array.length - 1);
            end = System.nanoTime();
            System.out.println(
                    "Búsqueda Binaria Recursiva en arreglo de " + sizes[i] + ": " + (end - start) / 1e9 + " seg.");
        }
    }
}
