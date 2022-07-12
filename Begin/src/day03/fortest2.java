package day03;
import java.util.*;
public class fortest2 {

	public static void main(String[] args) {
		int dan=7;
		for(int i=1;i<=9;i++)
		{
			System.out.println("1번 문제");
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
		int sum=0;
		for(int i=1;i<=10;i++)
			sum+=i;
		System.out.println("2번 문제");
		System.out.println("1~10까지의 합은 : " + sum);
		
		int a=1;
		for(int i=1;i<=10;i++)
			a*=i;
		System.out.println("3번 문제");
		System.out.println("1~10까지의 곱은 : " + a);
		int b=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
				b+=i;
		}
		System.out.println("4번 문제");
		System.out.println("1~100까지의 짝수들의 합은 : " + b);
		System.out.println("5번 문제");
		for(int i=1;i<=100;i++)
		{
			if(i%17==0)
				System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println("6번 문제");
		for(char c = 'A';c<='Z';c++)
		{
			System.out.print(c+" ");
		}
		/*
		 * for(int d=65;d<91;d++) System.out.print((char)a+", ");
		 */
		System.out.println("");
	}

}
