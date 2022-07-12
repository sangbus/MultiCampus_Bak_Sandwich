package day07;

public class overloagingTest {

	public static void main(String[] args) {
		superMan sm = new superMan();
		superMan sm1 = new superMan("아이언맨",190,200);
		superMan sm2 = new superMan("캡틴",199,300);
		superMan sm3 = new superMan("헐크",170,400);
		
		aquaMan am = new aquaMan("물개", 300, 150);
		System.out.println(sm.Info());
		System.out.println(sm1.Info());
		System.out.println(am.Info());
		aquaMan am1 = new aquaMan();
		System.out.println(am1.Info());
		superMan arr[] = {sm,sm1,sm2,sm3};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("==============");
			System.out.println(arr[i].Info());
		}
		
		aquaMan arr1[] = {am,am1};
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i].Info());
		}
	}
}