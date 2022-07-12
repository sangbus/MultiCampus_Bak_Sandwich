package day02;

public class myoperator2 {

	public static void main(String[] args) {
		System.out.println("4.비트 연산자 : &, |, ^");
		int a=6;
		int b=5;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		
		System.out.println("5. 논리 연산자 : &, &&, |, ||");
		int c=5;
		int d=6;
		if((c>d) & (c>0))
		{
			System.out.println("Hello");
		}
		else if((b>a) | (b<0))
		{
			System.out.println("Hi");
		}
		int i=1;
		int j=i++;
		if((i>++j) & (i++==j)) // (2>2)false & (2==2)true,연산끝나고 i==3
		{
			i=i+j;
		}
		System.out.println("i="+i); // i=3
		
		int k=0;
		int p=1;
		if((k++==0) | (p++==2)) //true(0==0)->연산 끝나고 k==1, false(1==2)-> 연산 끝나고 p==2
		{
			k=42;
		}
		System.out.println("k="+k+", p="+p); //k=42, p=2
		
		
		i=1;
		j=i++;
		if((i>++j) && (i++==j)) // 앞의 것이 2>2라서 false, 바로 넘어감
		{
			i=i+j;
		}
		System.out.println("i="+i); // i=2
		
		k=0;
		p=1;
		if((k++==0) || (p++==2)) // 앞의 것이 true라서 바로 넘어감, 연산 끝나고 k==1
		{
			k=42;
		}
		System.out.println("k="+k+", p="+p); //k=42, p=1
		
		boolean r = false;
		boolean e = false;
		boolean w = ((r=true) || (e=true));
		System.out.println(r +", " + e + ", " + w);
	}
}