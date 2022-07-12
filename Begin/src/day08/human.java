package day08;

public class human {
	String name;
	int height;
	public human()
	{
		this("아무개",155);
	}
	public human(String n, int h)
	{
		name = n;
		height = h;
	}
	public String getInfo()
	{
		return "이름 : "+name+"\n키 : " + height;
	}
}