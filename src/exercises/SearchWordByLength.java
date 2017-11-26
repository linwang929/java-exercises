package exercises;

import java.util.Scanner;
import java.util.ArrayList;

public class SearchWordByLength {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> wordsByLength = new ArrayList<>();
        int length;
        String newWord;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your list of words (or ENTER to finish):");
        do {
            newWord = in.nextLine();
            if (!newWord.equals("")) {
                words.add(newWord);
            }
            } while (!newWord.equals(""));

        System.out.println("Please specify the length of words you want to find:");
        length = in.nextInt();

        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
