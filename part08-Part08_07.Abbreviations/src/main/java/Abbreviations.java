import java.util.HashMap;

public class Abbreviations {
    HashMap<String, String> abbreviations = new HashMap<>();

    public Abbreviations() {
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = sanitizeStrings(abbreviation);
        explanation = sanitizeStrings(explanation);
        if (abbreviation.isEmpty() || explanation.isEmpty()) {
            System.out.println("Missing abbreviation or explanation");
            return;
        }

        this.abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(abbreviation);
    }

    private static String sanitizeStrings(String input) {
        if (input == null) {
            return "";
        }
        input = input.trim();
        return input.toLowerCase();
    }
}
