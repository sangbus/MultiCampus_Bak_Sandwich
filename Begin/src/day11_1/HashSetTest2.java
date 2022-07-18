package day11_1;
import java.util.*;
public class HashSetTest2 {

	public static void main(String[] args) {
		Member m1 = new Member("홍길동",12);
		Member m2 = new Member("김민수",14);
		Member m3 = new Member("이영희",13);
		Member m4 = new Member("이영희",13);
		Member m5 = new Member("홍길동",22);
		HashSet<Member> set = new HashSet<>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		set.add(m5);
		Iterator<Member> it = set.iterator();
		while(it.hasNext())
		{
			Member val = it.next();
			System.out.println("이름 : "+val.name+", 나이 : "+val.age);
		}
		System.out.println("m1.hashCode() : " + m1.hashCode());
		System.out.println("m2.hashCode() : " + m2.hashCode());
		System.out.println("m3.hashCode() : " + m3.hashCode());
		
	}

}
