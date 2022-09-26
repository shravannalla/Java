package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationWithNames {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<String> firstNames=new ArrayList<>();
        ArrayList<String> lastNames=new ArrayList<>();
        String fullName;
        String firstName;
        String lastName;
        int indexOfSpace;
        int NUM_OF_NAMES=5;
        for(int i=0;i<NUM_OF_NAMES;i++){
            System.out.println("Enter the fullname "+i);
            fullName= scan.nextLine();
            indexOfSpace=fullName.indexOf(" ");
            firstName=fullName.substring(0,indexOfSpace);
            lastName=fullName.substring(indexOfSpace+1);
            firstNames.add(firstName);
            lastNames.add(lastName);
        }
        for(int i=0;i< firstNames.size();i++){
            for(int j=0;j< firstNames.size();j++){
                System.out.print(firstNames.get(i)+" ");
                System.out.println(lastNames.get(j));
            }
        }
    }
}
