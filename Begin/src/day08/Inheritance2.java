package day08;

class Person{
	int no;
	String name;
	//public Person() {}
	public Person(int n, String m)
	{
		no = n;
		name = m;
	}
}/////////////////////

class Student extends Person{
	String major;
	public Student()
	{
		super(100,"김학생");
	}
}///////////////////////////

class Teacher extends Person{
	String subject;
	public Teacher()
	{
		this(200,"최학생","C");
	}
	public Teacher(int no, String name, String subject)
	{
		super(no,name);
		this.subject=subject;
	}
}/////////////////////

public class Inheritance2 {

	public static void main(String[] args) {
		Person p1 = new Person(1,"홍길동");
	}

}//////////////////////