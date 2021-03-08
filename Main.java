import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {

		Bank dagobert = new Bank("Dagobert Duck Bank");
		dagobert.addBranch("Schwelm");
		dagobert.addBranch("Berlin");

		dagobert.addCustomer("Schwelm", "Alexandros", 100);
		dagobert.addCustomer("Berlin", "Daniel", 500);

		dagobert.addCustomerTransaction("Schwelm", "Alexandros", 150);
		dagobert.addCustomerTransaction("Berlin", "Daniel", 200);
		
		dagobert.listCustomers("Schwelm", true);
		dagobert.listCustomers("Berlin", true);
	}
}
