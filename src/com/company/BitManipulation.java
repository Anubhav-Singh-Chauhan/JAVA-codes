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

        // set ith bit in any binary number
        System.out.println(getIthBit(10, 3));
        System.out.println(getIthBit(4, 4));
        //---------------------------------------------
        System.out.println(setIthBit(10, 2));

    }
}
 