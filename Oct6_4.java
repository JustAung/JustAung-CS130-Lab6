import java.text.NumberFormat;
import java.util.Scanner;

public class Oct6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

System.out.println("Number of classes held: ");
double held = scan.nextDouble();

System.out.println("Number of classes attended");
double attended = scan.nextDouble();

double attendence = attended/held;

if(attendence>.75) {
	System.out.println("The student is allowed to sit in exam");
}
else {
	System.out.println("The student is not allowed to sit in exam");
}
	}


}

