package day05;

public class exceptiontest4 {

	public static void main(String[] args) {
		try
		{
			System.out.println("국어점수 : "+args[0]);
			System.out.println("영어점수 : "+args[1]);
			System.out.println("합계 : "+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));
			System.out.println("평균점수 : "+(Integer.parseInt(args[0])+Integer.parseInt(args[1]))/0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("명령줄 인수를 입력해야 해요!");
		}
		catch(NumberFormatException e)
		{
			System.out.println("점수는 숫자로 입력하세요.");
		}
		catch(Exception e)
		{
			System.out.println("기타 예상치 못한 예외 발생 : "+e);
		}
	}

}
