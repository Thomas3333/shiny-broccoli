/**
 * @(#)TriangleArea.java
 * @Thomas Lynch 
 * @version 1.00 2013/3/1
 */
import javax.swing.JOptionPane;

public class TriangleArea 
{

    public static void main (String[] args) 
    	{
    		
    	String a,b;
		double base=1;
		double height;
		double area;	
    		
    		while (base !=0)
			{
				a=JOptionPane.showInputDialog("please enter the base lenght of triangle");
				base=Double.parseDouble(a);
			
			if (base!=0)	
				{
					b=JOptionPane.showInputDialog("please enter the height of triangle");
					height=Double.parseDouble(b);	
					
					calcArea(base, height);		
				}
			}
    
    		System.exit(0);
		}
	public static void calcArea(double base, double height)
	{
		double area = base * height / 2;
		System.out.println("the total area is :"+area);
	}

}
