import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int sp = 25;
		int Str = 0;
		int Dex = 0;
		int Int = 0;
		int Con = 0;
		int Cha = 0;
		System.out.print("Enter your name:");
		String name = sc.nextLine();
		System.out.println("What is your title?");
		String title = sc.nextLine();
		System.out.println("Are you a Wizard, Warrior, or Rogue? CAP SENSITIVE!"); 
		System.out.print("Put in your class: ");
		String cls = sc.nextLine();
		if ((cls.equals("Rogue")) || (cls.equals("Warrior")) || (cls.equals("Wizard")))
		{	System.out.println("I see, "+cls+" is your class!");	}
		else 
		{ System.out.println(cls+" is not a real class! Try again.");
			String cls1 = sc.nextLine();
			if ((cls.equals("Rogue")) || (cls.equals("Warrior")) || (cls.equals("Wizard")))
			{ System.out.println("I see, "+cls1+" is your class!");
				cls = cls1;}
			else {System.out.println("You chose wrong choices, so your class will be none.");
			cls = new String("None ur dumb");}
		}
		System.out.println("You have 25 skill points to invest into your traits. You can't put more than 10 in each skill.");
		System.out.println("Strength - Buff and able to carry larger items");
		System.out.println("Dexterity - Agile and moves quick.");
		System.out.println("Intelligence - Better at magic spells!");
		System.out.println("Constitution - How much health");
		System.out.println("Charisma - How personable.");
		if (sp!=0)
		{ System.out.print("Strength:");
		int a1 = sc.nextInt();
			if ((a1<=sp) && (a1<=10))
			{ Str = a1;
			sp = sp-a1;
			System.out.println("You have "+sp+" points left.");}
			else
			{System.out.println("That was an invalid input. Please try again.");
			System.out.print("Strength: ");
			int b1 = sc.nextInt();
			if ((b1<=sp) && (b1<=10))
			{ Str = b1;
			sp = sp-b1;
			System.out.println("You have "+sp+" points left.");}
			else {System.out.println("bruh");}
			}
		}
		
		
		if (sp!=0)
		{ System.out.print("Dexterity:");
		int a2 = sc.nextInt();
			if ((a2<=sp) && (a2<=10))
			{ Dex = a2;
			sp = sp-a2;
			System.out.println("You have "+sp+" points left.");}
			else
			{System.out.println("That was an invalid input. Please try again.");
			System.out.print("Dexterity: ");
			int b2 = sc.nextInt();
			if ((b2<=sp) && (b2<=10))
			{ Dex = b2;
			sp = sp-b2;
			System.out.println("You have "+sp+" points left.");}
			else {System.out.println("bruh");}
			}
		}
		
		
			if (sp!=0)
		{ System.out.print("Intelligence:");
		int a3 = sc.nextInt();
			if ((a3<=sp) && (a3<=10))
			{ Int = a3;
			sp = sp-a3;
			System.out.println("You have "+sp+" points left.");}
			else
			{System.out.println("That was an invalid input. Please try again.");
			System.out.print("Intelligence: ");
			int b3 = sc.nextInt();
			if ((b3<=sp) && (b3<=10))
			{ Int = b3;
			sp = sp-b3;
			System.out.println("You have "+sp+" points left.");}
			else {System.out.println("bruh");}
			}
		}
		
		
		if (sp!=0)
		{ System.out.print("Constitution:");
		int a4 = sc.nextInt();
			if ((a4<=sp) && (a4<=10))
			{ Con = a4;
			sp = sp-a4;
			System.out.println("You have "+sp+" points left.");}
			else
			{System.out.println("That was an invalid input. Please try again.");
			System.out.print("Constitution: ");
			int b4 = sc.nextInt();
			if ((b4<=sp) && (b4<=10))
			{ Con = b4;
			sp = sp-b4;
			System.out.println("You have "+sp+" points left.");}
			else {System.out.println("bruh");}
			}
		}
		
			if (sp!=0)
		{ System.out.print("Charisma:");
		int a5 = sc.nextInt();
			if ((a5<=sp) && (a5<=10))
			{ Cha = a5;
			sp = sp-a5;
			System.out.println("You have "+sp+" points left.");}
			else
			{System.out.println("That was an invalid input. Please try again.");
			System.out.print("Charisma: ");
			int b5 = sc.nextInt();
			if ((b5<=sp) && (b5<=10))
			{ Cha = b5;
			sp = sp-b5;
			System.out.println("You have "+sp+" points left.");}
			else {System.out.println("bruh");}
			}
		}
		
		System.out.println(" ");
		System.out.println("You are "+name+", "+title);
		System.out.println("Your role is a "+cls+".");
		System.out.println("Strength: "+Str);
		System.out.println("Dexterity:"+Dex);
		System.out.println("Intelligence: "+Int);
		System.out.println("Constitution: "+Con);
		System.out.println("Charisma: "+Cha);
	}
}
