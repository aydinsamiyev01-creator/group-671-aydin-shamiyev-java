
public class BankAccount {
	 double balance;

	    public BankAccount(double balance) {
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Пополнено. Баланс: " + balance);
	    }

	    public void withdraw(double amount) {
	        if (amount > balance) {
	            System.out.println("Недостаточно средств!");
	        } else {
	            balance -= amount;
	            System.out.println("Снято. Баланс: " + balance);
	        }
	    }

	    public double getBalance() { return balance; }

	    public static void main(String[] args) {
	        BankAccount acc = new BankAccount(1000.0);
	        acc.deposit(500.0);      
	        acc.withdraw(200.0);     
	        acc.withdraw(5000.0);   
	    }
	}
