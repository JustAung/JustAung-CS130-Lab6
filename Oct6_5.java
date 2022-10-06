import java.util.Scanner;

public class Oct6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Number 1: ");
int Num1 = scan.nextInt();

System.out.println("Number 2: ");
int Num2 = scan.nextInt();
System.out.println("Before swapping: " + Num1 + Num2);
int Temp1 = Num1;
Num1 = Num2;
Num2 = Temp1;
System.out.println("Swapped result is: " + Num1  +  Num2);
}

}
