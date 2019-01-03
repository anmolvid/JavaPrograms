package com.bridgelabz.datastructure;

public class PallindromeChecker {
	public static void main(String[] args) 
	{
		int t=0;
		do{
		Scanner sc=new Scanner(System.in);
	
		DequeueUtility<Character> utility=new DequeueUtility<Character>();
		System.out.println("Enter a String To Check Whether It is Pallindrome or Not : ");
		String s=sc.nextLine();

		//adding each character to the rear of the dequeue
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			utility.addRear(c);
		}
		int flag=0;

		while(utility.size()>1)
		{
			if(utility.removeFront()!=utility.removeRear())
			{
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println("The Entered String is a Pallindrome");
		}
		else
		{
			System.out.println("The Entered String is not a Pallindrome");
		}
	}while(t<10);
	}
}

}
