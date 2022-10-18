package by.marchuk.task03.main;

import java.util.Scanner;

public class Counting{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        countLetters(s);
    }

    public static void countLetters(String s){
        if(s == null){
            System.out.println("The String not be null");
        }
        char[] ch = s.toCharArray();
        int amountVowels = 0;
        int amountConsonants = 0;
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                amountVowels++;
                amountConsonants = s.length() - amountVowels;
            }
        }
        System.out.println("Number of vowels is " + amountVowels);
        System.out.println("Number of consonants is " + amountConsonants);
    }
}
//        abba
//        Number of vowels is 2
//        Number of consonants is 2