package day08;

public class aquaman extends human{
	double speed;
	public aquaman()
	{
		this("수중인간",160,933.22);
	}
	public aquaman(String n, int h, double s)
	{
		this.name = n;
		this.height = h;
		this.speed = s;
	}
	public String getInfo()
	{
		return super.getInfo()+"\n초능력 : "+speed;
	}
}
