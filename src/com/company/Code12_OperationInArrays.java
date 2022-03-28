package com.company;

public class Code12_OperationInArrays {
    public static void main(String[] args) {
        float [] arr={1.1f,23.5f,11.3f,12.0f,10.10f,5.5f,6.9f};
        System.out.println("length of array is:" + arr.length);

//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

        //Printing using For-each loop
        for (float v : arr) {
            System.out.println(v);
        }

    }
}
