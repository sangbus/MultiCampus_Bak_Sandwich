package day07;

public class Cafe {

	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		cm.setCoffee(2);
		cm.setSugar(3);
		cm.cream=1;
		cm.getCoffee();
		cm.getSugar();
		System.out.println("크림 : "+cm.cream);
	}

}
