package day11_1;
import java.util.*;
import day10.Student;
public class ObjectTest {

	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println("o1 : " + o1);
		System.out.println("o1.toString : " + o1.toString());
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println("s1 : " + s1);
		System.out.println("s1.toString() : " + s1.toString());
		Date d1 = new Date();
		System.out.println(d1);
		Student st1 = new Student(100,"김씨");
		Student st2 = new Student(101,"박씨");
		Student st3 = st2;
		Student st4 = new Student(101,"박씨");
		System.out.println("st1==st2 : "+(st1==st2));
		System.out.println("st2==st3 : "+(st2==st3));
		System.out.println("st1.equals(st2) : " + st1.equals(st2));
		System.out.println("st3.equals(st2) : " + st3.equals(st2));
		System.out.println("st4.equals(st2) : "+st4.equals(st2));
		System.out.println("============String 클래스=============");
		String a1 = "Hello";
		String a2 = "Hello";
		String a3 = new String("Hello");
		String a4 = new String("Hello");
		//a1==a2 : true
		//a1 == a3 : false
		//a3 == a4 : false
		//a1.equals(a2): true
		//a1.equals(a3): true
		//a3.equals(a4): true
		System.out.println("a1==a2 : "+(a1==a2));
		System.out.println("a1==a3 : "+(a1==a3));
		System.out.println("a3==a4 : "+(a3==a4));
		System.out.println("a1.equals(a2) : "+a1.equals(a2));
		System.out.println("a1.equals(a3) : "+a1.equals(a3));
		System.out.println("a3.equals(a4) : "+a3.equals(a4));
	}
}