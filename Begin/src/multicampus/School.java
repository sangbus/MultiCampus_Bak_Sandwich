package multicampus;
import java.util.*;
public class School {
	//School has a students[배열]
	static Student[] arr = new Student[3];
	static int count = 0;
	public static void showMenu()
	{
		System.out.println("******* School App v1.1******");
		System.out.println("1. 등록");
		System.out.println("2. 출력");
		System.out.println("3. 검색");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		System.out.println("메뉴 번호를 입력하세요 : ");
	}
	public static void enroll()
	{
		Student s1 = new Student();
		s1.inputInfo();
		System.out.println("======등록한 정보======");
		s1.showInfo();
		System.out.println("입력한 학생 정보를 저장할까요? [1.yes 2.no]");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if(num==1)
		{
			try {
				
				arr[count] = s1;
				count++;
				System.out.println(count+"명 등록 했습니다 !");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("등록 마감했습니다. 현재 인원 : "+count+"명입니다.");
			}
		}
	}
	public static void printAll(int a)
	{
		System.out.println("학번 : "+arr[a].no);
		System.out.println("이름 : "+arr[a].name);
		System.out.println("전공 : "+arr[a].major);
		System.out.println("연락처 : "+arr[a].phone);
	}
	/** 등록된 모든 학생정보를 출력하는 메소드*/
	public void printAll()
	{
		for(int i=0;i<count;i++)
		{
			Student s = arr[i];
			System.out.println("-----학생 정보-----");
			s.showInfo();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		School obj = new School();
		int a = 1;
		do
		{
			School.showMenu();
			num=sc.nextInt();
			switch(num)
			{
				case 1:
					School.enroll();		//static 메소드(클래스 메소드)
					break;
				case 2: //출력 printAll()
					obj.printAll();				//메소드 호출 non-static 메소드(인스턴스 메소드)
					break;
				case 3:
					break;
				case 4:
					break;
				case 9:
					break;
				default:
					System.out.println("메뉴에 없는 번호예요. 다시 입력하세요");
					break;
			}
		}
		while(num!=9);
		System.out.println("안뇽 !");
	}

}
