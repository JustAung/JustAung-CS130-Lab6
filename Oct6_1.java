import java.util.Scanner;

public class Oct6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any word");
		String word = scan.next();
		
		if (word.length() %2 ==0) {
			System.out.println("Your word has an even number");
		}
		else {
			System.out.println("Your word has an odd number");
		}
	}

}
