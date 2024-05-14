package Stringgg;

public class Stringggg 
{
	public static void main(String[] args) 
	{
		
		String s1 = new String("Welcome");
		String s = new String("  How are you ....?");
		String s2 = new String("java is a programming lang.....");
		System.out.println(s);
		System.out.println(s.charAt(5));
		System.out.println(s.length());
		System.out.println(s.substring(4,11));
		System.out.println(s.contains(s1));
		System.out.println(s.join("-", "java","is","cool"));
		//System.out.println(s.join(s, null)); error.....
		System.out.println(s1.equals("Welcome"));
		System.out.println(s.isEmpty());
		System.out.println(s.replace(".", "*"));
		System.out.println(s.replace("are", "areeee"));
		System.out.println(s.concat("8521"));
		System.out.println(s.trim());
		String s4 = s2.replace("java", "Html");
		System.out.println(s4);




		


		
		
		

	}
}
