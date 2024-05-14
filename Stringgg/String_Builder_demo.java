package Stringgg;

public class String_Builder_demo 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder(50);
		StringBuilder sb2= new StringBuilder("hello ");//6
		
		System.out.println("Capacitry of sb : "+sb.capacity());
		System.out.println("Capacitry of sb1 : "+sb1.capacity());
		System.out.println("Capacitry of sb2 : "+sb2.capacity());
		
		sb2.append(" How are you ?");//14
		System.out.println("Length of sb2 : "+sb2.length());
		System.out.println("Sb2 after concatination : "+sb2);
		sb2.insert(6, "Kiran");
		System.out.println("sb2 after inserting kiran : "+sb2);
//		
		System.out.println("here we are comparing sb1 and sb2 : "+sb2.equals(sb1));
//		
		sb2.replace(0, 5, "HELLO");
		System.out.println("Sb2 after replacing the letters : "+sb2);
//		
		sb2.delete(0, 5);
		System.out.println("Sb2 after Deleting the letters  : "+sb2);
//		
		System.out.println(sb2.charAt(5));
//		
		System.out.println("String after it is reverse : "+ sb2.reverse());
//		
		System.out.println("Use of substring : "+sb2.substring(0, 5));
//		
//		
		System.out.println(sb1.compareTo(sb1));
		System.out.println(sb2.indexOf("e"));
		
	}
}
