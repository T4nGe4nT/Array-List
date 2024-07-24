package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("Enter an integer ( 0 to end.): ");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Done adding integers to the list.");
                break;
            } else {
                list.add(number);
            }
        }
        System.out.println("What number are you looking for?");
        int num = scanner.nextInt();

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == num) {
                System.out.println(num + " is at index " + i);
            }

        }
    }
}
