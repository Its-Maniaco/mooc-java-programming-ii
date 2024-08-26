
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

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

        double avg = inputs.stream() // create stream of ArrayList
                .mapToInt(s -> Integer.valueOf(s)) // take int values
                .average() // calc average
                .getAsDouble(); // get average as double
        System.out.println("average of the numbers: " + avg);
    }

}
