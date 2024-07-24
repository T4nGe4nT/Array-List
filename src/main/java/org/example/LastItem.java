package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> newList = new ArrayList<>();

        while (true) {
            System.out.print("Enter a word:");
            String word = scan.nextLine();

            if (word.isEmpty()) {
                String lastWord = newList.get(newList.size() - 1);
                System.out.println("The last item in the list is: " + lastWord);
                break;
            } else {
                newList.add(word);
            }

        }
    }
}

