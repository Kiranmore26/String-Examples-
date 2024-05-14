package Stringgg;

import java.util.Scanner;

public class RemoveElment 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence :");
		String Input=sc.nextLine();
		
		
		String[] inputtext=Input.split(" ");
		
		String remove="hello";
		String store ="";
		
		for(int i=0;i<inputtext.length;i++)
		{
				if(inputtext[i].equals(remove) )
				{
					inputtext[i]=store;
				}	
		}
		
		
		for(int i=0;i<inputtext.length;i++)
		{
				System.out.print(inputtext[i]+" ");
		}	
	}
}
