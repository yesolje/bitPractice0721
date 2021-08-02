import java.util.ArrayList;
import java.util.Calendar;

public class Account {
	private String accountNo;//계좌번호
	private String name;//계좌주명
	private long balance;//잔고
	private ArrayList <Transaction> transaction;
	Calendar cal = Calendar.getInstance();
	
	Account(String accountNo , String name){
		this.accountNo = accountNo;
		this.name = name;
		this.balance =0;
		this.transaction = new ArrayList <Transaction> ();
	}
	
	//입금한다
		public void deposit(long amount) {
			balance += amount;
			String date = cal.get(Calendar.YEAR) + "년" + (cal.get(Calendar.MONTH) + 1) + "월" + cal.get(Calendar.DATE) + "일";
			String time = cal.get(Calendar.HOUR) + "시" + cal.get(Calendar.MINUTE) + "분";
			Transaction t = new Transaction(date, time, "입금", amount, this.balance);
			transaction.add(t);
			System.out.println(t);
		}
		//출금한다
		public void withdraw(long amount) {
			if (balance >= amount) {
				balance -= amount;
				String date = cal.get(Calendar.YEAR) + "년" + (cal.get(Calendar.MONTH) + 1) + "월" + cal.get(Calendar.DATE)
						+ "일";
				String time = cal.get(Calendar.HOUR) + "시" + cal.get(Calendar.MINUTE) + "분";
				Transaction t = new Transaction(date, time, "출금", amount, this.balance);
				transaction.add(t);
				System.out.println(t);
			} else {
				System.out.println("잔고가 부족합니다");
			}
		}
	//잔고를 확인한다
	public long getBalance() {
		return balance;
	}
	
	//거래내역을 본다
	public ArrayList<Transaction> getTransactions() {
		for(Transaction value : transaction) {
			System.out.println(value.toString());
		}
		return transaction;
	}
	
	
	//getter , setter////////////////////////////////////
	public String getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Account [계좌번호=" + accountNo + ", 이름=" + name + ", 잔액=" + balance + "]";
	}
	
	
}
