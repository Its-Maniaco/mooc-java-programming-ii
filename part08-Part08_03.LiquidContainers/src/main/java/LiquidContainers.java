
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;
        int capacity = 100;

        while (true) {
            System.out.println("First: " + firstContainer + "/" + capacity);
            System.out.println("Second: " + secondContainer + "/" + capacity);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (input.equals("quit")) {
                break;
            }

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            // add
            if (command.equals("add")) {
                if (firstContainer + amount > capacity) {
                    firstContainer = capacity;
                } else if (amount > 0) {
                    firstContainer += amount;
                }

            }

            // move
            if (command.equals("move")) {
                if (amount + secondContainer > capacity) {
                    firstContainer -= amount;
                    secondContainer = capacity;
                } else if (amount > firstContainer) {
                    secondContainer += firstContainer;
                    firstContainer = 0;
                } else if (amount > 0) {
                    secondContainer += amount;
                    firstContainer -= amount;
                }

                if (secondContainer > capacity) {
                    secondContainer = capacity;
                }
                if (firstContainer < 0) {
                    firstContainer = 0;
                }

            }

            // remove
            if (command.equals("remove")) {
                if (amount > secondContainer) {
                    secondContainer = 0;
                } else if (amount > 0) {
                    secondContainer -= amount;
                }
            }

        }
    }

}