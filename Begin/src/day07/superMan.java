package day07;

public class superMan {
	String name;
	int height;
	int power;
	
	public superMan()
	{
		this("슈퍼맨",166,100);
	}
	public superMan(String name)
	{
		this(name,187,100);
	}
	public superMan(String name, int height)
	{
		this(name,height,90);
	}
	
	//target : 여기서 초기화 하자, 타겟이 있어야 생성자 안에서 this를 사용할 수 있다.
	public superMan(String name, int height, int power)
	{
		this.name = name;
		this.height = height;
		this.power = power;
	}
	public String Info()
	{
		String info = "이름 : "+ name + "\n키 : " + height + "\n초능력 : " + power;
		return info;
	}
}