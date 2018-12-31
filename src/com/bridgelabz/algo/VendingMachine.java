package com.bridgelabz.algo;

import com.bridgelabz.util.AlgorithmUtility;

public class VendingMachine {
    public static void main(String[] args) {
        System.out.println("enter the money in Rs");
        int money=AlgorithmUtility.intValue();
        int[] notes = { 2000,500,100,50,10,5,2,1};
        System.out.println("the different notes present is");
        AlgorithmUtility.calculate(money, notes);
    }


	

}

