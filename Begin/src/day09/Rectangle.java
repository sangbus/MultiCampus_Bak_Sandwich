package day09;

public class Rectangle extends Shape{
	@Override
	public void area(int a,int b)
	{
		int k=a*b;
		System.out.println("사각형 면적 : "+k);
	}
}
