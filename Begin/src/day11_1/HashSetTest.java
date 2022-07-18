package day11_1;
import java.util.*;
public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		//데이터 저장할 땐 add(E)
		set.add("Java");
		set.add("HTML");
		set.add("CSS");
		set.add("Python");
		set.add("MYSQL");
		System.out.println("set.size() : "+set.size());
		//데이터 꺼낼 땐 Iterator<E>	iterator()
		Iterator<String> it =set.iterator();
		while(it.hasNext())
		{
			String val = it.next();
			System.out.println(val);
		}
		set.remove("CSS");
		System.out.println("set.size() : "+set.size());
		for(String str : set)
		{
			System.out.println(str);
		}
		set.clear();
		System.out.println("set.size() : "+set.size());
	}
}