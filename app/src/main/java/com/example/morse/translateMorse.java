package com.example.morse;

import android.util.Log;

import java.lang.String;
import java.util.HashMap;

public class translateMorse{

    static String[] alphaTable = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "O", "P", "Q", "R", "S", "T", "U", "W", "X", "Y", "Z"};
    static String[] morseTable = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--"};

    public static HashMap<String,String> alphaToMorse = new HashMap<>();


    public String translate(String text)
    {
        StringBuilder builder = new StringBuilder();
        String[] words = text.trim().split("");
        for(int i = 0; i < alphaTable.length; i++)
        {
            alphaToMorse.put(alphaTable[i],morseTable[i]);
            //TODO: how to compare two char?
        }

         return builder.toString();
    }

}

