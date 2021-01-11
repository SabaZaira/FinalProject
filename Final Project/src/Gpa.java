import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Gpa implements ActionListener
{
	JTextField tf,t11,t1,t2,t3,t4,t5,t6,p1,p2,p3,p4,p5,p6,gp1,gp2,gp3,gp4,gp5,gp6,a,b,c,d;
	JLabel jl,l,ll,l1,l2,l3,l4,l5,l6,sum,gpa,cgpa;
	JComboBox c1,c2,c3,c4,c5,c6,g1,g2,g3,g4,g5,g6;
	JButton b1,b2,b3;
	JFrame frame;
	Gpa()
	{
		frame = new JFrame("GPA & CGPA Calculator");
		JPanel jp= new JPanel(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(60,20,710,700);
        jp.setBackground(Color.darkGray);
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(1);
        jl=new JLabel("Current CGPA: ");
        jl.setBounds(30,10,500,50);
        l=new JLabel("Total credit hours: ");
        l.setBounds(30,50,500,50);
        ll=new JLabel("NO.                        Subject                            Grade                       Point              *        Credit Hours       =          Grade Points");
        ll.setBounds(30,70,1000,100);
        l1=new JLabel("1                                                                                                                                 *                                      =");
        l1.setBounds(30,130,1000,50);
        l2=new JLabel("2                                                                                                                                 *                                      =");
        l2.setBounds(30,130,1000,140);
        l3=new JLabel("3                                                                                                                                 *                                      =");
        l3.setBounds(30,130,1000,230);
        l4=new JLabel("4                                                                                                                                 *                                      =");
        l4.setBounds(30,130,1000,320);
        l5=new JLabel("5                                                                                                                                 *                                      =");
        l5.setBounds(30,130,1000,410);
        l6=new JLabel("6                                                                                                                                 *                                      =");
        l6.setBounds(30,130,1000,500);
        jl.setForeground(Color.white);
        l.setForeground(Color.white);
        l1.setForeground(Color.white);
        l2.setForeground(Color.white);
        l3.setForeground(Color.white);
        l4.setForeground(Color.white);
        l5.setForeground(Color.white);
        l6.setForeground(Color.white);
        ll.setForeground(Color.white);
        
        tf= new JTextField();
        tf.setBounds(200,20,100,30);
        t11= new JTextField();
        t11.setBounds(200,60,100,30);
        t1= new JTextField();
        t1.setBounds(70,140,150,30);
        t2= new JTextField();
        t2.setBounds(70,185,150,30);
        t3= new JTextField();
        t3.setBounds(70,230,150,30);
        t4= new JTextField();
        t4.setBounds(70,275,150,30);
        t5= new JTextField();
        t5.setBounds(70,320,150,30);
        t6= new JTextField();
        t6.setBounds(70,365,150,30);
        b2= new JButton("HOME");
        b2.setBounds(560,20,105,30);
        b3= new JButton("CLOSE");
        b3.setBounds(70,450,105,30);

        b2.setBackground(Color.black );
        b2.setForeground(Color.blue);
        b3.setBackground(Color.black );
        b3.setForeground(Color.red);
        p1= new JTextField();
        p1.setBounds(330,140,70,30);
        p1.setEditable(false);
        p2= new JTextField();
        p2.setBounds(330,185,70,30);
        p2.setEditable(false);
        p3= new JTextField();
        p3.setBounds(330,230,70,30);
        p3.setEditable(false);
        p4= new JTextField();
        p4.setBounds(330,275,70,30);
        p4.setEditable(false);
        p5= new JTextField();
        p5.setBounds(330,320,70,30);
        p5.setEditable(false);
        p6= new JTextField();
        p6.setBounds(330,365,70,30);
        p6.setEditable(false);
        String st[]={"select","A","B+","B","C+","C","D+","D","F"};
        g1=new JComboBox(st);
        g1.setBounds(240,140,70,30);
        g2=new JComboBox(st);
        g2.setBounds(240,185,70,30);
        g3=new JComboBox(st);
        g3.setBounds(240,230,70,30);
        g4=new JComboBox(st);
        g4.setBounds(240,275,70,30);
        g5=new JComboBox(st);
        g5.setBounds(240,320,70,30);
        g6=new JComboBox(st);
        g6.setBounds(240,365,70,30);
        sum= new JLabel("Sum :");
        sum.setBounds(350,510,70,30);
        gpa= new JLabel("GPA :");
        gpa.setBounds(350,560,70,30);
        cgpa= new JLabel("CGPA :");
        cgpa.setBounds(350,610,70,30);

        sum.setForeground(Color.white);
        gpa.setForeground(Color.white);
        cgpa.setForeground(Color.white);
        String ch[]={"select","3","4"};
        c1=new JComboBox(ch);
        c1.setBounds(450,140,70,30);
        c2=new JComboBox(ch);
        c2.setBounds(450,185,70,30);
        c3=new JComboBox(ch);
        c3.setBounds(450,230,70,30);
        c4=new JComboBox(ch);
        c4.setBounds(450,275,70,30);
        c5=new JComboBox(ch);
        c5.setBounds(450,320,70,30);
        c6=new JComboBox(ch);
        c6.setBounds(450,365,70,30);
        a= new JTextField();
        a.setBounds(450,510,70,30);
        a.setEditable(false);
        gp1= new JTextField();
        gp1.setBounds(580,140,70,30);
        gp1.setEditable(false);
        gp2= new JTextField();
        gp2.setBounds(580,185,70,30);
        gp2.setEditable(false);
        gp3= new JTextField();
        gp3.setBounds(580,230,70,30);
        gp3.setEditable(false);
        gp4= new JTextField();
        gp4.setBounds(580,275,70,30);
        gp4.setEditable(false);
        gp5= new JTextField();
        gp5.setBounds(580,320,70,30);
        gp5.setEditable(false);
        gp6= new JTextField();
        gp6.setBounds(580,365,70,30);
        gp6.setEditable(false);
        b= new JTextField();
        b.setBounds(580,510,70,30);
        b.setEditable(false);
        c= new JTextField();
        c.setBounds(580,560,70,30);
        c.setEditable(false);
        d= new JTextField();
        d.setBounds(580,610,70,30);
        d.setEditable(false);
        b1= new JButton("CALCULATE");
        b1.setBounds(560,450,105,30);
        b1.setBackground(Color.black );
        b1.setForeground(Color.blue);
        g1.addActionListener(this);
        c1.addActionListener(this);
        g2.addActionListener(this);
        c2.addActionListener(this);
        g3.addActionListener(this);
        c3.addActionListener(this);
        g4.addActionListener(this);
        c4.addActionListener(this);
        g5.addActionListener(this);
        c5.addActionListener(this);
        g6.addActionListener(this);
        c6.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        jp.add(b1);
        jp.add(b2);
        jp.add(b3);
        jp.add(c1);
        jp.add(c2);
        jp.add(c3);
        jp.add(c4);
        jp.add(c5);
        jp.add(c6);
        jp.add(g1);
        jp.add(g2);
        jp.add(g3);
        jp.add(g4);
        jp.add(g5);
        jp.add(g6);
        jp.add(jl);
        jp.add(l);
        jp.add(ll);
        jp.add(l1);
        jp.add(l2);
        jp.add(l3);
        jp.add(l4);
        jp.add(l5);
        jp.add(l6);
        jp.add(tf);
        jp.add(t11);
        jp.add(t1);
        jp.add(t2);
        jp.add(t3);
        jp.add(t4);
        jp.add(t5);
        jp.add(t6);
        jp.add(p1);
        jp.add(p2);
        jp.add(p3);
        jp.add(p4);
        jp.add(p5);
        jp.add(p6);
        jp.add(gp1);
        jp.add(gp2);
        jp.add(gp3);
        jp.add(gp4);
        jp.add(gp5);
        jp.add(gp6);
        jp.add(sum);
        jp.add(gpa);
        jp.add(cgpa);
        jp.add(a);
        jp.add(b);
        jp.add(c);
        jp.add(d);
        frame.add(jp);       
        frame.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Gpa();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String p=c1.getSelectedItem().toString();
		String q=c2.getSelectedItem().toString();
		String r=c3.getSelectedItem().toString();
		String s=c4.getSelectedItem().toString();
		String t=c5.getSelectedItem().toString();
		String u=c6.getSelectedItem().toString();
		String gr=g1.getSelectedItem().toString();
		String gw=g2.getSelectedItem().toString();
		String ge=g3.getSelectedItem().toString();
		String gt=g4.getSelectedItem().toString();
		String gl=g5.getSelectedItem().toString();
		String gn=g6.getSelectedItem().toString();
		Home s1=new Home();
		if (e.getSource()==g1)
			p1.setText(s1.point(gr));
		else if(e.getSource()==c1)
			gp1.setText(s1.credit(p,p1.getText()));
		else if (e.getSource()==g2)
			p2.setText(s1.point(gw));
		else if(e.getSource()==c2)
			gp2.setText(s1.credit(q,p2.getText()));
		else if (e.getSource()==g3)
			p3.setText(s1.point(ge));
		else if(e.getSource()==c3)
			gp3.setText(s1.credit(r,p3.getText()));
		else if (e.getSource()==g4)
			p4.setText(s1.point(gt));
		else if(e.getSource()==c4)
			gp4.setText(s1.credit(s,p4.getText()));
		else if (e.getSource()==g5)
			p5.setText(s1.point(gl));
		else if(e.getSource()==c5)
			gp5.setText(s1.credit(t,p5.getText()));
		else if (e.getSource()==g6)
			p6.setText(s1.point(gn));
		else if(e.getSource()==c6)
			gp6.setText(s1.credit(u,p6.getText()));
		else if(e.getSource()==b1)
		{
			a.setText(s1.csum(p,q,r,s,t,u,gr,gw,ge,gt,gl,gn));
			b.setText(s1.gpsum(gp1.getText(),gp2.getText(),gp3.getText(),gp4.getText(),gp5.getText(),gp6.getText()));
			c.setText(s1.agpa(a.getText(),b.getText()));
			d.setText(s1.cgpa(t11.getText(),a.getText(),tf.getText(),c.getText(),b.getText()));
		}
		else if(e.getSource()==b3||e.getSource()==b2)
			frame.dispose();
	}

}
