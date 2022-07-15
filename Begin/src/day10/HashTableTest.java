package day10;
import java.util.*;
public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<String, Integer> h1= new Hashtable<>();
		h1.put("생년", 2012);
		h1.put("나이", Integer.valueOf(20));
		h1.put("연봉", 5000);
		Integer age = h1.get("나이");
		System.out.println("age : "+age+"세");
		Enumeration<String> e = h1.keys();
		while(e.hasMoreElements())
		{
			String key = e.nextElement();
			h1.get(key);
			System.out.println(Integer.valueOf(0));
		}
		Set<String> set = h1.keySet();
		for(String ky : set)
		{
			System.out.println(ky);
		}
		Collection<Integer> co = h1.values();
		for(Integer kk : co)
		{
			System.out.println(kk);
		}
		System.out.println(h1.containsKey("생년"));
		System.out.println(h1.containsValue(2012));
		//Eumeration<k> keys()
		//Set<k> keySet()
		//Collection<V> values()
		//boolean containKey(Object key) : key값을 포함하고 있으면 true
		//boolean containsValue(Object value)
	}

}
