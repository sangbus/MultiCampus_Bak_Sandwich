package day05;
import java.util.*;
public class number7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int[] coinUnit = {500,100,50,10};
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++)
		{
			System.out.println(coinUnit[i]+"원 : "+ money / coinUnit[i]);
			money%=coinUnit[i];
		}
	}

}
