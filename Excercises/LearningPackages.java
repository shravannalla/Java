package com.company;

import java.util.Scanner;

public class LearningPackages {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int packageNumber, howManyCourses, baseCost, costPerCourse, numIncluded, totalCost;
        System.out.println("Which package do you want? 1, 2, 3 ?");
        packageNumber=scan.nextInt();

        System.out.println("How many courses did you enroll in this month?");
        howManyCourses=scan.nextInt();

        if(packageNumber==1){
            baseCost=10;
            costPerCourse=6;
            numIncluded=2;
        }
        else if(packageNumber==2){
            baseCost=12;
            costPerCourse=4;
            numIncluded=4;
        }
        else{
            baseCost=15;
            costPerCourse=3;
            numIncluded=6;
        }

        //calculate total cost
        if(howManyCourses>numIncluded){
            totalCost=baseCost+(howManyCourses-numIncluded)*costPerCourse;
        }
        else{
            totalCost=baseCost;
        }

        System.out.println("Total cost is: $"+totalCost);
    }
}
