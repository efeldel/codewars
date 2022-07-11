package convertstrings;

import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Scanner;

class Solution{

    static String toCamelCase(String s){
        String newString = "";
        String[] words = s.split("-|_");
        for (int i = 1; i < words.length; i ++) {
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        }
        for (String word : words)
            newString += word;
        return newString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(toCamelCase(sc.nextLine()));
    }
}
