package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Pattern {

    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String input = br.readLine();
        String input = "AKSHAYRAJ";
        int reverseIndex = input.length()-1;
        for(int i=0;i<input.length();i++) {
            for (int j = 0; j < input.length(); j++) {
                if (i == j) {
                    System.out.print(input.charAt(i));
                    continue;
                } else if (j == (input.length() - 1 - i)) {
                    if (i == (input.length() / 2) + 1) {
                        reverseIndex--;
                    }
                    System.out.print(input.charAt(reverseIndex));
                    reverseIndex--;
                    continue;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }
}
