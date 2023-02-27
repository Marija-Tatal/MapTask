package Class30.HW;

import java.util.LinkedHashSet;
import java.util.Set;

/*
4)Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.

 */
public class Task4 {
    public static void main(String[] args) {
        Set<String> strings=new LinkedHashSet<>();
        strings.add("I");
        strings.add("want");
        strings.add("to");
        strings.add("learn");
        strings.add("Java");
        strings.add("all day");

        for(String s:strings){
            System.out.print(s+" ");
        }
    }
}
