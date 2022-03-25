package com.company;

public class C13_2dArrays {
    public static void main(String[] args) {
        int [][] arr = new int [2][3];
        arr[0][0]=10;
        arr[0][1]=11;
        arr[0][2]=12;
        arr[1][0]=13;
        arr[1][1]=14;
        arr[1][2]=15;

//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]);
//                System.out.print(" ");
//            }
//            System.out.print("\n");
//        }

        // Using For-each Loop
        for (int[] row : arr) {
            for (int column : row) {
                System.out.print(column);
                System.out.print(" ");
            }
            System.out.print("\n");
        }


    }
}
