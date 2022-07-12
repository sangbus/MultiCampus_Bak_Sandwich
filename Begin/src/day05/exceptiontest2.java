package day05;

public class exceptiontest2 {

	public static void main(String[] args) {
		try
		{
			for(int i=1;i<=5;i++)
			{
				int a=50/(i-3);
				System.out.println("a="+a);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("분모가 0이 되면 안돼요");
		}
		System.out.println("중요한 코드입니다.");
	}
}