import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class Currency implements ActionListener
{
	JTextField t1,t2;
	JLabel l1,l2,l3,l4;
	JComboBox c1,c2;
	JButton b1,b2,b3;
	JFrame frame;
	Currency()
	{
		frame = new JFrame("Currency Converter");
		JPanel jp= new JPanel(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(60,20,710,700);
        jp.setBackground(Color.darkGray);
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(1);
        String st[]={"                              Select                              ","Pakistan Rupee                           -PKR","Euro                                                -EUR","US Dollar                                       -USD","Indian Rupee                                -INR","UAE Dirham                                  -AED","Turkish Lira                                 -TRY","Qatri Rial                                      -QAR","Bruneian Dollar                          -BND","Singapore Dollar                        -SGD","Saudi Riyal                                  -SAR","Chinese Yuan                             -CNY"};
        c1=new JComboBox(st);
        c1.setBounds(50,240,250,50);
        c2=new JComboBox(st);
        c2.setBounds(400,240,250,50);
        l1=new JLabel("Amount You Have:");
        l1.setBounds(50,60,130,50);
        l2=new JLabel("Amount You Want:");
        l2.setBounds(50,350,130,50);
        l3=new JLabel("Curreny You Have:");
        l3.setBounds(50,200,130,50);
        l4=new JLabel("Currency You Want:");
        l4.setBounds(400,200,130,50);
        t1= new JTextField();
        t1.setBounds(230,100,250,50);
        t2= new JTextField();
        t2.setBounds(230,400,250,50);
        t2.setEditable(false);
        b1= new JButton("CALCULATE");
        b1.setBounds(230,470,250,50);
        b2= new JButton("HOME");
        b2.setBounds(300,550,105,30);
        b3= new JButton("CLOSE");
        b3.setBounds(300,600,105,30);
        b2.setBackground(Color.black );
        b2.setForeground(Color.blue);
        b3.setBackground(Color.black );
        b3.setForeground(Color.red);
        b1.setBackground(Color.black );
        b1.setForeground(Color.blue);
        l1.setForeground(Color.white);
        l2.setForeground(Color.white);
        l3.setForeground(Color.white);
        l4.setForeground(Color.white);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        c1.addActionListener(this);
        c2.addActionListener(this);
        jp.add(b1);
        jp.add(b2);
        jp.add(b3);
        jp.add(c1);
        jp.add(c2);
        jp.add(l1);
        jp.add(l2);
        jp.add(l3);
        jp.add(l4);
        jp.add(t1);
        jp.add(t2);
        frame.add(jp);       
        frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Currency();
	}
	

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String p=c1.getSelectedItem().toString();
		String q=c2.getSelectedItem().toString();
		Home s=new Home();
		
		if (e.getSource()==b1||e.getSource()==c1||e.getSource()==c2)
			t2.setText(s.convert(t1.getText(),p,q));
		else if(e.getSource()==b3||e.getSource()==b2)
			frame.dispose();
	}
}
