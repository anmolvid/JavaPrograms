package com.bridgelabz.datastructure;

import java.io.IOException;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.LinkedList;

public class UnorderedLists {
	 static String fName="/home/admin1/Documents/example.txt";
     public static void main(String[] args) throws IOException{
    
         LinkedList Lists=new LinkedList();
       Lists=LinkedList.readFile(Lists);
        LinkedList.printList(Lists);
         while(true)
         {
             System.out.println("please select one option");
             System.out.println("1.Display list 2.to search element 3.Display modified File  ");
             int option=DataStructureUtility.intValue();
             switch(option) {
             case 1:LinkedList.printList(Lists);
             break;
             case 2:System.out.println("Enter the key element to be searched");
             String key=DataStructureUtility.StringValue();
             int k=LinkedList.delete(Lists, key);
             System.out.println(k);
             if(k==0) {
                 LinkedList.insert(Lists, key);
             }
             String[] fileContent = LinkedList.toStrinConv(Lists);
             LinkedList.usingFileWriter(Lists,fileContent,fName);
             break;
             case 3:  LinkedList.dispFile(fName);
             break;
             default:System.out.println("Please enter an valid option");
             break;
             }
         }
     }
 }




