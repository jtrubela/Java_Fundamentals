
public class CheckingAccount extends BankAccount{
	public CheckingAccount(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private boolean overdraft;
	
	public void hasOverdraft() {
		if (setOverdraft(true)) {
			
		}
	}

	public boolean isOverdraft() {
		return overdraft;
	}

	public boolean setOverdraft(boolean overdraft) {
		this.overdraft = overdraft;
		return overdraft;
	}

	}