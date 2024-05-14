package Stringgg;
import java.util.*;


public class StringTokenizerrrrr 
{
	
	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer("Java, is ,Programming ,Language");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken(","));
		}

		
		
	}
	
	
}
