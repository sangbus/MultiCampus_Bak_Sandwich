package day09;
import javax.swing.*;
import java.awt.*;
public class MyGui extends JFrame{
	JPanel p;
	JButton bt1,bt2,bt3,bt4,bt5;
	Icon icon1, icon2, icon3, icon4, icon5;
	JTextField tf1, tf2;
	JTextArea ta1, ta2;
	
	public MyGui()
	{
		super("::MyGui Program v1.1::");
		p=new JPanel();
		add(p);
		p.setBackground(Color.green);
		icon1 = new ImageIcon("ikon1.PNG");
		icon2 = new ImageIcon("ikon2.PNG");
		icon3 = new ImageIcon("ikon3.PNG");
		icon4 = new ImageIcon("ikon4.PNG");
		icon5 = new ImageIcon("ikon5.PNG");
		bt1 = new JButton(icon1);
		bt2 = new JButton(icon2);
		bt3 = new JButton(icon3);
		bt4 = new JButton("Home",icon4);
		bt4.setHorizontalTextPosition(JButton.CENTER);
		bt5 = new JButton("Login",icon5);
		bt5.setHorizontalTextPosition(JButton.CENTER);
		bt5.setVerticalTextPosition(JButton.BOTTOM);
		bt5.setPressedIcon(icon1);
		bt5.setRolloverIcon(icon2);
		p.add(bt1);
		p.add(bt2);
		p.add(bt3);
		p.add(bt4);
		p.add(bt5);
		tf1=new JTextField(40);
		tf2=new JTextField("네이버를 검색하세요.",30);
		tf1.setBackground(Color.gray);
		tf1.setForeground(Color.blue);
		tf1.setBackground(Color.red);
		
		ta1=new JTextArea("안녕하세요. 반갑습니다~~^^&&",5,20);
		ta2=new JTextArea(10,30);
		p.add(tf1);
		p.add(tf2);
		JScrollPane sp = new JScrollPane(ta1);
		p.add(sp);
		p.add(new JScrollPane(ta2));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		MyGui my = new MyGui();
		my.setSize(500,500);
		my.setVisible(true);
	}
}
