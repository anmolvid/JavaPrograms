//******************************************************************************
// *  Compilation:  javac -d bin WeekOnStack.java
// *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.WeekOnStack n
// *  
// *  Purpose: ­>Create a Program which creates Banking Cash Counter where people
// *come in to deposit Cash and withdraw Cash. Have an input panel to add people
// *to Queue to either deposit or withdraw money and dequeue the people. Maintain
// *the Cash Balance.
// *
// *  @author  anmol vidyarthi
// *  @version 1.0
// *  @since   05-01-2019
// *
// ******************************************************************************/


package com.bridgelabz.datastructure;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Queue;

public class Banking {
public static void main(String[] args) {
        
        // TODO Auto-generated method stub
        DataStructureUtility q= new DataStructureUtility();
        
//        int n=DataStructureUtility.readInteger();
        Queue q1=new Queue();
        int money=10000;
        int ch = 0;
        do
        {
            System.out.println();
               System.out.println("------------Banking Cash Counter-----------");
               System.out.println("1.enter the people to add to the queue");
               System.out.println("2.available balance");
               System.out.println("3.Exit");
               System.out.println();
               System.out.println("Enter your choice: ");
               int choice=q.intValue();
               switch (choice)
               {
               case 1: q1.insert(ch++);
                       System.out.println("person added to queue");
                       System.out.println("select choice 1.deposit 2.withdraw");
                       int value=q.intValue();
                    switch (value)
                    {
               case 1:           
                       System.out.println("Enter the amount you want to Deposit");
                       int cash=DataStructureUtility.intValue();
                       money+=cash;
//                       System.out.println("available balance is: "+(money+cash));
                       System.out.println("amount credited to your account");
                       break;
               case 2:
                       System.out.println("Enter the amount you want to Withdraw ");
                    int cash1=DataStructureUtility.intValue();
                    money=money-cash1;
                    System.out.println("amount debited from your account");
//                       System.out.println(" Your Available Balance is: "+money);
                       
                       break;
                    }
                    q1.remove();
                    System.out.println("person removed from queue");
                   break;
            case 2:

                    System.out.println("the cashier balance is: "+money);    
                    break;
               case 3:
                       System.exit(0);
                       break;
               default:
                       System.out.println("You entered wrong choice");
                       break;
               }
           }
        while(ch<5);
    }        

    }

