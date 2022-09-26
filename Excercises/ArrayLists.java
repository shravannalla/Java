package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> newList=new ArrayList<>();
        double input;
        System.out.println("Enter any number greater than 0:");
        input= scan.nextDouble();
        while(input>=0){
            newList.add(input);
            System.out.println("Enter any number greater than 0:");
            input= scan.nextDouble();
        }
        for(int i=newList.size()-1;i>=0;i--){
            System.out.println(newList.get(i));
        }

    }

}
