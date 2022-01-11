import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int rnumber = rand.nextInt(1000)+1;
		System.out.println("You have 1 try to guess the number between 1-1000."); 
		System.out.print("Your guess:");
		int t1 = sc.nextInt();
		if (t1 == rnumber)
		{System.out.println("You guess correctly! The number was "+rnumber);}
		else
		{System.out.println("YOu are wrong. The number was "+rnumber);}
	}
}
