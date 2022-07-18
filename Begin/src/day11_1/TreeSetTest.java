package day11_1;
import java.util.*;
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("홍길동");
		ts.add("강감찬");
		ts.add("이순신");
		ts.add("이리듐");
		ts.add("제임스");
		ts.add("제임스");
		System.out.println("ts.size() : "+ts.size());
		for(String s : ts)
		{
			System.out.println(s);
		}
	}

}
