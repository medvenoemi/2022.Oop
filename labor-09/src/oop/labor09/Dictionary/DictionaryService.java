package oop.labor09.Dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryService {
    private IDictionary dictionary ;

    public DictionaryService(DictionaryType dictionaryType){

    }
    public boolean findWord(String word){
        try(Scanner scanner = new Scanner(new File("Dictionary.txt"))){
            while( scanner.hasNextLine() ){
                String line = scanner.nextLine();
                if( line.isEmpty() ){
                    continue;
                }
                if(word.equals(line)){
                    return true;
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<String> findWordsFile(String file_name){
        ArrayList<String> Unknown_words= new ArrayList<String>();
        try(Scanner scanner = new Scanner(new File(file_name))){
            while( scanner.hasNextLine() ){
                String line = scanner.nextLine();
                if( line.isEmpty() ){
                    continue;
                }
                String[] items = line.split(" ");
                for(int i=0;i<items.length;i++){
                    if(findWord(items[i])!=true){
                        Unknown_words.add(items[i]);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return Unknown_words;
    }
}
