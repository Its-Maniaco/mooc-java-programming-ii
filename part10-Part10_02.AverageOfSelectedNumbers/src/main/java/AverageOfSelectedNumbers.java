
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();

            if (row.equals("end")) {
                break;
            }
            inputs.add(row);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String row = scanner.nextLine();
        row = row.toLowerCase();
        double avg = 0.0;
        if (row.equals("n")) {
            avg = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s < 0)
                    .average()
                    .getAsDouble();

        } else if (row.equals("p")) {
            avg = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s > 0)
                    .average()
                    .getAsDouble();
        }

        if (avg > 0) {
            System.out.println("Average of the positive numbers: " + avg);
        } else {
            System.out.println("Average of the negative numbers: " + avg);
        }
    }

}
