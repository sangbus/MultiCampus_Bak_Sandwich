package day06;

public class house {
	int room;
	String addr;
	String owner;
	
	public void showInfo()
	{
		System.out.println("----House정보----");
		System.out.println("소유주 : "+owner);
		System.out.println("방 수 : "+room);
		System.out.println("주 소 : "+addr);
	}
	public String existAt(int bunji)
	{
		String str = owner + "의 집은 "+addr+" "+bunji+"번지에 위치합니다.";
		return str;
	}
	public void hometype(String type,int money)
	{
		switch(type)
		{
		case "매매":
			System.out.println("매매가 : "+money+"만원");
			break;
		default :
			System.out.println("임대가 : "+money+"만원");
		}
	}
}
