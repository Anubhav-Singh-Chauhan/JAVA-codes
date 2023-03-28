public class BitManipulation {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }

    public static int getIthBit(int n,int i)
    {
        int bitMask = 1<<i;
        if((n & bitMask)==0)
        {
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n,int i)
    {
        int bitMask = 1<<i;
         int num = (n|bitMask);
         return num;
    }

    public static int clearIthBit(int n,int i)
    {
        int bitMask = ~(1<<i);
         int num = (n&bitMask);
         return num;
    }

    public static int updateIthBit(int n,int i, int newBit)
    {
        // if(newBit==0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static int clearLastIbits(int n,int i)
    {
        int bitMask = (~0)<<i;
        return n&bitMask;
    }

    public static int clearRangeOfBits(int n,int i,int j)
    {
         int a = (~0)<<(j+1);
         int b= (1<<i)-1;

         int bitMask = a|b;

         return n&bitMask;
    }

    public static void main(String[] args) {
        System.out.println(5 & 6); // Binary AND
        System.out.println(5 | 6); // Binary OR
        System.out.println(5 ^ 6); // Binary XOR
        System.out.println(~5); // Binary 1s compliment
        System.out.println(5 << 2); // Binary Left Shift
        System.out.println(6 >> 1); // Binary Righ Shift

        // Q1 CHECK IF NUMBER IS EVEN OR ODD
        // for even no. LSB is 0 and fro odd no. LSB is 1
        // --------------------------------------------------------------------------------
        oddOrEven(3);
        oddOrEven(133);
        oddOrEven(84);
        // --------------------------------------------------------------------------------

        // checking ith bit of any binary number
        System.out.println(getIthBit(10, 3));
        System.out.println(getIthBit(4, 4));
        //---------------------------------------------

        // get ith bit in any binary number
        System.out.println(getIthBit(10, 3));
        System.out.println(getIthBit(4, 4));
        //---------------------------------------------

        // set ith bit in any binary number
        System.out.println(setIthBit(10, 2));

        //---------------------------------------------

        //clearIthBit
        System.out.println(clearIthBit(10, 1));

        //----------------------------------------------

        //updateIthBit
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(updateIthBit(10, 1, 0));

        //-------------------------------------------------

        //clearLastIBits
        System.out.println(clearLastIbits(15, 2));

        //-------------------------------------------------

        //clearRangeOfBits
        System.out.println(clearRangeOfBits(1363, 2, 7));

    }
}
 