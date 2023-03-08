import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();

        st.push(23);
        st.push(12);
        st.push(990);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
    
}
