package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> newList = new ArrayList<>();

        while (true) {
            System.out.print("Enter a word:");
            String word = scan.nextLine();
            newList.add(word);
            if (word.isEmpty()) {
                break;

            }
        }
        try {
            int wordList = newList.size() -1;
            System.out.println("The total amount of items in the list is " + wordList);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}






