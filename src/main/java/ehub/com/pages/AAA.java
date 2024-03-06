package ehub.com.pages;

import ehub.com.baseLibrary.BaseClass;

public class AAA extends BaseClass{
	
	public static void name() {
		
		String s=" Processed 1000 / 1000 ";
		String s1[]=s.trim().split("/");
		
		String s12=s1[0].trim();
		System.out.println(s1[0].trim());
		System.out.println(s1[1].trim());
		int a=s12.length();
		System.out.println("length : "+a);
		
		String s123=s12.substring(10, a);
		System.out.println(s123);
		
	}

	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		
		do {
			
			a=8;
			b=19;
			System.out.println(a);
			
		} while (a>b);
	}
	
	
}
