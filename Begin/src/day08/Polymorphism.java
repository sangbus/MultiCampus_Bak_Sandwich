package day08;

public class Polymorphism {

	public static void main(String[] args) {
		human h1 = new human("강철민",171);
		System.out.println(h1.getInfo());
		superman s1 = new superman("이소라",170,500);
		System.out.println(s1.getInfo("---슈퍼맨 정보---"));
		aquaman a1 = new aquaman("인어공주",144,200);
		System.out.println(a1.getInfo());
		human hs = new superman("이희재",156,400);
		System.out.println("hs.name : "+hs.name);
		System.out.println("hs.height : "+hs.height);
		System.out.println(hs.getInfo());
		System.out.println("s1.power : "+s1.power);
		System.out.println("((superman)hs).power : " + ((superman)hs).power);
		System.out.println(((superman)hs).getInfo("@@@슈퍼맨 정보@@@"));
		
		human ha = new aquaman("아쿠아쿠",180,200);
		System.out.println(ha.getInfo());
		System.out.println(ha.name);
		System.out.println(ha.height);
		System.out.println(((aquaman)ha).speed);
		
		human arr[] = {h1,s1,a1,hs,ha};
		
		System.out.println("=====배열 시작=====");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] instanceof superman)
			{
				System.out.println(((superman)arr[i]).getInfo("===슈퍼맨 정보=="));
			}
			else
			{
				System.out.println(arr[i].getInfo());
			}
		}
	}
}