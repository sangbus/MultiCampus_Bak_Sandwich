package day10;
import java.util.*;
import java.io.*;
public class HashMapTest {
	HashMap<String,String> map = new HashMap<>();
	public void join()
	{
		map.put("Hong", "123");
		map.put("Lee", "456");
		map.put("Don", "789");
		System.out.println("회원 가입 완료 [회원수 : "+map.size()+"명]");
	}
	public static void main(String[] args) {
		HashMapTest Hm = new HashMapTest();
		Hm.join();
		Hm.loginCheck();
	}
	public void loginCheck()
	{
		Console console = System.console();
		while(true)
		{
			System.out.print("아이디 : ");
			String userid = console.readLine();
			if(map.containsKey(userid))
			{
				System.out.print("비밀번호 : ");
				char[] pwd = console.readPassword();
				if(map.get(userid).equals(new String(pwd)))
				{
					System.out.println(userid+"님 환영합니다.");
					return;
				}
				else
					System.out.println("비밀번호가 일치하지 않아요.");
			}
			else
				System.out.println("회원이 아닙니다.");
		}
	}

}
