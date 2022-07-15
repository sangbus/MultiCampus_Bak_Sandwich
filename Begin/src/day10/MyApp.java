package day10;
import javax.swing.*;
import java.awt.*;

public class MyApp extends JFrame{
	JPanel p = new JPanel();
	JPanel pN = new JPanel();
	JButton bt1,bt2,bt3,bt4;
	JTextArea ta1;
	public MyApp() {
		super("::MyApp::");
		add(p);
		p.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bt1 = new JButton("Login");
		bt2 = new JButton("Join");
		bt3 = new JButton("Home");
		bt4 = new JButton("Exit");
		bt1.setBackground(Color.green);
		bt2.setBackground(Color.blue);
		bt3.setBackground(Color.cyan);
		bt4.setBackground(Color.magenta);
		p.add(pN,"North");
		p.setBackground(Color.white);
		pN.setBackground(Color.red);
		ta1=new JTextArea("자바 GUI 과제",5,10);
		JScrollPane sp = new JScrollPane(ta1);
		p.add(sp,"Center");
		ta1.setBackground(Color.orange);
		ta1.setSelectedTextColor(Color.black);
		pN.add(bt1);
		pN.add(bt2);
		pN.add(bt3);
		pN.add(bt4);
	}

	public static void main(String[] args) {
		MyApp my = new MyApp();
		my.setSize(500,500);
		my.setVisible(true);
	}

}
