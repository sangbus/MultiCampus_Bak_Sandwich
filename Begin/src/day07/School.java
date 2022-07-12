package day07;


public class School {

	public static void main(String[] args) {
		Student st = new Student();
		Student st1 = new Student();
		Student st2 = new Student();
		Teacher t = new Teacher();
		Staff ff = new Staff();
		st.setNo(1);
		st.setName("박박박");
		st.setMajor("빅데이터");
		st1.setNo(2);
		st1.setName("이이이");
		st1.setMajor("데이터구조");
		st2.setNo(3);
		st2.setName("김김김");
		st2.setMajor("컴퓨터구조");
		Student[] arr = new Student[3];
		arr[0]=st;
		arr[1]=st1;
		arr[2]=st2;
		for(int i=0;i<arr.length;i++)
		{
			Student st3 = arr[i];
			st3.showInfo();
		}
		Teacher t1 = new Teacher();
		t1.setNo(2);
		t1.setName("모모모");
		t1.setSubject("인공지능");
		t.setNo(1);
		t.setName("김모씨");
		t.setSubject("빅데이터");
		Teacher arr1[] = {t,t1};
		for(Teacher tc:arr1)
		{
			tc.showInfo();
		}
		
		ff.setNo(1);
		ff.setName("박모씨");
		ff.setGroup("멀티캠퍼스");
		System.out.println("===학생===");
		st.showInfo();
		System.out.println("===교사===");
		t.showInfo();
		System.out.println("===직원===");
		ff.showInfo();
	}

}
