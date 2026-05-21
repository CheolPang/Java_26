package exception;

public class Account {
	private long balance;
	static int money;

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientException {
		Account.money = money;
		if (balance < money) {
			throw new BalanceInsufficientException("잔고 부족: " + (money - balance) + " 의 금액이 부족합니다.");
		}
		balance -= money;
	}
}
