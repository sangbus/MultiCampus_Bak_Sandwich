package day08;

public class coffeeMachine {
	int coffee, sugar, cream;		//멤버변수
	yuja y;
	public void makeTea(int coffee/*지역변수*/)	//메소드 오버로딩
	{
		this.coffee = coffee;
		System.out.println("블랙 커피 !! \n 농도 : "+this.coffee);
	}
	public void makeTea(int coffee,int sugar)
	{
		this.coffee = coffee;
		this.sugar = sugar;
		int a = this.coffee+this.sugar;
		System.out.println("설탕 커피 !! \n 농도 : "+a);
	}
	public String makeTea(int coffee,int sugar,int cream)
	{
		this.coffee = coffee;
		this.sugar = sugar;
		this.cream = cream;
		
		String s = "밀크 커피 나가요 !! \n 농도 : "+(this.coffee+this.sugar+this.cream);
		return s;
	}
	public void makeTea(int coffee, short cream)
	{
		this.coffee = coffee;
		this.cream = cream;
		System.out.println("크림 커피 !! \n 농도 : "+(this.coffee+this.cream));
	}
	public int makeTea(short cream, int coffee)
	{
		this.makeTea(coffee,cream);
		return (this.coffee+this.cream);
	}
	public void makeTea(yuja y)
	{
		this.y=y;
		System.out.println("유자차");
		System.out.println(y.getYuja()+y.getSugar());
	}
}
