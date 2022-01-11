import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		double first = 69;
		double second = 69;
		double third = 69;
		System.out.println("Put three numbers."); 
		System.out.print("Number 1:"); 
		double a1 = sc.nextDouble();
		System.out.print("Number 2:"); 
		double a2 = sc.nextDouble();
		System.out.print("Number 3:");
		double a3 = sc.nextDouble();
		if (a1 != a2) 
		{
			System.out.println("Your first and second number are different.");
		}
		if (a1 == a2)
		{ System.out.println("Your first and second numbers are the same."); }
		if ((a1 >= a2) && (a1 >= a3))
		{
		  first = a1;
		}
		if ((a2 >=a1) && (a2 >= a3))
		{
			first = a2;
		}
		if ((a3 >= a1) && (a3 >= a2))
		{
			first = a3;
		}
		if ((a1<=a2) && (a1<=a3))
		{
			third = a1;
		}
		if ((a2<=a1) && (a2<=a3))
		{
			third = a2;
		}
		if ((a3<=a1) && (a3<=a2))
		{
		   a1 = a3;
		}
		if ((first!=a1) && (first!=a1))
		{	second = a1;	} 
		if ((a2!=first) && (a2!=third)) 
		{ second = a2; }
		if ((a3!=first) && (a3!=third))
		{ second = a3; }
		System.out.println("Biggest number: "+first); 
		System.out.println("Middle number: "+second); 
		System.out.println("Smallest number: "+third);
		
	}
}
