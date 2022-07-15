package day10;
import javax.swing.*;
import java.awt.*;
public class MyBorderLayOut extends JFrame {
	JButton[] bt = new JButton[5];
	JPanel p = new JPanel();
	JPanel pN = new JPanel();
	public MyBorderLayOut() {
		super("::MyBorderLayout::");
		add(p);
		p.setLayout(new BorderLayout());
		for(int i=0;i<bt.length;i++)
		{
			bt[i]=new JButton("b"+(i+1));
		}
		p.add(pN,"North");
		p.add(bt[0],"North");
		p.add(bt[1],"South");
		p.add(bt[2],"West");
		p.add(bt[3],"East");
		p.add(bt[4],"Center");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyBorderLayOut my = new MyBorderLayOut();
		my.setSize(500,500);
		my.setVisible(true);
	}

}
