package day08;

public class cafe {

	public static void main(String[] args) {
		coffeeMachine cm = new coffeeMachine();
		System.out.println(cm.makeTea(1, 1, 2));//밀크커피
		cm.makeTea(2, 2);	//설탕커피
		cm.makeTea(4);	//블랙커피
		cm.makeTea(15,(short)16);	//크림커피
		System.out.println(cm.makeTea((short)2,4));	//크림커피
		cm.makeTea(15);
		yuja x = new yuja();
		x.setYuja(3);
		x.setSugar(3);
		cm.makeTea(x);
	}

}
