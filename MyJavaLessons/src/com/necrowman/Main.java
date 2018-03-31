package com.necrowman;
import java.sql.Timestamp;
import java.security.cert.CertPath;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.calculateSqureNumber(4);
        obj.calculateNums(new int [] {1, 2, 3, 2, 1});
        obj.calculateNums(new int [] {1, 2, 3, 5, 1});
        obj.calculateNums(new int [] {7, 5, 7, 5});
        obj.calculateNums(new int [] {7, 4, 3, 5});
        obj.calculateNums(new int [] {});

        obj.calculateSubArray(new int[] {1 ,4 ,5 ,7 ,3 ,5 ,7 ,4 ,5 ,6 ,0},2,5);

        obj.calculateMergeArray(new int[] {1, 2, 3, 4, 6}, 3, new int[] {7, 8, 9, 9},3);

        obj.calculateMergeArray(new int[] {1, 3, 5, 6, 7}, 4, new int[] {2, 4, 5, 6},4);
        obj.calculateMergeArray(new int[] {1, 3, 5, 6, 7}, -51, new int[] {2, 4, 5, 6},0);
//        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
//        obj.calculateFibonachiNumber(4);
//        Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
//        System.out.println("calculated for (" + timestamp2 + " - " + timestamp1 + ") seconds");
//
//
//        obj.twoSum(new int[]{1, 3, 6, 4, 1, 6, 8, 5},12);
//
////        obj.calculateSqureNumber(4);
//
//        Timestamp timestamp3 = new Timestamp(System.currentTimeMillis());
//        obj.calculateClimbStairs(91);
//        Timestamp timestamp4 = new Timestamp(System.currentTimeMillis());
//        System.out.println("calculated for (" + timestamp4 + " - " + timestamp3 + ") seconds");
//
//        Timestamp timestamp5 = new Timestamp(System.currentTimeMillis());
//        obj.calculateClimbStairs(91);
//        Timestamp timestamp6 = new Timestamp(System.currentTimeMillis());
//        System.out.println("calculated for (" + timestamp6 + " - " + timestamp5 + ") seconds");
    }

    public void calculateSubArray(int [] inputArr, int start, int end){
        SubArray calc = new SubArray();
        PrintArray.printArray(inputArr);
        int [] result = calc.subArray(inputArr, start, end);
        PrintArray.printArray(result);
    }
    public void calculateMergeArray(int [] arr1, int n, int [] arr2, int m){
        MergeArray calc = new MergeArray();
        System.out.println("Arr1 :");
        PrintArray.printArray(arr1);
        System.out.println("Arr2 :");
        PrintArray.printArray(arr2);
        int [] res = calc.mergeArrays(arr1, n, arr2, m);
        System.out.println("Result :");
        PrintArray.printArray(res);

    }

    public void calculateNums(int [] array){
        Nums calc = new Nums();
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(" , ");
            }
            System.out.print(array[i]);
        }
        System.out.print("]");
        boolean result = calc.polindroms(array);
        System.out.println(" is palindrom: " + result);
    }


    public void calculateFibonachiNumber(int n){
        FibonachiClass calc = new FibonachiClass();
        System.out.println("Fibonachi (" + n + ") is: " + calc.fibonachi(n));

    }

    public void calculateSqureNumber(int s) {
        SqureNumber calc = new SqureNumber();
        System.out.println("Squre number is: " + calc.calculateSqNump(s));
    }

    public void calculateClimbStairs(int p){
        ClimbStairs calc = new ClimbStairs();
        System.out.println("Climb stairs number for " + p +" is: " + calc.climbStairs(p));
    }

    public void twoSum(int [] inputArr,int target){
        TwoSum calc = new TwoSum();
        System.out.print("Indexes for array \n[");
        calc.twoSum(inputArr, target);
        for(int i = 0; i < inputArr.length;i++) {
           System.out.print(inputArr[i]);
           if(i < inputArr.length - 1)
               System.out.print(", ");
        }
        System.out.println(" ]");
        int [] res = calc.twoSum(inputArr, target);

        System.out.print("and target " + target + " is: \n[");

        for(int i = 0; i < res.length;i++) {
            System.out.print(res[i]);
            if(i < res.length - 1)
                System.out.print(", ");
        }
        System.out.print(" ]\n");



    }
}
