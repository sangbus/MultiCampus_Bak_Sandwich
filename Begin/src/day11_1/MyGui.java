package day11_1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyGui extends JFrame {
	JPanel p, pN;
	JTextArea ta;
	JButton bR, bG, bB, bExit;
	public MyGui()
	{
		super("::MyGui::");
		p=new JPanel();
		p.setBackground(Color.LIGHT_GRAY);
		add(p,"Center");
		p.setLayout(new BorderLayout());
		pN=new JPanel();
		pN.setBackground(new Color(180,50,100));
		p.add(pN,"North");
		ta=new JTextArea("안녕");
		p.add(new JScrollPane(ta),"Center");
		bR=new JButton("Red");
		bG=new JButton("Green");
		bB=new JButton("Blue");
		bExit=new JButton("Exit");
		pN.add(bR);
		pN.add(bG);
		pN.add(bB);
		pN.add(bExit);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyEventHandler handler = new MyEventHandler();
		bR.addActionListener(handler);
		bG.addActionListener(handler);
		bB.addActionListener(handler);
		bExit.addActionListener(handler);
	}
	class MyEventHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			Object obj = e.getSource();	//이벤트 소스에 대한 정보를 반환
			if(obj==bR)
			{
				ta.setBackground(Color.red);
				ta.setForeground(Color.BLUE);
			}
			else if(obj==bG)
			{
				ta.setForeground(Color.green);
			}
			else if(obj==bB)
			{
				ta.setForeground(Color.red);
			}
			else if(obj==bExit)
			{
				System.exit(0);
			}
		}
	}
	public static void main(String[] args) {
		MyGui m = new MyGui();
		m.setSize(500,500);
		m.setVisible(true);
	}

}
