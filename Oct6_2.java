import java.util.Scanner;

public class Oct6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of side a" );
		int a = scan.nextInt();
		
		System.out.println("Enter the length of side c");
		int c = scan.nextInt();
		
		System.out.println("Enter the length of side hypotenuse");
		int h = scan.nextInt();
		
		if (Math.pow(h,2) == Math.pow(a, 2) + Math.pow(c, 2) ) {
			System.out.println("It's a right triangle");
		}
		else {
			System.out.println("It's not a right triangle");
		}
			
	}

}
