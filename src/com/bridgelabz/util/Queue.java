package com.bridgelabz.util;

import java.util.NoSuchElementException;

public class Queue {
	protected int Queue[],front,rear,size,len;

    /* Constructor */

    public Queue(int n) {
        // TODO Auto-generated
        size = n;
        len = 0;
        Queue = new int[size];
        front = -1;
        rear = -1;
    }

//    public void Queue(int n)
//    {
//        size = n;
//        len = 0;
//        Queue = new int[size];
//        front = -1;
//        rear = -1;
//    }   

    /*  Function to check if queue is empty */

    public boolean isEmpty()

    {
        return front == -1;
    }   

    /*  Function to check if queue is full */

    public boolean isFull()
    {
        return front==0 && rear == size -1 ;
    }   

    /*  Function to get the size of the queue */

    public int getSize()

    {
        return len ;
    }   

    /*  Function to check the front element of the queue */

    public int peek()
    {
        if (isEmpty())

            throw new NoSuchElementException("Underflow Exception");

        return Queue[front];
    }   

    /*  Function to insert an element to the queue */

    public void insert(int i)
    {
        if (rear == -1)

        {
            front = 0;

            rear = 0;

            Queue[rear] = i;
        }

        else if (rear + 1 >= size)

            throw new IndexOutOfBoundsException("Overflow Exception");

        else if ( rear + 1 < size)

            Queue[++rear] = i;   

        len++ ;   

    }   
    /*  Function to remove front element from the queue */
    public int remove()
    {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        else
        {
            len-- ;
            int ele = Queue[front];
            if ( front == rear)
            {
                front = -1;

                rear = -1;
            }
            else
                front++;               
            return ele;
        }       
    }

}
