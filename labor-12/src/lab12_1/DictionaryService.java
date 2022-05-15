package lab12_1;

import java.util.ArrayList;

import static lab12_1.DictionaryProvider.createDictionary;
public class DictionaryService {

    private IDictionary dictionary;


    public DictionaryService(DictionaryType dtype) {
        dictionary = createDictionary(dtype);
    }

    public boolean findWord(String a) {
        return dictionary.find(a);
    }

    public ArrayList<String> findWordsFile(String a) {
        return null;
    }
}
