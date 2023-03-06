import java.util.*;

public class hashingQues {
    // Majority Element
    // Q1 given an integer array of size n, find all elements that appaear more than
    // n/3 times. E.g -> nums[]={1,3,2,5,1,3,1,5,1} majority element is 1.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);  //map.get(key) gives value to corresponding key
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(int key : map.keySet())
        {
            if(map.get(key)>(n/3)){
                System.out.println(key);
            }  
        }

    }

}
