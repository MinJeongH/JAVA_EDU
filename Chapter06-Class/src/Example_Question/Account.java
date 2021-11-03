package Example_Question;

public class Account {
	final static double MIN_BALANCE = 0;
	final static double MAX_BALANCE = 1000000;
	double balance;
	double result = 0;

	double getBalance() {
		if (this.balance >= MIN_BALANCE && this.balance <= MAX_BALANCE) {
			this.result = this.balance;
			return this.result;
		} else {
			return this.result;
		}
	}

	void setBalance(double b) {
		this.balance = b;
	}
}
