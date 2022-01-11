package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter{
	public void myCharacter(){
		Scanner sc = new Scanner(System.in);
		public String role = new String("Rogue");
	public int Str = 5;
	public int Dex = 10;
	public int Int = 4;
	public int Con = 1;
	public int Cha = 5;
	System.out.println("Strength:"+Str);
	System.out.println("Dexterity:"+Dex);
	System.out.println("Intelligence:"+Int);
	System.out.println("Constitutition:"+Con);
	System.out.println("Charisma:"+Cha);
	
	}

	public void myCharacter(String input){
		Scanner sc = new Scanner(System.in);
		public String role = new String("Rogue");
	public int Str = 5;
	public int Dex = 10;
	public int Int = 4;
	public int Con = 1;
	public int Cha = 5;
		System.out.print("What is your class? CAP Sensitive!");
		String role = sc.nextLine();
		if ((role.equals("Rogue"))||{role.equals("Warrior"))||(role.equals("Wizard"))){
			System.out.println("Your class is "+role+". Very poggers");}
			else
			{System.out.println("That isn't a real class. You get no role loser");
	}
}