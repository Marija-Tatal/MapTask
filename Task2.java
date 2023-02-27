package Class30.HW;

import java.util.Map;
import java.util.TreeMap;

/*
  2) Create a Person class with following private fields: name, lastName, age, salary.
     Variables should be initialized through constructor.
     Inside the class also create a method to print user details.
     In Test Class create a Map that will store key in ascending order.
     In that map store personId and a Person Object.
     Print each object details.*/
public class Task2 {
}

    class Person{

        private String name;
        private String lastName;
        private int age;
        private double salary;

        public Person(String name, String lastName, int age, double salary) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.salary = salary;
        }
        public void printUserDetails(){
            System.out.println("Name "+name+" Last Name "+lastName+" Age "+age+" Salary "+salary);

        }
    }
    class Test {
        public static void main(String[] args) {
            TreeMap<Integer, Person> person = new TreeMap<>();
            person.put(1547, new Person("Miya", "Dar", 29, 70000));
            person.put(2587, new Person("Yoshi", "Rey", 34, 150000));
            person.put(3688, new Person("Shima", "Warga", 35, 125000));
            person.put(1254, new Person("Taylor", "Smit", 33, 550000));


            var entrySet = person.entrySet();
            for (var entry : entrySet) {
                System.out.println("User ID " + entry.getKey());
                entry.getValue().printUserDetails();
            }

        }
    }
