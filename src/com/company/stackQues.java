import java.util.*;
public class stackQues {

//  1      // Q1 PUSH AT THE BOTTOM OF THE STACK (***AMAZON***)

    // public static void func(Stack <Integer> st , int x){
    //     if(st.empty()){
    //         st.push(x);
    //         return;
    //     }
    //     int i = st.pop();
    //     func(st, x);
    //     st.push(i);
    // }
    // public static void main(String[] args) {
    //     Stack <Integer> st = new Stack<>();
    //     int x  = 4;
    //     st.push(1);
    //     st.push(2);
    //     st.push(3);
    //     func(st,x);
    //     while(!st.isEmpty()){
    //         System.err.println(st.pop());
    //     }
    // }
    

//  2  // Q2 REVERSE A STRING USING STACK

    // public static void main(String[] args) {

    //     String str = "abcdef";
    //     Stack<Character> st = new Stack<>();
    //     int idx = 0;
    //     while(idx<str.length())
    //     {
    //         st.push(str.charAt(idx++));
    //     }
    //     StringBuilder result = new StringBuilder();
    //     while(!st.isEmpty())
    //     {
    //         result.append(st.pop());
    //     }
    //     str=result.toString();
    //     System.out.println(str);
    // }


// 3
//         // Q3 REVERSE A STACK

// public static void func1(Stack <Integer> st , int x){
//     if(st.empty()){
//         st.push(x);
//         return;
//     }
//         int i = st.pop();
//         func1(st, x);
//         st.push(i);
//     }

//     public static void func2(Stack <Integer> st){
//         if(st.empty()){
//             return;
//         }
//         int top = st.pop();
//         func2(st);
//         func1(st, top);
//     }

//     public static void main(String[] args) {
//         Stack <Integer> st = new Stack<>();
//         st.push(1);
//         st.push(2);
//         st.push(3);
//         func2(st);
//         while(!st.isEmpty()){
//             System.err.println(st.pop());
//         }
// }


//  4    //Q4 STOCK SPAN PROBLEM  
public static void main(String[] args) {
    int stock[] = {100,80,60,70,60,85,100};
    int span[] = new int[stock.length];
    Stack <Integer> st = new Stack<>();

    span[0]=1;
    st.push(0);

    for(int i=1;i<stock.length;i++){
        int curr = stock[i];

        while(!st.isEmpty() && curr > stock[st.peek()]){
            st.pop();
        }
        if(st.isEmpty()){
            span[i] = i+1;
        }else{
            span[i] = i - st.peek();
        }
        st.push(i);
    }


    for(int x : span){
        System.out.print(x + " ");
    }


}
    
}
