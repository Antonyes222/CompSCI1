import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile andta run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a Wizard, Warrior, or Rogue? CAP SENSITIVE!"); 
		System.out.print("Put in your class: ");
		String cls = sc.nextLine();
		if ((cls.equals("Rogue")) || (cls.equals("Warrior")) || (cls.equals("Wizard")))
		{	System.out.print("I see, "+cls+" is your class!");	}
		else 
		{ System.out.print(cls+" is not a real class!");}
	    
	}
}
