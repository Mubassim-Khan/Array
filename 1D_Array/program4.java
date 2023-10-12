// Write a program to find the maximum and minimum element in an array

import java.util.*;

public class program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = scanner.nextInt();
        System.out.print("Enter elements in an array: ");

        int array[] = new int[size];

        // Storing elements in array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort array in asscending order
        Arrays.sort(array);
        scanner.close();

        System.out.println("Max element is: " + array[0] + "\nMin element is: " + array[size - 1]);
    }
}
