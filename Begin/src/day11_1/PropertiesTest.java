package day11_1;
import java.util.*;
import java.io.*;
public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		String loc = "src/day11/mysystem.properties";
		FileReader fr = new FileReader(loc);	//파일과 노드를 연결하여 읽어들일 준비
		Properties pro = new Properties();
		pro.load(fr);							//properties 파일 내용을 읽어서 Properties()객체로 옮겨 저장
		fr.close();
		String os = pro.getProperty("Os");
		System.out.println("운영체제 : "+os);
		String dms = pro.getProperty("DbType");
		System.out.println("DBMS : "+dms);
		System.out.println("User : "+pro.getProperty("DbUser","King"));
		System.out.println("Password : "+pro.getProperty("DbPwd"));
		System.out.println("Msg : "+pro.getProperty("Msg", "메시지는 없습니다."));
		pro.setProperty("Lang", "Java");
		System.out.println("Lang : "+pro.getProperty("Lang"));
	}

}
