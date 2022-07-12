package day04;
import java.util.Scanner;
public class whiletest {

	public static void main(String[] args) {
		/*
		 * int a=1; int b=10;
		 */
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		/*
		 * while(a<5) { System.out.println("Hello:"+a); a++; } while(b>0) {
		 * System.out.println("Java:"+b); b-=2; }
		 */
		int i = 1;
		while(i<10)
		{
			System.out.print(dan+" * "+i+"="+dan*i+"\t");
			i++;
		}
		System.out.println();
		int k = 1;
		while(k<10)
		{
			int l = 1;
			while(l<10)
			{
				System.out.print(k+" * "+l+" = "+k*l+"\t");
				l++;
			}
			System.out.println("");
			k++;
		}
	}

}
