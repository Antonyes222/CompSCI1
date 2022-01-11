import java.util.Scanner;

q
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?");
		String firstname = sc.nextLine();
		System.out.println("How old are you?");
	String age = sc.nextLine();
		System.out.println("What month is your birthday in?");
		String month = sc.nextLine();
		
		System.out.println("What day is your birthday in?");
		String day = sc.nextLine();
		System.out.println("What year were you born?");
	String year = sc.nextLine();
		System.out.println("How much is a buck fifty?");
		String buckfifty = sc.nextLine();
		
		System.out.println("Your first name is "+firstname);
		System.out.println("You are "+age+" years old");
		System.out.println("You were born in "+day+" of "+month+", "+year);
		System.out.println("You said a buck fifty was "+buckfifty);
	}
}
