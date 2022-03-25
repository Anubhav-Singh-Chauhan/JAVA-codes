package com.company;

public class C14_PracticeProblem_8 {
    public static void main(String[] args) {
        int [][] A = {{10,11,12},
                      {13,14,15}};
        int [][] B = {{20,21,22},
                      {23,24,25}};
        int [][] Add={{0,0,0},
                      {0,0,0}};;

        for( int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                Add[i][j]=A[i][j]+B[i][j];
            }
        }

        for( int i=0;i<Add.length;i++){
            for(int j=0;j<Add[i].length;j++){
                System.out.print(Add[i][j]);
                System.out.print(" ");
            }
            System.out.printf("\n");
        }

    }
}
