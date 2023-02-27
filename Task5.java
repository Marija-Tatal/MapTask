package Class30.HW;

import java.util.ArrayList;
import java.util.List;

/*
       Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
        */
public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        int sum=0;
        for(Integer n:numbers){
            sum+=n;
        }
        System.out.println(sum);
    }
    }

