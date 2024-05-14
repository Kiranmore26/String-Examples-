package Stringgg;

import java.util.Scanner;


public class Searchword 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence :");
		String Input=sc.nextLine();
		System.out.println("Enter the text :");
		String search=sc.next();
		String[] inputtext = Input.split(" ");
		boolean found=false;
		for(int i=0;i<inputtext.length;i++)
		{
			if(inputtext[i].equalsIgnoreCase(search))
			{
				found=true;
			}
		}
		if(found)
		{
			System.out.println(search+" word is present in the test ");
		}
		else
		{
			System.out.println("it is not persent");
		}
	}
	
}
