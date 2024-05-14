package Stringgg;

import java.util.Scanner;

public class Pangram 
{
	private static boolean ispangram(String s) 
	{
		//length should be greater than 26
		if(s.length()<26)
		{
			return false;
		}
		else
		{
			for(char a='a';a<='z';a++)//all letters from a to z should be present
			{
				if(s.indexOf(a)<0)//every value should be greater than 0
				{
					return false;
				}
				
			}
			return true;
		}
	
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String input=sc.next();
		System.out.println(ispangram(input.toLowerCase()));//converted in lower case
		
		
	}

	
}
