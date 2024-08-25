
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] inputParts = input.split(" ");
            String cmd = inputParts[0];
            int amnt = Integer.valueOf(inputParts[1]);

            if (cmd.equals("add")) {
                first.add(amnt);
            }

            if (cmd.equals("remove")) {
                second.remove(amnt);
            }

            if (cmd.equals("move")) {
                if (amnt > first.contains()) {
                    second.add(first.contains());
                    first.remove(amnt);
                } else {
                    first.remove(amnt);
                    second.add(amnt);
                }

            }
        }
    }

}
