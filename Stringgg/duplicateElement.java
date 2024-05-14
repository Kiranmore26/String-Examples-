package Stringgg;

import java.util.Scanner;

public class duplicateElement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence :");
		String Input=sc.nextLine();
		String Store="";
		String[] inputtext=Input.split(" ");
		
		for(int i=0;i<inputtext.length;i++)
		{
			for(int j=i+1;j<inputtext.length;j++)
			{
				if(inputtext[i].equals(inputtext[j]) && (i!=j))
				{
					Store=inputtext[i]+" ";
					
				}
			}
		}
		System.out.println("The duplicate elements are " +Store.trim());
	}
}
