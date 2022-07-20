package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 퐁씨 성을 가진 사람들이 이용할 수 있는 애플리케이션
 * 작성자 : 홍길동
 * 작성일 : 22-07-19
 * 버전 : 1.1
 * */
public class PongApp extends JFrame{
	JPanel p = new JPanel();
	JPanel pN = new JPanel();
	JTextArea ta;
	JLabel lb;
	JTextField tfName;
	JButton btAdd,btSave;
	public PongApp() {
		super("::PongApp::");
		add(p,"Center");
		p.setLayout(new BorderLayout());
		p.add(pN,"North");
		pN.setBackground(Color.cyan);
		p.add(new JScrollPane(ta=new JTextArea()),"Center");
		lb = new JLabel("이 름 : ");
		tfName = new JTextField(20);
		btAdd = new JButton("등 록");
		btSave = new JButton("저 장");
		pN.add(lb);
		pN.add(tfName);
		pN.add(btAdd);
		pN.add(btSave);

		pN.add(btSave);
		//=====리스너 부착=====
		MyEventHandler handler = new MyEventHandler();
		btAdd.addActionListener(handler);
		btSave.addActionListener(handler);
		tfName.addActionListener(handler); // 입력 후 enter치면 ActionEvent 발생함
		
		setSize(500,700);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/**
	 * 버튼에 태한 이벤트를 처리하는 클래스
	 * */
	class MyEventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Object obj = e.getSource();
			if(obj==btAdd || obj == tfName)
			{
				//setTitle("add");
				String name = tfName.getText();
				name = name.replaceAll("\\s", "");
				char arr[] = name.toCharArray();
				try 
				{
					if(arr[0]=='퐁')
					{
						setTitle(name+"님 환영합니다.");
						ta.append(name+"\n"); 
					}
					else if(arr[0]=='콩')
					{
						// 사용자 정의 예외 객체를 발생시킨다 ==> throw new 예외객체()
						// 예외가 발생되면 해당 예외를 try~catch해야한다.
						throw new NotSupportedNameException("콩씨는 절대로 등록할 수 없다 !");
					}
					else
					{
						throw new NotSupportedNameException("퐁씨가 아닌 성씨분들은 이용에 제한이 있습니다.");
					}
				}
				catch(NotSupportedNameException ex)
				{
					String msg = ex.getMessage();
					setTitle(msg);
					JOptionPane.showMessageDialog(p, msg);
				}
				finally
				{
					tfName.setText(""); // 입력 초기화
					tfName.requestFocus(); // 입력 포커스
				}
			}
			else if(obj==btSave)
			{
				//setTitle("save");
			}
		}
	}
	public static void main(String[] args) {
		new PongApp();
	}
}
