package day03;

public class practice {

	public static void main(String[] args) {
		System.out.println("3-3문제");
		int num = 10;
		System.out.println((num>0)?num==0?"음수":"양수":"0");
		
		System.out.println("3-4문제");
		num = 456;
		System.out.println((num%100==0)?""+num:""+num/100*100);
		int x=11;
		char oh = '0';
		int year=2022;
		boolean powerOn = false;
		String str = new String("yes");
		int result=0;
		System.out.println("4-1 문제");
		if(10<x && 20>x)
			System.out.println("true");
		
		if(oh!=' '&&oh!='\t')
			System.out.println("true");
		
		if(oh=='x'||oh=='X')
			System.out.println("true");
		
		if(oh>='0'&&oh<='9')
			System.out.println("true");
		
		if(oh>='a'&&oh<='z'||oh>='A'&&oh<='Z')
			System.out.println("true");
		
		if((year%400==0)||((year%4==0)&&(year%100!=0)))
			System.out.println("true"+year);
		
		if(powerOn==false)
			System.out.println("true");
		
		//문자열의 내용값을 비교하는 메소드 : boolean타입, equals(Object o) : 문자열의 내용이 같으면 true를 반환
		if(str.equals("yes"))
			System.out.println("문자열true");
		
		System.out.println("4-2 문제");
		for(int i=1;i<=20;i++)
		{
			if(!(i%2==0||i%3==0))
				result+=i;
		}
		System.out.println("1~20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합 : "+result);
		
		System.out.println("4-3 문제");
		int z = 0;
		for(int i=1;i<=10;i++)
		{
			for(int k=1;k<=i;k++)
			{
				z+=k;
			}
		}
		System.out.println("총합 : "+z);
	}

}
