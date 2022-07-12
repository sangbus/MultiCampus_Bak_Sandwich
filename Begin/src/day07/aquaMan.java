package day07;

public class aquaMan {
	String name;
	int height;
	double speed;
	
	public aquaMan() { this("아쿠아맨",193,100); }
	 
	public aquaMan(String name, int height, double speed) { this.name = name;
	this.height = height; this.speed = speed; }
		 
	public String Info()
	{
		String info = "이름 : "+ name + "\n키 : " + height + "\n초능력 : " + speed;
		return info;
	}

}
