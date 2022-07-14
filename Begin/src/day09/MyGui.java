package day09;
import javax.swing.*;
import java.awt.*;
public class MyGui extends JFrame{
	public MyGui()
	{
		super("::MyGui Program v1.1::");
	}
	public static void main(String[] args)
	{
		MyGui my = new MyGui();
		my.setSize(500,500);
		my.setVisible(true);
	}
}
