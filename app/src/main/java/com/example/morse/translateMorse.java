package com.example.morse;

import android.util.Log;

import java.lang.String;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class translateMorse{

    static String[] alphaTable = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M","N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    static String[] morseTable = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public static HashMap<String,String> alphaToMorse = new HashMap<>();



    public String translate(String text)
    {
        StringBuilder builder = new StringBuilder();
        String[] words = text.trim().split("");
        for(int i = 0; i < alphaTable.length; i++)
        {
            alphaToMorse.put(alphaTable[i],morseTable[i]);
        }
        for(String word : words){
            for(int index = 0; index < word.length(); index++){
                String character = String.valueOf(word.charAt(index));
                if(alphaToMorse.containsKey(character)){
                    String morseValue = alphaToMorse.get(character);
                    builder.append(morseValue);
                }
                builder.append(" ");
            }
        }



        return builder.toString();
    }

}

