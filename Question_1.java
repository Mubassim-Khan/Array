import java.util.Scanner;

abstract class countCounter {
    int count = 0;
    boolean isRunning;
    Scanner scanner = new Scanner(System.in);

    public void push() {
        System.out.println("Counter Started");
        count++;
        System.out.println("Current Count: " + count);
    }

    public void reset() {
        System.out.println("Counter Reset");
        count = 0;
        System.out.println("Current Count: " + count);
    }

    public void end() {
        System.out.println("Program ended");
        isRunning = false;
        scanner.close();
    }

    public void displayOptions() {
        System.out.println("\nClick Counter ADT\n");
        System.out.println("Press 'p' or type 'Push', 'push' to increment counter");
        System.out.println("Press 'r' or type 'Reset', 'reset' to reset counter");
        System.out.println("Press 'e' or type 'End', 'end' to end counter");
    }

    public String userInput() {
        System.out.print("\nEnter your choice: ");
        String userChoice = scanner.nextLine();
        return userChoice;
    }

    public void clickCounterMain() {
        while (isRunning = true) {
            displayOptions();
            switch (userInput()) {
                case "push", "Push", "p":
                    push();
                    break;

                case "reset", "Reset", "r":
                    reset();
                    break;

                case "end", "End", "e":
                    end();
                    break;

                default:
                    System.out.println("Enter proper input");
                    break;
            }
            if (isRunning == false) {
                break;
            }
        }
    }
}

public class Question_1 extends countCounter {
    public static void main(String[] args) {
        countCounter counter = new countCounter() {};
        counter.clickCounterMain();
    }
}