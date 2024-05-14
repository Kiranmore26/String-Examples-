package Stringgg;

import java.util.Scanner;

public class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence :");
		String Input=sc.nextLine();
		String rev="";
		
		
		int leng=Input.length();
		//leng-1 because index value is always -1 than its length
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+Input.charAt(i);
		}
		System.out.println("The reverse of given String is :"+rev);
		
		if(rev.equalsIgnoreCase(Input))
		{
			System.out.println("The String is a palindrome");
		}
		else
		{
			System.out.println("The string is not a palindrome");
		}
	}
}
