package com.selfcode;

public class Main {

    public static void main(String[] args) {
        String word1 = "restful";
        String word2 = "fluster";
        Anagram anagram = new Anagram();

        if(anagram.Evaluate(word1,word2)) {
            System.out.println("Yes. It's anagram");
        }else{
            System.out.println("No ");
        }
    }
}
