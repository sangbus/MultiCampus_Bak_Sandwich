package day02;
import java.util.*;
public class ReferenceType {
	public static void main(String[] args)
	{
		System.out.println("-------참조형------");
		String s1 = new String("JAVA");
		System.out.println(s1);
		Date today = new Date();
		System.out.println(today);
		String s2 = "Hello";
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		int a = 20;
		int b = 30;
		System.out.println(a+b+"<=합");
		System.out.println("합=>"+(a+b));
		
	}
}
