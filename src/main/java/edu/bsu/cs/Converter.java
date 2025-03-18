package edu.bsu.cs;

import java.util.Scanner;

public class Converter {
    public static String convert(int number){
        StringBuilder result = new StringBuilder();

        if (number < 1 || number > 3000){
            System.out.println("Please enter a number between 1 and 3000 next time!");
        } else {
            int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            for (int i = 0; i < numbers.length; i++) {
                while (number >= numbers[i]) {
                    result.append(roman[i]);
                    number -= numbers[i];
                }
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter a number up to 3000");
        int number = scn.nextInt();
        String con = convert(number);
        System.out.println(con);


    }


}