package day03;

public class fortest4 {

	public static void main(String[] args) {
		System.out.println("=========문제 1번========");
		for(int i=1;i<=3;i++)
		{
			for(int k=1;k<=5;k++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("========문제 2번========");
		for(int i=1;i<=9;i++)
		{
			for(int k=2;k<=9;k++)
			{
				System.out.print(k+"*"+i+"="+k*i+"\t");
			}
			System.out.println();
		}
	}

}
