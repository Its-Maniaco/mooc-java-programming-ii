import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        // now retrieve the list and just add to that
        ArrayList<String> translations = this.dictionary.get(word);
        translations.add(translation);
    }

    public ArrayList<String> translate(String word) {
        return this.dictionary.get(word) != null ? this.dictionary.get(word) : new ArrayList<String>();
    }

    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
