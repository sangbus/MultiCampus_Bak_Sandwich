package multicampus;

public class Teacher {
	int no; // 교변
	String name;
	String subject; // 담당 과목
	String phone;
	public void showInfo()
	{
		System.out.println("교변 : "+no);
		System.out.println("이름 : "+name);
		System.out.println("담당 과목 : "+subject);
		System.out.println("연락처 : "+phone);
	}
}
