package day03;
import java.util.Scanner;
public class iftest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("평균 점수를 입력하세요 : ");
		float score = sc.nextFloat();
		String a = "";
		if(score<=100 && score>=90)
			a="A";
		else if(score>=80)
			a="B";
		else if(score>=70)
			a="C";
		else if(score>=60)
			a="D";
		else
			a="F";
		System.out.println(a);
	}

}
