package com.bridgelabz.algo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.util.AlgorithmUtility;

public class BinarySearchWordList {
	
	 public static void main(String[] args) throws IOException {
	     FileReader fr=new FileReader("/home/admin1/Documents");
	     BufferedReader br=new BufferedReader(fr);
	     String str="";
	     String delimitor=",";
	     String[] array=new String[100];
	     while((str=br.readLine())!=null){
	         array=str.split(delimitor);
	     }
	     
	     //Method 1- using static function of AlgorithmUtility class of
	     //com.bridgelabz.util package
	     AlgorithmUtility.sort(array);
	     
	     for(int i=0;i<array.length;i++)
	     {
	         System.out.println(array[i]);
	     }
	     System.out.println("Enter the word to be searched from the file list");
	     String word=AlgorithmUtility.StringValue();
	     
	     //Method 2- using static function of AlgorithmUtility class of
	     //com.bridgelabz.util package
	     int i=AlgorithmUtility.binSearch(array, word);
	     
	     if(i>=0)
	         System.out.println("Word is found in the list at the index "+i);
	     else
	         System.out.println("Word is not found in the list");
	     
	     br.close();
	 }
	}



