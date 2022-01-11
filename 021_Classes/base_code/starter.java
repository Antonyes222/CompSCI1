import java.util.Scanner;
import java.util.Random;

class Character{
	String role = new String("Rogue");
	int Str = 5;
	int Dex = 10;
	int Int = 4;
	int Con = 1;
	int Cha = 5;
}
class starter {
	public static void main(String args[]) {
		// David is such a shawty he knows how to make it fart
		Character Rogue = new Character();
		System.out.println(Rogue.role);
		System.out.println(Rogue.Str);
				System.out.println(Rogue.Dex);
						System.out.println(Rogue.Int);
								System.out.println(Rogue.Con);
										System.out.print(Rogue.Cha);
	}
}