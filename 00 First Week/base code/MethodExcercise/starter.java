import java.util.Scanner;
class starter {
	public static int Divisible(int a,int b){
		int ans = a*b;
		if (ans%3==0){
			return ans;	}
			else { 
			return 0; }
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Input an integer");
	int a1 = sc.nextInt();
	System.out.println("Input another integer. An answer shall be returned if the product is divisible by 3.");
	int a2 = sc.nextInt();
	int crazy = Divisible(a1,a2);
	if (crazy!=0){
		System.out.print(crazy);
	}
	else {
		System.out.print("The product was not divisible by 3.");
	}
	}
}
