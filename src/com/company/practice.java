import java.util.*;
import java.lang.*;

public class practice {
    public static void main(String[] args) {
    //     String s = "anagram";
    //     String t = "nagaram";

    //     char[] arr1 = s.toCharArray();
    //     char[] arr2 = t.toCharArray();

    //     Arrays.sort(arr1);
    //     Arrays.sort(arr2);

    //    StringBuilder sb1 = new StringBuilder();
    //    StringBuilder sb2 = new StringBuilder();
 
    //     for (int i = 0; i < arr1.length; i++) {
    //         sb1.append(arr1[i]);
    //     }

    //     for (int j = 0; j < arr2.length; j++) {
    //         sb2.append(arr2[j]);
    //     }

    //     System.out.println(sb1 + "   " + sb2);
    //     if(sb1.equals(sb2)){
    //         System.out.println("equal");
    //     }else{
    //         System.out.println("not equal");
    //     }


    // String s ="is2 sentence4 This1 a3";
    // List <String> list = new ArrayList<>();
    //     for(String x : s){
    //         int n = x.length();
    //             char temp = x.charAt(0);
    //             x.charAt(0)=x.charAt(n-1);
    //             x.charAt(n-1)=temp;
    //             list.add(x);
    //     }
    //     Collections.sort(list);
    // String [] words = {"gin","zen","gig","msg"};
    // String s[] ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    //     List<String> list = new ArrayList<>();

    //     for(int i=0;i<words.length;i++){
    //         String str = words[i];
    //         for(int j=0;j<str.length();i++){
    //             int x = (int) (str.charAt(j) - 'a');
    //             list.add(s[x]);
    //         }
    //     }

    //     Set<String> map = new HashSet<>();

    //     for(String k : list){
    //         map.add(k);
    //     }


    //     System.out.println(map.size());

    // String s = "abc6abcbb2314";
    // char[] ch = s.toCharArray();
    // Arrays.sort(ch);
    // System.out.println(ch);
        
        // String str = "" + s.charAt(0);
        
        // for(int i=1;i<s.length();i++){
        //     // str += s.charAt(i);   
        //     char c = s.charAt(i);
        //     String str1 = Character.toString(c);
            
        //     if(!str.contains(str1)){
        //         str += s.charAt(i);
        //     }
        // }
        // System.out.println(str);
        // System.out.println(str.length());
    //     int n = 9;
    //    for(int i=2;i<=n-2;i++){
    //        StringBuffer sb = new StringBuffer();
    //        StringBuffer sb1 = new StringBuffer();
    //        String ans = baseConversion(String.valueOf(n), 10, i);
    //        sb.append(ans);
    //        sb.reverse();
    //        String str = sb.toString();
    //        if(ans.equals(str)){
    //            System.out.println(ans + "+" + str);
    //        }else{
    //         System.out.println(ans + "+" + str);
    //        }
            
    //    }
        
        
    // }
    // public static String baseConversion(String number, int sBase, int dBase)
    // {
    //     return Integer.toString(Integer.parseInt(number, sBase), dBase);
    // }

    int height[] = {1,8,6,2,5,4,8,3,7};
    int y = height.length-1;
        int ans = 0;
        for(int i=0;i<height.length;i++){
            while(i<y){
                int x = Math.min(height[y],height[i]);
                ans = Math.max(ans,x*x);
            }
        }
        System.out.println(ans);
    }
    }
    
