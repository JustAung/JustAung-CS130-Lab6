import java.util.Scanner;

public class Oct6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter the length of a rectangle");
int length = scan.nextInt();

System.out.println("Enter the breadth of a rectangle");
int breadth = scan.nextInt();

if (Math.sqrt(breadth) == Math.sqrt(length)) {
	System.out.println("It is sqaure");
}
else {
	System.out.println("It is not square");
}
	}

}
