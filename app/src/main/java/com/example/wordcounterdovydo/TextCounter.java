package com.example.wordcounterdovydo;

public class TextCounter {
    public static int getCharsCount(String phrase) {
        return phrase.length(); // Returns the number of characters in the phrase
    }

    public static int getWordsCount(String phrase) {
        if (phrase == null || phrase.trim().isEmpty()) {
            return 0; // Return 0 if the string is empty or only whitespace
        }

        String[] words = phrase.trim().split("\\s+");
        int wordCount = 0;
        for (String word : words) {
            // Check if the word contains alphabetic letters or digits
            if (word.matches("[a-zA-Z0-9]+")) {
                wordCount++;
            }
        }
        return wordCount;
    }
}
