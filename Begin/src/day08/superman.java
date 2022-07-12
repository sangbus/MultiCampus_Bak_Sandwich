package day08;

public class superman extends human {
	int power;
	public superman()
	{
		
	}
	public superman(String n, int h, int p)
	{
		name=n;
		height=h;
		power=p;
	}
	public String getInfo()
	{
		return super.getInfo()+"\n초능력 : "+power;
	}
	public String getInfo(String title)
	{
		return "제목 : " + title + "\n"+this.getInfo();
	}
	public void getInfo(String title, int up)
	{
		this.power += up;
		System.out.println(this.getInfo(title));
	}
}
