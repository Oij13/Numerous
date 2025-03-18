package edu.bsu.cs;

import java.util.Scanner;

public class Converter {
    public String convert(int number){
        StringBuilder result = new StringBuilder();

        int [] numbers = {10,9,5,4,1};
        String [] roman = {"X","IX","V","IV","I"};

        for (int i = 0; i < numbers.length; i++){
            while (number >= numbers[i]){
                result.append(roman[i]);
                number -= numbers[i];
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter a number up to 13000");
        int num = scn.nextInt();
        System.out.println(num);


    }

}