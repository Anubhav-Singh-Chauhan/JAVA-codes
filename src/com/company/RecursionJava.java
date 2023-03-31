public class RecursionJava {

    //print value in decreasing order using recursion
    public static void printValDec(int n)
    {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printValDec(n-1);
    }

    //print value in increasing order using recursion
    public static void printValInc(int n)
    {
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printValInc(n-1);
        System.out.print(n+" ");
        
    }
    public static void main(String[] args) {
        int n = 10;
        printValDec(n);
        printValInc(n);
    }
    
}
