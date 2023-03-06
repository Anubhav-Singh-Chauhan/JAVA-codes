import java.util.*;
public class treeMap {
    public static void main(String[] args) {
        TreeMap <Integer,String> map = new TreeMap<>();
        // TreeMap <Integer,String> map = new TreeMap<>(Collections.reverseOrder());

        map.put(2, "A");
        map.put(1,"B");
        map.put(0,"C");

        System.out.println(map);

        for(Map.Entry m:map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
           } 

           map.remove(1); 

             //Maintains descending order  
        //    System.out.println("descendingMap: "+map.descendingMap()); 

        for (int key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        System.out.println(map.containsValue("B"));
        System.out.println("Lowest entry is: " + map.firstEntry());
        System.out.println("Lowest key is: "+ map.firstKey());


    }
}
