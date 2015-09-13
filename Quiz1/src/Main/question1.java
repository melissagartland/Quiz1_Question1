package Main;
import java.util.Scanner;


public class question1 {

	private static Scanner kb;
	
	public static void main(String[] args) 
	{
		kb = new Scanner(System.in);
		
		double att;
		double comp;
		double yds; 
		double td;
		double iNt;
		
		System.out.print("Enter passes attempted: ");
		att = kb.nextDouble();
		System.out.print("Enter passes completed: ");
		comp = kb.nextDouble();
		System.out.print("Enter passing yards: ");
		yds = kb.nextDouble();
		System.out.print("Enter number of touch downs: ");
		td = kb.nextDouble();
		System.out.print("Enter number of interceptions: ");
		iNt = kb.nextDouble();
		
		double a = ((comp/att) - 3) * 5;
		double b = ((yds/att) - 3) * .25;
		double c = (td/att) * 20;
		double d = 2.375 - ((iNt/att) * 25);
		double passerRating = ((a+b+c+d) / 6) * 100; 
		
		System.out.println("The Passer Rating is : " + passerRating);
		
	}

}
