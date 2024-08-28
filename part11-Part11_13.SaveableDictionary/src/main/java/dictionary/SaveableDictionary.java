package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public void add(String words, String translation) {
        // if same word, nothing
        if (this.dictionary.get(words) != null) {
            return;
        }
        this.dictionary.put(words, translation);
    }

    public String translate(String word) {
        // if word doesnt match key, look if it matches translation
        if (this.dictionary.get(word) == null) {
            for (String key : this.dictionary.keySet()) {
                if (this.translate(key).equals(word)) {
                    return key;
                }
            }
        }
        // key is matched with word so return it.
        return this.dictionary.get(word);
    }

    public void delete(String word) {
        // if word doesnt match key, look if it matches translation
        if (this.dictionary.get(word) == null) {
            for (String key : this.dictionary.keySet()) {
                if (this.translate(key).equals(word)) {
                    this.dictionary.remove(key);
                }
            }
        }
        this.dictionary.remove(word);
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(this.file))) {
            while (fileReader.hasNext()) {
                String row = fileReader.nextLine();
                String[] parts = row.split(":");
                // if a word doesnt have translation.
                if (parts.length < 2) {
                    continue;
                }
                this.add(parts[0], parts[1]);
                // System.out.println(parts[0]);
                // System.out.println(parts[1]);
            }

            return true;
        } catch (Exception e) {
            System.out.println("Error in load.");
            System.out.println(e);
            return false;
        }
    }

    // should handle case if word exists/doesnt in file instead of creatiqng a new
    // file
    // should fix the last test case giving error ConcurrentModificationException
    public boolean save() {
        // creates a new file
        try (PrintWriter writer = new PrintWriter(new File(this.file))) {
            // if file doesnt exist, create
            for (String key : this.dictionary.keySet()) {
                System.out.println("Saving key: " + key);
                System.out.println(key + ":" + this.dictionary.get(key));
                writer.println(key + ":" + this.translate(key));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error in save");
            return false;
        }

        return true;
    }

}
