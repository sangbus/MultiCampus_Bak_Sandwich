package day08;

public class Inheritance {

	public static void main(String[] args) {
		human h1 = new human("홍길동",180);
		System.out.println(h1.getInfo());
		superman s = new superman();
		s.name="김슈퍼";
		s.height=189;
		s.power=500;
		System.out.println(s.getInfo());
		aquaman a = new aquaman();
		a.name="고등어";
		a.height=150;
		a.speed=300;
		System.out.println(a.getInfo());
		System.out.println(s.getInfo("영웅"));
		superman s1 = new superman();
		s1.name="슈퍼맨";
		s1.height=190;
		s1.power=400;
		System.out.println(s1.getInfo());
		System.out.println(s1.getInfo("어벤져스"));
		s1.getInfo("체육",100);
		superman s2 = new superman("울트라 슈퍼맨",166,2000);
		s2.getInfo("슈퍼맨 파워 다운",-500);
	}

}
