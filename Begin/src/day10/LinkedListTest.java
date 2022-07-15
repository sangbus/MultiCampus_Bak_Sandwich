package day10;
import java.util.*;
public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		long startTime = System.nanoTime();
		for(int i=0;i<10000;i++)
			list1.add("Hello "+i);
		long endTime = System.nanoTime();
		long gapTime = endTime - startTime;
		System.out.println("ArrayList 걸린 시간 : "+gapTime+"ns");
		System.out.println("list1.size() : "+list1.size());
		System.out.println("******************");
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++)
			list2.add("Hello "+i);
		endTime = System.nanoTime();
		gapTime = endTime - startTime;
		System.out.println("LinkedList 걸린 시간 : "+gapTime+"ns");
	}

}
