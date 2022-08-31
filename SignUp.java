package com.login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignUp extends JFrame implements ActionListener
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l1,l2,l3,label0;
	JTextField t1;
	JPasswordField p1;
	JButton btn,login,reset;
	Container c;
	SignUp f;
	
	SignUp()
	{
		//Main operation of Swing
		setTitle("Sign Up");
		setSize(400,350);
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Container of gui
		c = getContentPane();
		c.setLayout(null);
		
		//all element adding
		label0 = new JLabel("Sign Up");
		label0.setFont(new Font("Arial",Font.ITALIC,20));
		label0.setForeground(Color.BLUE);
		l1 = new JLabel("Enter Your UserName : ");
		l2 = new JLabel("Enter Your Password : ");
		l3 = new JLabel("Sign Up Done");
		l3.setForeground(Color.red);
		
		l1.setBounds(20,50,150,30);
		l2.setBounds(20,100,150,30);
		label0.setBounds(150,10,80,30);
		
		
		
		c.add(label0);
		c.add(l1);
		c.add(l2);
		
		//text fields
		t1 = new JTextField(50);
		p1 = new JPasswordField(15);
		
		t1.setBounds(175,50,150,30);
		p1.setBounds(175,100,150,30);
		
		c.add(t1);
		c.add(p1);
		
		btn = new JButton("Sign Up");
		btn.setBounds(150,180,80,30);
		
		reset = new JButton("Reset");
		reset.setBounds(50,180,80,30);
		
		login = new JButton("Log In");
		login.setBounds(250,180,80,30);
		
		
		c.add(login);
		c.add(reset);
		c.add(btn);
		
		
	
		btn.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e) {
						
						String user = t1.getText();
						String pass = String.valueOf(p1.getPassword());
						Registation r = new Registation(user,pass);
						r.setData();
						JOptionPane.showMessageDialog(c, l3);
					}
					
				});
		reset.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				t1.setText(null);
				p1.setText(null);
			}
			
		});
		login.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Start s = new Start();
				s.login();
				LoginUi.su.setVisible(false);
				
				
			}
			
		});
		
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	
}
