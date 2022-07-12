package day07;

public class Staff {
	private int no;
	private String name;
	private String group;
	public void setNo(int no)
	{
		this.no=no;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setGroup(String group)
	{
		this.group=group;
	}
	public int getNo()
	{
		return no;
	}
	public String getName()
	{
		return name;
	}
	public String getGroup()
	{
		return group;
	}
	public void showInfo() 
	{
		System.out.println("사번 : "+no);
		System.out.println("이름 : "+name);
		System.out.println("소속 부서 : "+group);
	}
}
