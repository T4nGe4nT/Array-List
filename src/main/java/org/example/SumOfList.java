package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
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
        int sum = 0;
        for (Integer integer : list) {
            System.out.print(integer + ", " );
            sum += integer;
            }
        System.out.println("The sum of all the numbers is: " + sum);

        }
    }


