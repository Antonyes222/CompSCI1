import java.util.Scanner;
import java.util.Random;

class starter {
	public static int gaming(int a, int b){
		int answer = a;
		
		int count = b-1;
		while (count!=0){
			System.out.println("fart");
			answer = answer*a;
			count = count-1;
		}
		return answer;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.print("put in an integer:");
	int integer = sc.nextInt();
	System.out.print("put in the exponent for that number:");
	int exponent = sc.nextInt();
	//Shawty kinda bad tho
	System.out.print(integer+"^"+exponent+"="+gaming(integer,exponent));
	}
}
