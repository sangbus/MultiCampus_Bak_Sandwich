package day10;
import javax.swing.*;
import java.awt.*;

public class MyFlowLayOut extends JFrame {
	JButton b1,b2,b3,b4;
	JPanel p;
	public MyFlowLayOut() {
		super("::MyFlowLayOut::");
		p=new JPanel();
		this.add(p);
		p.setBackground(Color.white);
		p.setLayout(new FlowLayout(FlowLayout.LEFT));
		b1=new JButton("         b1        ");
		b2=new JButton("b2");
		b3=new JButton("b3");
		b4=new JButton("b4");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MyFlowLayOut my = new MyFlowLayOut();
		my.setSize(500,500);
		my.setVisible(true);
	}
}
