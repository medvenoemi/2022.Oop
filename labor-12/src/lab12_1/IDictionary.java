package lab12_1;

public interface IDictionary {
    static final String DICTIONARY_FILE = "bible.txt";
    boolean add(String word);
    boolean find(String word);
    int size();
}
