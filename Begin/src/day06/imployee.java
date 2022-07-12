package day06;
import java.util.*;
public class imployee {
	int no;
	String name;
	String dept;
	int salary;
	Date indate;
	
	public void work(String type)
	{
		System.out.println(name+"은 "+type+"의 일을 하고 있습니다.");
	}
	public int receive_sal()
	{
		return salary*12;
	}
}
