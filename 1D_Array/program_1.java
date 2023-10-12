// Write a program to store elements in an array and print it

import java.util.Scanner;

public class program_1 {
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
        scanner.close();

        // To Print elements
        System.out.print("Stored Elements in Array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}