import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Write two numbers.");
		double a1 = sc.nextDouble();
		double a2 = sc.nextDouble();
		boolean daivd = a1 != a2;
		if(daivd)
		{
			System.out.println("The numbers "+a1+" and "+a2+" are not the same numbers.");
		}
	} 
}
