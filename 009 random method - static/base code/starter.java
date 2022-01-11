import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int a1 = rand.nextInt(10);
		int a2 = rand.nextInt(100)+1;
		double a3 = rand.nextDouble()+2.5;
		int a4 = rand.nextInt(575)+14;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
	}
}
