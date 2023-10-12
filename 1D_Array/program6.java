// Write a program that takes as input a list of characters in an array and count the number of vowels in the array.

import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vowelCount = 0;
        System.out.print("Enter your sentence: ");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        scanner.close();

        // Count each character from input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Total numbers of vowels are: " + vowelCount);
    }
}
