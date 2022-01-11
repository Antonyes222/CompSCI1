import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int a1 = rand.nextInt(1000)+1;
	System.out.println("You'll be playing a guessing games from the 1-1000");
	while(true)
	{ System.out.print("Your Guess: ");
	int guess = sc.nextInt();
	if (guess==a1)
	{ System.out.println("You got it correct!");
		break;
	}
	else
	{ System.out.println("That was incorrect. Try again.");}}
	


		
	}
}
