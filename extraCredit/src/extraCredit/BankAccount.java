package extraCredit;

public class BankAccount {   // BankAccount template for Practice-It
	private String id;
	private double balance;
	private int transactions;
	private String transactionText;

	public BankAccount(String id) {
		this.id = id;
		balance = 0;
		transactions = 0;
		transactionText = "";
	}

	public double getBalance() {
		return balance;
	}

	public String getID() {
		return id;
	}

	public int getTransactionCount() {
		return transactions;
	}

	public String getTransactions() {
		return transactionText;
	}

	public void deposit(double amount) {
		if (0 <= amount && amount <= 500) {
			balance += amount;
			transactionText += "deposit of $" + amount + "\n";
		}
		transactions++;
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			transactionText += "withdrawal of $" + amount + "\n";
		}
		transactions++;
	}

	public String toString() {
		return id;
	}

	public boolean transactionFee(double fee) {
	    double reduce = 0.0;
	    
	    for (int i = 1; i <= transactions; i++) {
	        reduce += i * fee;
	    }
	    
	    if (reduce < balance) {
	        balance -= reduce;
	        return true;
	    }
	    
	    balance = 0.0;
	    return false;
	}
	
}