
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        randomNumberGenerate(Integer.valueOf(scanner.nextLine()));
    }

    public static void randomNumberGenerate(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(new Random().nextInt(11));
        }
    }
}
