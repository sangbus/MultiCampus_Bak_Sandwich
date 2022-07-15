package day10;
import java.util.*;

public class ArraylistTest {

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<>();
		arrlist.add("하이");
		arrlist.add("반가워요");
		arrlist.add("안농");
		System.out.println("arrlist.size() : "+arrlist.size());
		Iterator<String> it=arrlist.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			System.out.println(s);
		}
		String s2 = arrlist.get(2);
		System.out.println(s2);
		List<Integer> arrList2 = Arrays.asList(40,10,20,5);
		System.out.println("=== 정렬 전 ===");
		for(int i=0;i<arrList2.size();i++)
		{
			System.out.println(arrList2.get(i));
		}
		Collections.sort(arrList2);
		Collections.sort(arrList2, Collections.reverseOrder());
		System.out.println("=== 정렬 이후 ===");
		for(int a : arrList2)
		{
			System.out.println(a);
		}
		arrlist.remove(0);
		System.out.println("=== 0번째 삭제 후 ===");
		for(String a : arrlist)
		{
			System.out.println(a);
		}
	}

}
