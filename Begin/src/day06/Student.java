package day06;

public class Student {
	int no;
	String name;
	int year;
	String phone;
	public void showInfo()
	{
		System.out.println(name+"학생의 학번은 "+no+"이고, 학년은 "+year+"이고, 연락처는 "+phone+"입니다.");
	}
	public void grade(int kor, int eng)
	{
		System.out.println(name+"학생의 국어 성적은 "+kor+" 영어 성적은 "+eng+"입니다.");
	}
}