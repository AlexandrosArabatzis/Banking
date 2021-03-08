import java.util.ArrayList;

public class Customer {
	
	private String name;
	private ArrayList<Double> transactions;
	
	public Customer(String name, double balance) {
		this.name = name;
		this.transactions = new ArrayList<Double>();
		addTransaction(balance);
	}
	
	public void addTransaction(double transaction) {
		this.transactions.add(transaction);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}
}









