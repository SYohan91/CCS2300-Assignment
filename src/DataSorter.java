
import java.util.*;

public class DataSorter {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== Data Sorter Menu =====");
            System.out.println("1. Enter Numbers Manually");
            System.out.println("2. Generate Random Numbers");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manualInput();
                    break;

                    case 2;
                    

                default:
                    break;
            }

        }
    }

    // MANUAL INPUT

    static void manualInput() {

        System.out.print("How many numbers do you want to enter? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {

            numbers[i] = scanner.nextInt();

        }
        // runAllSorts(numbers);
    }

    // RUN BUBBLE SORT ONLY

    static void runAllSorts(int[] originalArray) {
        // Clone arrays for fair comparison
        int[] bubbleArray = originalArray.clone();

        // Bubble Sort
        Long startBubble = System.nanoTime();
        BubbleSort.soft(bubbleArray);
        long endBubble = System.nanoTime();

        // OUTPUT
        System.out.println("\n===== Sorting Results =====");
        printArray(originalArray);

        System.out.println("\nBubble Sort Result:");
        printArray(bubbleArray);
        System.out.println("Execution Time: " + (endBubble - startBubble) + " ns");

        System.out.println("Time Complexity: O(n^2)");

    }

    // PRINT METHOD

    static void printArray(int[] arr) {
        for (int num : arr) {

            System.out.println(num + " ");
        }

    }
}