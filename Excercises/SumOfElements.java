package com.company;

import java.util.ArrayList;

public class SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> someList=new ArrayList<>();
        someList.add(10);
        someList.add(12);
        someList.add(145);
        someList.add(123);

        System.out.println(sumOfElements(someList));
    }

    public static int sumOfElements(ArrayList<Integer> list){
        int sum=0;

        for(int i=0;i<list.size();i++){
            sum+= list.get(i);
        }


        return sum;
    }
}