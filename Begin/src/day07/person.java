package day07;

public class person {
	String name;
	int age;
	public person()	//기본 생성자 - default constructor
	{
		name="니어데서왔노";
		age=1;
	}
	public person(int age)
	{
		name="얄라리얄라쎵";
		this.age = age;
	}
	public person(String name)	//인자 생성자 - constructor using fields
	{
		this.name=name;
		age=10;
	}
	public person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public person(int age,String name)
	{
		this.name=name;
		this.age=age;
	}
}
