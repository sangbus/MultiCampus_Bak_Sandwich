package day07;
import java.util.*;
public class Job {
	private String name,gender;
	String education;		//최종 학력
	private int age;
	double graduate;			// 평균 학점
	public Job()
	{
		
	}
	public Job(String education)	//고졸이면 평균 학점이 없을테니
	{
		this.education = education;
		graduate = 0;
		
	}
	public Job(String education,double graduate)
	{
		this.education = education;
		this.graduate = graduate;
	}
	public void setJob(String name,String gender,int age)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public String getGender()
	{
		return gender;
	}
	public int getAge()
	{
		return age;
	}
	/**메소드*/
	public void showInfo()		//정보 출력
	{
		System.out.println("이름 : "+name);
		System.out.println("성별 : "+gender);
		System.out.println("나이 : "+age);
		System.out.println("최종 학력 : "+education);
		System.out.println("평균 학점 : "+graduate);
	}
	public void enroll()		//등록
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name=sc.next();
		System.out.print("성별 : ");
		gender=sc.next();
		System.out.print("나이 : ");
		age=sc.nextInt();
		System.out.print("최종 학력 : ");
		education=sc.next();
		System.out.print("평균 학점 : ");
		graduate=sc.nextDouble();
	}
}
