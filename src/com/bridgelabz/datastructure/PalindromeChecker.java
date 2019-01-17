/******************************************************************************
// *  Compilation:  javac -d bin WeekOnStack.java
// *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.WeekOnStack n
// *  
// *  Purpose: ­> Read .a List of Numbers from a file and arrange it ascending Order in a
// *Linked List. Take user input for a number, if found then pop the number out of the
// *list else insert the number in appropriate position
// *
// *  @author  anmol vidyarthi
// *  @version 1.0
// *  @since   05-01-2019
// *
// ******************************************************************************/



package com.bridgelabz.datastructure;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Deque;

public class PalindromeChecker {
	public static void main(String[] args) {
        Deque deque=new Deque(100);
        int n=0;
        do {
            System.out.println("1.To check palindrome\n2.Exit");
            int choice=DataStructureUtility.intValue();
            switch(choice)
            {
            case 1:System.out.println("Enter string to check it is palindrome or not");
                    String str=DataStructureUtility.StringValue();
                    char[] ch=str.toLowerCase().toCharArray();
                    int flag=0;
                    for(int i=0;i<ch.length;i++)
                    {
                        deque.addFront(ch[i]);
                    }
                    System.out.println(deque.size());
                    while(deque.size()>1)
                    {
                        if(deque.removeFront()!=deque.removeRear())
                        {
                            flag=1;
                        }
                    }
                    if(flag==0)
                    {
                        System.out.println("it is a palindrome");
                    }
                    else
                    {
                        System.out.println("it is not a palindrome");
                    }
                    break;
            case 2:System.exit(0); break;
            default:System.out.println("please select correct choice");break;
        }
        n++;
        }while(n<30);
    }

}




