

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise

        Checker check = new Checker();
        check.timeOfDay("00:00:00");
        check.timeOfDay("23:00:00");
        check.timeOfDay("23:59:59");
        check.timeOfDay("10:24:00");
        
        check.timeOfDay("27:59:59");
        check.timeOfDay("23:62:59");

        check.timeOfDay("ab:59:59");

        
    }
}
