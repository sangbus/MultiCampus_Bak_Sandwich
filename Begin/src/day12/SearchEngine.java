package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyJPanel extends JPanel
{
	@Override
	public Insets getInsets()
	{
		Insets in = new Insets(10,10,10,10);
		return in;
	}
}
public class SearchEngine extends JFrame {
	JPanel p = new MyJPanel();
	JButton[] bt = new JButton[4];
	String[] str = {"Naver","Google","Daum","Yahoo"};
	public SearchEngine()
	{
		super("::SearchEngine::");
		add(p,"Center");
		p.setLayout(new GridLayout(2,2,10,10));
		for(int i=0; i<bt.length;i++)
		{
			bt[i]=new JButton(str[i]);
			p.add(bt[i]);
		}
		bt[0].addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				bt[0].setBackground(Color.green);
				setTitle(str[0]+"버튼을 클릭하시와용");
			}
		});
		
		bt[1].addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				bt[1].setBackground(Color.blue);
				setTitle(str[1]+"버튼을 클릭했네");
			}
		});
		bt[2].addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Object obj = e.getSource();
				String cmd = e.getActionCommand();
				setTitle(cmd);
				((JButton)obj).setBackground(Color.pink);
			}
		});
		bt[3].addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				bt[3].setBackground(Color.blue);
				setTitle(str[3]+"버튼을 클릭했네");
			}
		});
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		SearchEngine my = new SearchEngine();
		my.setSize(500,500);
		my.setVisible(true);
	}

}
