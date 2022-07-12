package day07;

public class constructorTest {

	public static void main(String[] args) {
		person p = new person("미미");
		System.out.println(p.age);
		System.out.println(p.name);
		person p1 = new person();
		System.out.println(p1.age);
		System.out.println(p1.name);
		person p2 = new person("문윤희",22);
		System.out.println(p2.age);
		System.out.println(p2.name);
		person p3 = new person(27,"이재식");
		System.out.println(p3.age);
		System.out.println(p3.name);
		}
}
