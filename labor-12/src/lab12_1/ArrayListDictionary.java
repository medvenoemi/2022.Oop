package lab12_1;

import java.util.ArrayList;

public class ArrayListDictionary implements IDictionary{

    private ArrayList<String> words ;
    private static ArrayListDictionary instance ;


    private ArrayListDictionary(){
        this.words = null;
    }

    public static IDictionary newInstance(){
        return instance;
    }

    public int size(){
        return words.size();
    }

    public boolean add(String word){
        if(find(word)==false){
            words.add(word);
            return true;
        }
        return false;
    }

    public boolean find(String word){
        for(int i=0; i<words.size(); i++){
            if(word.equals(words.get(i))){
                return true;
            }
        }
        return false;
    }

}
