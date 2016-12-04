import javax.swing.JOptionPane;

  class Passwordchecker
  {
  	public static void main(String [] args)
  
  	{
  	 String s;
  	 int password= 1234;
  	 int counter = 0;
  	 int number;
  	 
  	 
  	 while (counter < 3)
  	 {
  	 	s=JOptionPane.showInputDialog("Enter password");
  	    number=Integer.parseInt(s);
  	 
  	 if (password == number)
  	 {
  	 	JOptionPane.showMessageDialog(null,"Welcome");
  	 	counter = 4;
  	 }
  	 else if (password != number)
  	 {
  	 	if (counter < 2)
  	 	{
  	 		JOptionPane.showMessageDialog(null,"Incorrect, enter the password again");
  	 	}
  	 	else 
  	 	  JOptionPane.showMessageDialog(null,"Your account is now locked");
  	 	  
  	 }
  	 counter ++;
  	 
  	 
  	 }
	
  		
  	}
  }
 