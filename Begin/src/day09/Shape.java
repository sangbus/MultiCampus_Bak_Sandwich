package day09;

abstract public class Shape {
	int x,y;
	public String getInfo()
	{
		return "나는 도형 클래스입니다.";
	}
	abstract public void area(int a,int b);
}
