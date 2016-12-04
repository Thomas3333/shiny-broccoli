//Thomas Lynch 
//M00426654
//

import javax.swing.JOptionPane;
class CostFuel
{
	public static void main(String[] args)
	{
		String s,d;
		double amount=1;
		double cost;
		double total;
		
		while (amount !=0)
		{
			s=JOptionPane.showInputDialog("please enter the amount of fuel in liter");
			amount=Double.parseDouble(s);
			if (amount!=0){
			
			d=JOptionPane.showInputDialog("please enter the cost per liter");
			cost=Double.parseDouble(d);
			
			calcfuel(amount, cost);	
			}
		}
		System.exit(0);
		
	
	}
	public static void calcfuel(double amount, double cost)
	{
		double total = amount * cost;
		System.out.println("the total cost is : £"+total);
	}
}