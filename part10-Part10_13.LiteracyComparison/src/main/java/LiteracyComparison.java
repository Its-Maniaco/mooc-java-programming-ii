
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<String> res = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(",")) // break the row around comma
                    .sorted((a, b) -> a[5].compareTo(b[5])) // sort based on comparator
                    .forEach(row -> System.out
                            .println(row[3] + " (" + row[4] + "), " + row[2].split(" ")[1].trim() + ", " + row[5])); // print in required format
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
