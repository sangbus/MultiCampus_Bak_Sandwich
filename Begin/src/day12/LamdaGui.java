package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LamdaGui extends JFrame{
	JPanel p = new JPanel();
	JPanel pN = new JPanel();
	JLabel lb;
	JButton bt1, bt2;
	public LamdaGui() {
		super("::LamdaGui::");
		add(p,"Center");
		p.setLayout(new BorderLayout());
		lb=new JLabel(new ImageIcon("myicon.PNG"));
		lb.setText("Welcom to MyApp");
		lb.setHorizontalTextPosition(JLabel.CENTER);
		lb.setVerticalTextPosition(JLabel.TOP);
		lb.setFont(new Font("sans-serif",Font.BOLD,24));
		p.add(pN,"North");
		p.add(lb,"Center");
		bt1 = new JButton("Blue");
		bt2 = new JButton("Pink");
		pN.add(bt1);
		pN.add(bt2);
		bt1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				lb.setForeground(Color.green);
			}
		});
		bt2.addActionListener(e->{lb.setForeground(Color.pink);});
		
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new LamdaGui();
	}

}
