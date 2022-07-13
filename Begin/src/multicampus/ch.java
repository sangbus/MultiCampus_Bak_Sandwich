package multicampus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ch {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("알파벳 소문자를 입력해주세요 : ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		char ch = (st.nextToken()).charAt(0);
		switch(ch)
		{
		case 'a','e','i','o','u' :
			System.out.println("모음입니다.");
			break;
		case 'b','c','d','f','g','h','j','k','l','m','n','p','q','w','r','s','t','v','x','y','z' :
			System.out.println("자음입니다.");
			break;
		default:
			System.out.println("잘못 입력했습니다.");
			break;
		}
	}

}
