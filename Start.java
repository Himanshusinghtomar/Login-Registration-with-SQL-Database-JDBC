package com.login;

public class Start {
	public static LoginUi frame;
	public void login()
	{
		 frame = new LoginUi();
		frame.setVisible(true);
	}
	
	public static void loginClose()
	{
		try {
			frame.setVisible(false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//LoginUi frame = new LoginUi();
		//System.exit(0);
	}

	public static void main(String[] args) {

		Start s = new Start();
		s.login();
		
	}

}
