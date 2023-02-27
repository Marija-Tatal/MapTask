package Class30.HW;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
         /*
       Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
         */

        Map<Integer,String> store= new HashMap<>();
        store.put(10000,"Printer");
        store.put(30000,"Apple Watch");
        store.put(20000,"MacBook Pro");
        store.put(70000,"Ipad Probook");
        store.put(40000,"Samsung TV");

        var entrySet=store.entrySet();
        for (var entry:entrySet){
            System.out.println(entry.getKey()+ "="+entry.getValue());
        }
    }
}
