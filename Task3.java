package Class30.HW;

import java.util.HashMap;
import java.util.Map;


public class Task3 {
    /*
     3)Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
     Output should be in the below format
     John Smith=$100000 */
    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();
        employees.put("Neman", 65000);
        employees.put("Mila", 70000);
        employees.put("Endy", 96000);
        employees.put("Yane", 41000);
        employees.put("Hanna", 58000);
        employees.put("Alexandar", 87000);

        var employee = employees.entrySet();
        String name = "";
        int highestSal = 0;
        for (var entry : employee) {
            if (entry.getValue() > highestSal) {
                highestSal = entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.println(name + "=$ " + highestSal);

    }
}
