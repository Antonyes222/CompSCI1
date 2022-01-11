import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Put in an integer:");
	 int number = sc.nextInt();
	while(true){
		System.out.println(number);
		number = number+1;
		count = count+1;
		if(count==5){
			break;
		}
	}
	}
}
