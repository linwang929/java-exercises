package org.launchcode.java.studios;

import java.util.Map;
import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. " +
                "Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, " +
                "non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. " +
                "Donec nec velit non ligula efficitur luctus.";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] charactersInString = myString.toLowerCase().toCharArray();
        HashMap<Character, Integer> counts = new HashMap<>();

        for (int i = 1; i < myString.length(); i++) {

            // Include only alphabetical characters
            if (alphabet.contains(myString.substring(i, i+1))) {
                if (counts.containsKey(charactersInString[i])) {
                    counts.replace(charactersInString[i], counts.get(charactersInString[i]) + 1);
                } else {
                    counts.put((charactersInString[i]), 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }
}
