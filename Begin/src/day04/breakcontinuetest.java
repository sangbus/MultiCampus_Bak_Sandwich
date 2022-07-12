package day04;

public class breakcontinuetest {

	public static void main(String[] args) {
		System.out.println("1.-----------------");
		for(int i=0;i<3;i++) {
			if(i==1)
				break;
			System.out.println("i="+i);
		}
		System.out.println("2.-----------------");
		for(int i=0;i<3;i++) {
			if(i==1)
				continue;
			System.out.println("i="+i);
		}
		System.out.println("3.-----------------");
		for(int i=0;i<3;i++)
		{
			for(int k=0;k<3;k++)
			{
				if(k==1)
					break;
				System.out.println("i="+i+", k="+k);
			}
		}
		System.out.println("4.-----------------");
		for(int i=0;i<3;i++)
		{
			for(int k=0;k<3;k++)
			{
				if(k==1)
					continue;
				System.out.println("i="+i+", k="+k);
			}
		}
		System.out.println("5.-----------------");
		outer:	//label
		for(int i=0;i<3;i++)
		{
			inner:
			for(int k=0;k<3;k++)
			{
				if(k==1)
					break outer;
				System.out.println("i="+i+", k="+k);
			}
		}
		System.out.println("6.-----------------");
		outer:
		for(int i=0;i<3;i++)
		{
			inner:
			for(int k=0;k<3;k++)
			{
				if(k==1)
					continue outer;
				System.out.println("i="+i+", k="+k);
			}
		}
	}
}
