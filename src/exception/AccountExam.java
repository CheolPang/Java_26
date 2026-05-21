package exception;

public class AccountExam {
	public static void main(String[] args) throws BalanceInsufficientException {
		Account account = new Account();
		account.deposit(100000);
		System.out.println("예금액: " + account.getBalance());

		try {
			account.withdraw(200000);
		} catch (BalanceInsufficientException e) {
			System.out.println("에러발생");
			e.printStackTrace();
		} finally {
			System.out.println("당신이 출금하려고 하는 금액은: " + Account.money + "입니다.");
		}

	}
}
