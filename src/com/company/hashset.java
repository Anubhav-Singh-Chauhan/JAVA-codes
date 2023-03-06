import java.util.*;
public class hashset {
    public static void main(String[] args) {
        // HashSet <Integer> hs = new HashSet<>();
        // hs.add(2);
        // hs.add(3);
        // hs.add(2);
        // hs.add(5);
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        // hs.add(2);
        Set<Integer> set = new HashSet<>();
        
        for(int i=0;i<nums.length;i++) set.add(nums[i]);

        List<Integer> arr = new ArrayList<>(set);

         Collections.sort(arr, Collections.reverseOrder());
         System.out.println(arr);
         System.out.println(set);

         System.out.println(arr.get(k-1));

        // if(hs.contains(2)){
        //     System.out.println("set contains 1");
        // }
        // if(!hs.contains(6)){
        //     System.out.println("Does not contain");
        // }

        //deletion in set
        // hs.remove(2);
        // if(!hs.contains(2)){
        //     System.out.println("doesn't contain 2");
        // }

        //set size
        // System.out.println(hs.size());
        
 
        // Iterator it = hs.iterator();  //null->first element->second element->third
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

    }
}
