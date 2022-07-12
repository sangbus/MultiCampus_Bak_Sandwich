package day05;

public class arraytest3 {

	public static void main(String[] args) {
		int a[] = {90,50,60};
		int[] b = a;
		for(int i =0;i<b.length;i++)
			System.out.println(b[i]);
		b[0] = 100;
		System.out.println(b[0]);
		System.out.println(a[0]);
		
		int []x = {1,2,3,4};
		int y[] = {10,20};
		int tmp[];
		tmp=x;
		x=y;
		y=tmp;
		for (int i =0;i<x.length;i++)
			System.out.print(x[i]+"\t");
		System.out.println();
		for(int k=0;k<y.length;k++)
			System.out.print(y[k]+"\t");
		String yy[]= {"a","b"};
		for(String s:yy)
		{
			System.out.println("s: "+s.toUpperCase());
		}
		String str[]= {"안녕하세요","반갑습니다","잘가세요~~"};
		for(String k:str)
		{
			System.out.println(k);
		}
	}

}
