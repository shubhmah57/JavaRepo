package JavaPrograms.DataStructures.Recursion;

import JavaPrograms.inheritancePractice.TypeVisibility.package3.C;

public class Counting {
    public static void main(String[] args) {
        int n =5;
        Counting counting = new Counting();
        counting.printReverseCounting(n);
        System.out.println("-----------");

        counting.printDirectCounting(n);
    }

    public void printReverseCounting(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        printReverseCounting(n-1);
    }

    public void printDirectCounting(int n){
        if(n==0){
            return;
        }

        printDirectCounting(n-1);
        System.out.println(n);
    }
}
