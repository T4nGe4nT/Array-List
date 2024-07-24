package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while (true){
            System.out.print("Enter a word:");
            String word = scanner.nextLine();
            list.add(word);
            if (word.isEmpty()) {
                break;
            }
        }
        try {
            System.out.println("The fifth item is " + list.get(5));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }






    }


}
