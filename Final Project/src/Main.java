import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main implements ActionListener
{
	JLabel l,l1,l2;
	JButton b1,b2;
	Main()
	{
		JFrame frame = new JFrame("PROJECT");
		JPanel jp= new JPanel(null);
		JPanel jp1= new JPanel(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(60,20,710,700);
	    jp.setBackground(Color.gray);
	    jp1.setBounds(150,150,450,300);
	    jp1.setBackground(Color.darkGray);
	    frame.setUndecorated(true);
	    frame.getRootPane().setWindowDecorationStyle(1);
	    b1= new JButton("GPA & CGPA Calculator");
        b1.setBounds(450,500,200,100);
        b1.setBackground(Color.black);
        b1.setForeground(Color.blue);
        b2= new JButton("Currency Converter");
        b2.setBounds(50,500,200,100);
        b2.setBackground(Color.black);
        b2.setForeground(Color.blue);
        l=new JLabel("FINAL PROJECT");
        l.setForeground(Color.black);
        l.setBounds(300,50,250,50);
        Font f = new Font("TimesRoman",Font.BOLD,25);
        l.setFont(f);
        l1=new JLabel("Name:          SABA ZAIRA");
        l1.setBounds(30,50,500,50);
        l1.setForeground(Color.white);
        l1.setFont(f);
        l2=new JLabel("Reg NO.        3908-FBAS/BSCS/F18-A");
        l2.setBounds(30,100,500,50);
        l2.setForeground(Color.white);
        l2.setFont(f);
	    jp.add(b1);
        jp.add(b2);
        jp.add(l);
        jp1.add(l1);
        jp1.add(l2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        frame.add(jp1);
	    frame.add(jp);       
        frame.setVisible(true);
	}	
	public static void main(String[] args)
	{
		new Main();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==b1)
			Gpa.main(new String[] {});
		else if (e.getSource()==b2)
			Currency.main(new String[] {});
		
	}
}
