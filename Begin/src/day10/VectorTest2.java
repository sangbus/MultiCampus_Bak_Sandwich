package day10;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class VectorTest2 {

	public static void main(String[] args) {
		Student st1 = new Student(1,"홍길동");
		Student st2 = new Student();
		Student st3 = new Student();
		st2.setId(2);
		st2.setName("김민수");
		Vector<Student> v = new Vector<Student>(3,5);
		v.add(st1);
		v.add(st2);
		v.add(st3);
		for(int i=0;i<v.size();i++)
		{
			System.out.print("ID : "+v.get(i).getId());
			System.out.println("\tName : "+v.get(i).getName());
		}
		for(Student a : v)
		{
			System.out.println("ID : "+a.getId()+"\tName : "+a.getName());
		}
		//public Enumeration<E> elements()
		//public Iterator<E> iterator() 
		 Enumeration<Student> en = v.elements();
		 while(en.hasMoreElements())
		 {
			 Student e = en.nextElement();
			 System.out.println(e.getName());
		 }
		 Iterator<Student> it = v.iterator();
		 while(it.hasNext())
		 {
			 Student a = it.next();
			 System.out.println(a.getName());
		 }
	}

}
