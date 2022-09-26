package com.company;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double number1, number2,number3;
        double average;
        System.out.println("Enter three numbers:");
        number1=scan.nextDouble();
        number2=scan.nextDouble();
        number3 = scan.nextDouble();
        average=(number1+number2+number3)/3.0;
        System.out.println("Average is "+average);
    }

}
