import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program
		Scanner sc = new Scanner(System.in);
		int count = 25;
		while(true){
		if(count==4)
		{
			break;
		}
		System.out.println(count);
			count = count-1;}
		int real;
		int ans;
		System.out.println("Input a number");
		int balls = sc.nextInt();
		real = balls;
		ans = balls-1;
		while(ans!=0){
			real = real*ans;
			ans = ans-1;
		}
		System.out.print(balls+"! = "+real);
	
	}
	
	
}
