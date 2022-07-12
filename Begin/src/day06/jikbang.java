package day06;

public class jikbang {

	public static void main(String[] args) {
		house h = new house();
		house h1 = new house();
		h.room = 3;
		h.owner = "박씨";
		h.addr = "부산";
		h1.room = 4;
		h1.owner = "김씨";
		h1.addr = "서울";
		h.showInfo();
		h1.showInfo();
		System.out.println(h.existAt(100));
		System.out.println(h.existAt(100));
		h.hometype("매매",1000);
		h.hometype("전세",100);
	}

}
