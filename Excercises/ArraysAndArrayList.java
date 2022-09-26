package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysAndArrayList {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        String name;
        int age;
        for(int i=0;i<5;i++){
            System.out.println("Enter a name");
            name=scan.nextLine();
            System.out.println("Enter a age");
            age=scan.nextInt();
            scan.nextLine();
            names.add(name);
            ages.add(age);
            System.out.println();
        }
        for(int i=0;i<ages.size();i++){
            System.out.println(names.get(i)+" is "+ages.get(i)+" years old ");
        }
    }
}
