import java.util.Scanner;
import java.util.Random;
// David is such a bhaddie omg he's so hot
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Your code goes below here
	int count = 0;
System.out.print("Enter a name:");
String name = sc.nextLine();
System.out.print("Enter the number of times to repeat the name:");
int a1 = sc.nextInt();

while(count!=a1)
{ System.out.print(name);
count = count+1;}
		
	}
}
