package day12;
@FunctionalInterface
interface MyFunc{
	void func();
}

@FunctionalInterface
interface YourFunc
{
	void foo(int x);
}

@FunctionalInterface
interface HerFunc
{
	String makeStr(String a,String b);
}
public class LamdaTest2 {

	public static void main(String[] args) {
		MyFunc mf = () -> System.out.println("###");
		mf.func();
		MyFunc mf2 = () -> System.out.println("^^");
		mf2.func();
		YourFunc yf = (int x) -> System.out.println(Math.pow(x, 2));
		yf.foo(3);
		YourFunc yf2 = (int x) -> System.out.println(x-3);
		yf2.foo(3);
		HerFunc hf = (String a,String b) ->
		{
			return a+b;
		};
		System.out.println(hf.makeStr("hello","world"));
		
		HerFunc hf2 = (String a,String b) ->
		{
			char c1 = a.charAt(0);
			char c2 = b.charAt(0);
			String s1 = a.substring(1);
			String s2 = b.substring(1);
			String allStr = (c1+"").toUpperCase()+s1+" "+String.valueOf(c2).toUpperCase()+s2;
			return allStr;
		};
		System.out.println(hf2.makeStr("hello","world"));
	}

}
