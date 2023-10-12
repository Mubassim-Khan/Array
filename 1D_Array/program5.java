// Write a program to separate odd and even integers in separate arrays.

import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenSize = 0, oddSize = 0;
        System.out.print("Enter size of an array: ");
        int size = scanner.nextInt();
        System.out.print("Enter elements in an array: ");

        int array[] = new int[size];

        // Storing elements in array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0) {
                evenSize++;
            } else {
                oddSize++;
            }
        }
        scanner.close();

        // Initialized array for both even & odd numbers
        int evenArray[] = new int[evenSize];
        int oddArray[] = new int[oddSize];

        // Iterate over array & add even, odd elements in respective array
        int j = 0, k = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                evenArray[j++] = array[i];
            } else {
                oddArray[k++] = array[i];
            }
        }

        // Print array
        System.out.println("Even elements are: ");
        for (int i : evenArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nOdd elements are: ");
        for (int i : oddArray) {
            System.out.print(i + " ");
        }
    }
}