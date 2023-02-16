import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

    //insertion
    map.put("India",120);
    map.put("US",30);
    map.put("China",150);

    System.out.println(map);

    map.put("China",180); //update key value
    System.out.println(map);

    if(map.containsKey("China")){
        System.out.println("Present");

    }
    else{
        System.out.println("Not Present");
    }

    System.out.println(map.get("China"));
    System.out.println(map.get("Indonesia")); //not exist o/p->null

    //iterate hashmap

    for(Map.Entry<String, Integer> e: map.entrySet()){
        System.out.print("{" + e.getKey() + "," + e.getValue() + "}");
    }

    Set<String> keys = map.keySet();
    for(String key : keys)
    {
        System.out.println(key + " " + map.get(key));
    }

    //to remove any pair
    map.remove("China");
    System.out.println(map);
     
    }
}
