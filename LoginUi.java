package com.login;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginUi extends JFrame implements ActionListener
{
	Container c;
	JLabel label1,label2,label3,label4,label0;
	JTextField user;
	JPasswordField pass;
	JButton btn,reset,signUp;
	public static SignUp su;
	
	LoginUi()
	{
		setTitle("LoginForm");
		
		setSize(400,350);
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(null);
		
		label1 = new JLabel("Username ");
		label2 = new JLabel("Password ");
		label0 = new JLabel("Log In");
		label0.setFont(new Font("Arial",Font.ITALIC,20));
		label0.setForeground(Color.BLUE);
		
		label0.setBounds(150,10,80,30);
		label1.setBounds(20,50,150,30);
		label2.setBounds(20,100,150,30);
		
		
		c.add(label0);
		c.add(label1);
		c.add(label2);
		
		user = new JTextField(50);
		pass = new JPasswordField(15);
		
		user.setBounds(175,50,150,30);
		pass.setBounds(175,100,150,30);
		
		c.add(user);
		c.add(pass);
		
		btn = new JButton("login");
		btn.setBounds(150,180,80,30);
		
		reset = new JButton("Reset");
		reset.setBounds(50,180,80,30);
		
		signUp = new JButton("Sign Up");
		signUp.setBounds(250,180,80,30);
		
		c.add(signUp);
		c.add(reset);
		c.add(btn);
		
		
		label3 = new JLabel("success full loged in");
		label3.setForeground(Color.GREEN);
		
		label4 = new JLabel("User Name or password Wrong");
		label4.setForeground(Color.RED);
		
		
		reset.addActionListener(new ActionListener() {

	
			public void actionPerformed(ActionEvent e) {
				
				user.setText(null);
				pass.setText(null);
			}
			
		});
		signUp.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				su = new SignUp();
				su.setVisible(true);
				Start.loginClose();
				
			}
			
		});
		
		btn.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{

		String userI = user.getText();
		String passw = String.valueOf(pass.getPassword());
		
		Registation r = new Registation(userI,passw);
		r.getData();
		
		if(r.flag == true)
		{
			JOptionPane.showMessageDialog(c, label3);
		}
		else
		{
			JOptionPane.showMessageDialog(c, label4);
		}
		
	}
}

//public class LoginForm {
//
//	public static void main(String []args)
//	{
//		LoginUi frame = new LoginUi();
//		frame.setVisible(true);
//	}
//}
