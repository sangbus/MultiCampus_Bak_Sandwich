package day05;

public class arraytest {
	public static void main(String[] args)
	{
		char a[] = new char[4];
		a[0] = 'J';
		a[1] = 'A';
		a[2] = 'V';
		a[3] = 'A';
		for(int i=0; i<4;i++)
			System.out.println("a["+i+"] = "+a[i]);
		char[] ch2 = {'B','y','e'};
		System.out.println("ch2.length="+ch2.length);
		for(int i=0; i<ch2.length;i++)
			System.out.print(ch2[i]);
	}
}
