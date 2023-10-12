// Write a program to read n number of values in an array and display it in reverse order.

import java.util.*;

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = scanner.nextInt();
        System.out.print("Enter elements in an array: ");
        int array[] = new int[size];
        int temp;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        // Swapping elements back & forth
        for (int i = 0; i < size; i++, size--) {
            temp = array[i];
            array[i] = array[size - 1];
            array[size - 1] = temp;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
