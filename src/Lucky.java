import java.util.Scanner;

public class Lucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner L = new Scanner(System.in);
		System.out.println("Enter the value :");
		int a = L.nextInt();
		if (a % 2==0) {
			System.out.println("This is Even Number");
		}
		else if (a % 2 == 1) {
			System.out.println(" This is Odd number");
		}
		else {
			System.out.println("Undefine number");
	
			
		}
	}

}


