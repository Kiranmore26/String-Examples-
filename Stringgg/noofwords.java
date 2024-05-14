package Stringgg;

import java.util.Scanner;

public class noofwords {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence :");
		String Input=sc.nextLine();
		
		String[] inputtxt=Input.split(" ");
		int count=0;
		for(int i=0;i<inputtxt.length;i++)
		{
			count++;
		}
		System.out.println("the no of words are : "+count);
	}

}
