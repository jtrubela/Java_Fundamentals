public class BankAccount{
	String name;
	int balance,amount;
	public BankAccount(String name){
		this.name = name;
	}
	public double getBalance(){
		return balance;
	}
	public double withdraw(double amount){
		return (balance-amount);
	}
}