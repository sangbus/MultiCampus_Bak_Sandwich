package day09;

public class Triangle extends Shape {
	@Override
	public void area(int a,int b)
	{
		int c = a*b/2;
		System.out.println("삼각형의 면적 : "+c);
	}
}
