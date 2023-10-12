// Write a program to find the sum of all elements of the array. 

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = scanner.nextInt();
        System.out.println("Enter elements in an array: ");
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        scanner.close();

        System.out.print("Sum of elements is: " + sum);
    }
}
