package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        // SaveableDictionary s = new SaveableDictionary("word-6943.txt");
        // s.load();
        // s.delete("below");
        // s.add("tieokone", "computer");
        // s.save();

        SaveableDictionary s = new SaveableDictionary("words.txt");
        s.load();
        System.out.println(s.translate("apina"));
    }
}
