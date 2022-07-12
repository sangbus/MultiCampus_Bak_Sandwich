package day06;

public class schoolapp {
	public static void main(String[] args) {
		Student st = new Student();
		st.name="박상환";
		st.year=4;
		st.no=15;
		st.phone="010-1111-1111";
		st.showInfo();
		st.grade(70, 80);
	}
	
}
