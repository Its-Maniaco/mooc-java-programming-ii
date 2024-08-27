
public class Checker {
    public boolean isDayOfWeek(String string) {
        String regex = "mon|tue|wed|thu|fri|sat|sun";
        if (string.matches(regex)) {
            System.out.println("The form is correct.");
            return true;
        }

        System.out.println("The form is incorrect.");

        return false;
    }

    public boolean allVowels(String string) {
        String regex = "[aeiou]*";
        if (string.matches(regex)) {
            System.out.println("The form is correct.");
            return true;
        }
        System.out.println("The form is incorrect.");

        return false;
    }

    public boolean timeOfDay(String string) {
        // (if?then|else)
        // https://www.regular-expressions.info/conditional.html
        String regex = "(?:[01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";
        if (string.matches(regex)) {
            System.out.println("The form is correct.");
            return true;
        }
        System.out.println("The form is not incorrect.");

        return false;
    }
}
