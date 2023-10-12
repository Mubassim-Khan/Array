// Define a 1D array and fill it with randomly generated numbers.

import java.util.Random;

public class program7 {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[8];

        // Storing random elements in array
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        // Printing that array
        System.out.println("Random numbers stored in array are: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
