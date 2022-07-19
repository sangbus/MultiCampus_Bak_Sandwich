package day12;

@FunctionalInterface
interface MyNum
{
	int getMax(int a,int b);
	//int getMin(int a,int b);
}

public class LamdaTest1 {

	public static void main(String[] args) {
		MyNum m1 = (int x,int y)->
		{
			if(x>=y)
			{
				return x;
			}
			else
			{
				return y;
			}
		};
		System.out.println(m1.getMax(55,77));
		System.out.println(m1.getMax(55,77));
		MyNum m2 = (a,b) -> (a>=b)? a: b;
		System.out.println(m2.getMax(71,90));
	}

}
