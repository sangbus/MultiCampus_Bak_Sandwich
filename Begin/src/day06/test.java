package day06;

public class test {

	public static void main(String[] args) {
		imployee e1 = new imployee();
		e1.no=1;
		e1.name="김사원";
		e1.salary=500;
		e1.dept="기획부";
		//e1.indate = new java.util.Date();
		
		e1.work("기획");
		int year_sal=e1.receive_sal();
		System.out.println("연봉 : "+year_sal);
	}

}
