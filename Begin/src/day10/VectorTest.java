package day10;
import java.util.*;
import javax.swing.*;
public class VectorTest {

	public static void main(String[] args) {
		Vector v = new Vector(5,3);
		System.out.println("벡터 v의 현재 용량 : "+v.capacity());
		System.out.println("벡터 v의 현재 크기 : "+v.size());
		v.add("Hello");
		v.add(new Integer(1));
		v.add(Integer.valueOf(22));
		v.add(3.14);
		v.add('a');
		System.out.println("벡터 v의 현재 용량 : "+v.capacity());
		System.out.println("벡터 v의 현재 크기 : "+v.size());
		v.add(new Object());
		v.add(new javax.swing.JButton("OK"));
		System.out.println("벡터 v의 현재 용량 : "+v.capacity());
		System.out.println("벡터 v의 현재 크기 : "+v.size());
		v.add(3.14);
		v.add('a');
		v.addElement('a');
		System.out.println("벡터 v의 현재 용량 : "+v.capacity());
		System.out.println("벡터 v의 현재 크기 : "+v.size());
		System.out.println(v.get(0));
		System.out.println(v.elementAt(1));
		System.out.println(v.elementAt(2));
		System.out.println(v.elementAt(3));
		System.out.println(v.elementAt(4));
		String obj = (String)v.get(0);
		System.out.println(obj.toUpperCase());
		Double dbl = (double)v.get(3);
		System.out.println(dbl);
		JButton str = (JButton)v.get(6);
		System.out.println(str);
		Vector<String> v2 = new Vector<>(); //String형만 저장 신형만
		v2.add("Java");
		v2.add(Integer.valueOf(5).toString());
		String s2 = v2.get(0);
		System.out.println(s2.toLowerCase());
		System.out.println("======For문=====");
		for(int i=0;i<v2.size();i++)
			System.out.println(v2.get(i));
		System.out.println("=====확장 For문=====");
		Vector<Float> v3 = new Vector<>();
		v3.add(3.14f);
		v3.add((float) 2.2);
		v3.add(Float.valueOf(5));
		float sum = 0;
		for(Float a : v3)
			sum+=a;
		System.out.println("합계 : " + sum);
	}

}
