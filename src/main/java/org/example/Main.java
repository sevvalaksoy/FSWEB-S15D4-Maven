package org.example;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        WorkintechList list = new WorkintechList();
        list.add("Mehmet");
        list.add("Mehmet");
        list.add("Ali");
        list.add("Ali");
        list.add("Zeynep");
        list.add("Zeynep");
        System.out.println(list.size());
        convertDecimalToBinary(13);
        checkForPalindrome("I did, did I?");

    }
    public static boolean checkForPalindrome(String sentence){
        sentence = sentence.trim().replaceAll("[^a-zA-Z]+", "").toLowerCase();
        char[] list = sentence.toCharArray();
        for(int i = 0; i < Math.floor(list.length/2); i++){
            if(list[i]==list[list.length-i-1]){
                continue;
            } else System.out.println("false"); return false;
        }
        System.out.println("true");
        return true;
    }
    public static String convertDecimalToBinary(int num){
        List<Integer> binary = new LinkedList<>();
        do{
            binary.add(num % 2);
            num = Math.floorDiv(num, 2);
        } while(num>0);
        StringBuilder result = new StringBuilder();
        for( int i = binary.size()-1; i>=0; i--){
            result.append(binary.get(i));
        }
        System.out.println(result);
        return String.valueOf(result);
    }
}