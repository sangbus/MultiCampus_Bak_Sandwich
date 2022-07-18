package day11_1;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "Java";
		s1+=" Language";
		System.out.println(s1);
		String s2 = s1.concat(" Nice");
		System.out.println("s2 : "+s2);
		System.out.println("s1 : "+s1);
		char c1 = s1.charAt(5);
		System.out.println("c1 : "+c1);
		String s3 = "56A78";
		boolean isNum = true;
		for(int i=0;i<s3.length();i++)
		{
			char ch = s3.charAt(i);
			if(!(ch>='0'&&ch<='9'))
			{
				isNum = false;
				break;
			}
		}
		String result = (isNum) ? "숫자입니다"  : "숫자가 아닙니다";
		System.out.println("\n변수 s3는 " + result);
		String s4 = "어머님은 짜장면이 싫다고 하셨어. 어머님은 짜장면이 ...";
		int idx = s4.indexOf("짜장면");
		System.out.println("idx : "+idx);
		System.out.println("lastindexof : "+s4.lastIndexOf("짜장면"));
		System.out.println("lastindexof : "+s4.lastIndexOf("짬뽕"));
		System.out.println(s4.substring(s4.indexOf("짜장면"), s4.lastIndexOf("짜장면")));
		System.out.println(s4.substring(5));
		System.out.println("s4 : "+s4);
		System.out.println(s4.replace("짜장면", "짬뽕"));
		System.out.println("s4 : "+s4);
		String s5 = "   100#Tom#반갑습니다~오늘도 즐거운 하루 되세요   ";
		System.out.println("s5.length : " + s5.length() + " " + s5);
		String s6 = s5.trim();
		System.out.println("s5.length : " + s6.length() + " " + s5);
		String[] tokens = s5.split("#");
		System.out.println("token.length : "+tokens.length);
		System.out.println("tokens[0] : "+tokens[0]);
		System.out.println("tokens[1] : "+tokens[1]);
		System.out.println("tokens[2] : "+tokens[2]);
	}

}
