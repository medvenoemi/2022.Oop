package lab12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TreeSetDictionary implements IDictionary {

    private ArrayList<String> words = new ArrayList<>();
    private static TreeSetDictionary instance = null;

    private TreeSetDictionary() {
        try (Scanner sc = new Scanner(new File("inputFiles/" + DICTIONARY_FILE))) {
            String temp;
            String[] temp2;
            while (sc.hasNextLine()) {
                temp = sc.nextLine();
                temp2 = temp.split(" ");
                for (int i = 0; i < temp2.length; i++) {
                    words.add(temp2[i].trim());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static IDictionary newInstance() {
        if (instance == null) {
            instance = new TreeSetDictionary();
        }
        return instance;
    }

    //Methods

    @Override
    public boolean add(String string) {
        words.add(string);
        return true;
    }

    @Override
    public boolean find(String string) {
        for (String item : words) {
            if (item.equals(string)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return words.size();
    }




}
