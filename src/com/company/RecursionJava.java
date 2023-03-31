public class RecursionJava {

    public static void printValDec(int n)
    {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printValDec(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printValDec(n);
    }
    
}
