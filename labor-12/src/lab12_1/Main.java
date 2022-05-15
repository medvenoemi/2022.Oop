package lab12_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DictionaryService service = new DictionaryService(DictionaryType.ARRAY_LIST);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Word to find (Enter <end> for exit): ");
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("end")) {
                break;
            }
            System.out.println(" Find(" + word + "): " + service.findWord(word));
        }
        scanner.close();
    }
}
