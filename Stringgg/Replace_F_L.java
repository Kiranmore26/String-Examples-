package Stringgg;

import java.util.Scanner;

public class Replace_F_L 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence :");
		String S=sc.next();
		S=S.toUpperCase();
		char First=S.charAt(0);
		char Last=S.charAt(S.length()-1);
		String mid=S.substring(1,S.length()-1);
		
		String result=Last+mid+First;
		
		System.out.println(result);
		
	}

}
