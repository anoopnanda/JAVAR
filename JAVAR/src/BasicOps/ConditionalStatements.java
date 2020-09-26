package BasicOps;
import java.util.Scanner;
public class ConditionalStatements {

	public static void main( String[] args) {
	
		Scanner S1= new Scanner(System.in);
		System.out.println("Enter y/n:");
		char resp = S1.nextLine().charAt(0);
		if (resp == 'y' || resp=='Y') {
			System.out.println("You entered YES !");
			}
		else if (resp == 'n' || resp=='N') {
			System.out.println("You entered NO !");
			}
		else {
			System.out.println("That's not an expected input. Please retry !!");
				
		}
			
		S1.close();		
	}

}
