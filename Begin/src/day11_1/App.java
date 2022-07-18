package day11_1;
import java.awt.*;
import javax.swing.*;
import day11_1.MyGui.MyEventHandler;
import java.awt.event.*;
public class App extends JFrame {
	JPanel p, pN;
	JButton bR, bG, bB, bExit;
	public App() {
		super("::MySearchEngine::");
		p=new JPanel();
		pN = new JPanel();
		p.setBackground(Color.LIGHT_GRAY);
		add(p,"Center");
		GridLayout layout = new GridLayout(2,2,10,10);
		p.setLayout(layout);
		p.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10));
		bR=new JButton("Google");
		bR.setBackground(Color.yellow);
		bG=new JButton("Naver");
		bG.setBackground(Color.orange);
		bB=new JButton("Daum");
		bB.setBackground(Color.green);
		bExit=new JButton("Yahoo");
		bExit.setBackground(Color.blue);
		p.add(bR);
		p.add(bG);
		p.add(bB);
		p.add(bExit);
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
				setTitle("Google을 선택하셨군요");
			}
			else if(obj==bG)
			{
				setTitle("Naver를 선택하셨군요");
			}
			else if(obj==bB)
			{
				setTitle("Daum을 선택하셨군요");
			}
			else if(obj==bExit)
			{
				setTitle("Yahoo를 선택하셨군요");
			}
		}
	}
	public static void main(String[] args) {
		App m = new App();
		m.setSize(500,500);
		m.setVisible(true);
	}

}
