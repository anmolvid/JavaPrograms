//******************************************************************************
// *  Compilation:  javac -d bin StackLinkedList.java
// *  Execution:    java -cp bin com.bridgelabz.util.StackLinkedList
// *  
// *  Purpose: Contains all the functions to create a Stack
// *
// *  @author  Anmol Vidyarthi
// *  @version 1.0
// *  @since   02-01-2019
// *
// ******************************************************************************/

package com.bridgelabz.util;

import java.util.NoSuchElementException;



public class StackLinkedList<T> {
	
	/*
	* top is of the type Node and is 
	* declared private to achieve encapsulation 
	*/
	private Node<T> top;
	
	/*
	* size is of the type integer and is 
	* declared private to achieve encapsulation 
	*/
	private int size;
	
	/**
	* Constructor to initialize the instance variables of 
	* class StackLinkedList
	*/
	public StackLinkedList(){
		top=null;
		size=0;
	}
	
	/**
	* Function to check if the stack is empty or not
	* 
	* @return true if empty else false
	*/
	public boolean isEmpty(){
		return top==null;
	}
	
	/**
	* Function to get the size of the stack
	* 
	* @return size
	*/
	public int getSize(){
		return size;
	}
	
	/**
	* Function to push the specified element in the stack
	* 
	* @param data the element to be pushed into the stack
	*/
	public void push(T data){
		Node<T> tnode=new Node<T>(data,null);
		if(top==null)
			top=tnode;
		else{
			
			//Function call to set the link present in Node class 
			//of com.bridgelabz.datastructureprograms
			tnode.setNext(top);
	         top = tnode;
		}
		size++;
	}
	
	/**
	* Function to pop the element from stack
	* 
	* @return the deleted element 
	*/
	public T pop(){
		if(isEmpty()){
			System.out.println("No elements");
			return null;
		}
		Node<T> tnode=top;
		
		//Function call to get the link present in Node class 
		//of com.bridgelabz.datastructureprograms
		top=tnode.getNext();
		
		size--;
		
		//Function call to get the data present in Node class 
		//of com.bridgelabz.datastructureprograms
		return tnode.getData();
	}
	
	/**
	* Function to fetch the top element of the stack 
	* 
	* @return the element at the top
 	*/
	public T peek(){
		if (isEmpty() )
			throw new NoSuchElementException("Underflow Exception") ;
		return top.getData();
	}   
}




//public static boolean ParenthesisBalanced(char exp[]) {
//
//    StackLinkedList stack=new StackLinkedList();
//
//    for(int i=0;i<exp.length;i++)
//    {
//
//        /*If the exp[i] is a starting 
//                parenthesis then push it*/
//        if (exp[i] ==  '(')
//            stack.push(exp[i]);
//
//        /* If exp[i] is an ending parenthesis 
//                 then pop from stack and check if the 
//                 popped parenthesis is a matching pair*/
//        if (exp[i] == ')')
//        {
//            if (stack.isEmpty())
//            {
//                return false;
//            } 
//
//            /* Pop the top element from stack, if 
//                   it is not a pair parenthesis of character 
//                   then there is a mismatch. This happens for 
//                   expressions like {(}) */
//            else if ( !Matching(stack.pop(), exp[i]) )
//            {
//                //return false;
//            }
//        }
//
//    }
//
//    /* If there is something left in expression 
//             then there is a starting parenthesis without 
//             a closing parenthesis */
//
//    if (stack.isEmpty())
//        return true; /*balanced*/
//    else
//     /*not balanced*/
//        return false;
//
//}
//
//}
//
//
