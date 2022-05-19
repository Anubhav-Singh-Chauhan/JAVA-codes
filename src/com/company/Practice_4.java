package com.company;

public class Practice_4 {
    public static void main(String[] args) {
        int A[]={2,9,6,7,5,9};
        for (int i=0;i<(A.length-1);i++){
            for (int j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                    int temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
        System.out.println("Array in increasing order");
        for (int i=0;i<A.length;i++) {
            System.out.println(" " + A[i]);
        }
        System.out.println("Third Largest Element is " + A[A.length-3]);

    }
}
