package com.example.morse;

import java.lang.String;
import java.util.HashMap;

/*
        TRANSLATE WORDS TO MORSE CODE
        ============================
        author: SB
        date: 27 february A.D.2020
*/


public class translateMorse{
    // Create string array of two types: english alphabet, morse alphabet
    static String[] alphaTable = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M","N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    static String[] morseTable = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    // Create Hashmap of strings
    public static HashMap<String,String> alphaToMorse = new HashMap<>();
    //==============================================================================================

    public String translate(String text)
    {
        StringBuilder builder = new StringBuilder();
        // replace strings to array format
        String[] words = text.trim().split("");

        // input values to hashmap
        for(int i = 0; i < alphaTable.length; i++)
        {
            alphaToMorse.put(alphaTable[i],morseTable[i]);
        }

        // for every char in word
        for(String word : words){
            for(int index = 0; index < word.length(); index++){
                // grab single char to a variable
                String character = String.valueOf(word.charAt(index));
                // compare char to key of hashmap
                if(alphaToMorse.containsKey(character)){
                    // if true - get value of key (key is char) and append value to output string
                    String morseValue = alphaToMorse.get(character);
                    builder.append(morseValue);
                }
                builder.append(" ");
            }
        }
        return builder.toString();
    }
    //==============================================================================================
}

