package day10;

public class Student {
	private int id;
	private String name;
	public Student()
	{
		this(0,"박철원");
	}
	public Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
