package com.bridgelabz.algo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.util.AlgorithmUtility;

public class BinarySearchWordList {
	
//	 public static void main(String[] args) throws IOException {
		 public static void main(String[] args) throws IOException {
	           
	            String csvFile = "/home/admin1/Documents/names.csv";
	          
	            BufferedReader fileReader = new BufferedReader(new FileReader(csvFile));

	            final String DELIMITER = ",";
	            try {
	                String line = " ";
	                while ((line = fileReader.readLine()) != null) {
	                    String[] tokens = line.split(DELIMITER);
	           
	                    for (String token : tokens) {
	                        // Print all tokens
	                        System.out.println(token);
	                    }
	                    System.out.println("enter the key word which has to be searched ");
	                    String key =AlgorithmUtility.StringValue();
	                    int i = AlgorithmUtility.binarySearchGeneric(tokens, key);
	                    if (i >= 0) {
	                        System.out.println(tokens[i] + " is present in " + (i + 1) + " position in the array");
	                    } else
	                        System.out.println(key + " doesnot exists in the given csv file");
	                }
	            }
	            catch (Exception e) {
	               System.out.println("File not found");
	            } finally {
	                try {
	                    fileReader.close();
	                } catch (Exception e) {
	                    e.addSuppressed(e);
	                }
	            }
	        }

	}
	 
		 
