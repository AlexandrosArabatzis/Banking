import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Branch {

	private String name;
	private ArrayList<Customer> customers;

	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<Customer>();
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public boolean addCustomerTransaction(String customerName, double Amount) {
		Customer existingCustomer = findCustomer(customerName);
		if (findCustomer(customerName) != null) {
			existingCustomer.addTransaction(Amount);
			return true;
		}
		return false;
	}

	public boolean newCustomer(String customerName, double initialAmount) {
		if (findCustomer(customerName) == null) {
			this.customers.add(new Customer(customerName, initialAmount));
			return true;
		}
		return false;
	}

	
	// check if a customer already exists. If yes, return the customer object. If not, return null.
	private Customer findCustomer(String customerName) {
		for (int i = 0; i < this.customers.size(); i++) {
			Customer checkedCustomer = this.customers.get(i);
			if (this.customers.get(i).getName().equals(customerName)) {
				return this.customers.get(i);
			}
		}
		return null;
	}	
}
