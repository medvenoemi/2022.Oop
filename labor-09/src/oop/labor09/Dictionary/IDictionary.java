package oop.labor09.Dictionary;

public interface IDictionary {
    public String DICTIONARY_FILE = null;
    boolean add(String word);
    boolean find(String word);
    int size();
}
