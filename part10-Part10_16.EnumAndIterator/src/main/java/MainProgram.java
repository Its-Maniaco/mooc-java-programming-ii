
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        /*
         * Employees t = new Employees();
         * Person h = new Person("Arto", Education.PHD);
         * t.add(h);
         * Person h2 = new Person("Pekka", Education.HS);
         * t.add(h2);
         * t.print(Education.PHD);
         */

        Employees t = new Employees();
        Person h = new Person("Arto", Education.PHD);
        t.add(h);
        h = new Person("Pekka", Education.BA);
        t.add(h);
        h = new Person("Matti", Education.PHD);
        t.add(h);
        t.fire(Education.PHD);
        t.print();
    }
}
