package day10;

import day11_1.Member;

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
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Student)
		{
			Student user = (Student) obj;
			boolean bool = user.name.equals(this.name)&& user.id == this.id;
			return bool;
		}
		else
			return false;
	}
}
