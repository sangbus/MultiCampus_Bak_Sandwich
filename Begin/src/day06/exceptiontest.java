package day06;

public class exceptiontest {
	public static void main(String[] args)
	{
		try 
		{
			int num=Integer.parseInt(args[0]);
			System.out.println(50/num);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("명령줄 인수를 1개 입력해야 하세요.");
		}
		catch(ArithmeticException e)
		{
			System.out.println("숫자 0은 넣을 수 없습니다.");
			System.exit(0);
		}
		catch(NumberFormatException e)
		{
			System.out.println("문자열은 넣을 수 없습니다.");
			return;
		}
		catch(Exception e)
		{
			System.out.println("기타 오류 발생 : "+e.getMessage());
		}
		finally
		{
			System.out.println("##반드시 실행되어야 할 코드입니다##");
		}
		System.out.println("The End");
	}
}
