import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = initArray(scanner);
        Arrays.sort(array);
        search(scanner, array);
    }

    private static void search(Scanner scanner, int[] array) {
        System.out.print("Enter number search in array : ");
        int value = scanner.nextInt();
        int index = binarySearch(array, 0, (array.length - 1), value);
        if (index != -1) {
            System.out.println("Find " + value + " at " + index);
        } else {
            System.out.println("Not found!!");
        }
    }

    public static int binarySearch(int[] array, int low, int high, int value) {
        int mid = (low + high) / 2;
        if (high >= low) {
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value) {
                return binarySearch(array, low, (mid - 1), value);
            } else if (array[mid] < value) {
                return binarySearch(array, (mid + 1), high, value);
            }
        }
        return -1;
    }

    private static int[] initArray(Scanner scanner) {
        System.out.println("Enter size : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            int element = scanner.nextInt();
            array[i] = element;
        }
        return array;
    }
}
