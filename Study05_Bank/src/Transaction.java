
public class Transaction {
	private String transactionDate; //거래일자
	private String transactionTime; //거래 시간
	private String kind; //입출금 구분
	private long amount; //거래금액
	private long balance; //잔고
	public Transaction(String transactionDate, String transactionTime, String kind, long amount, long balance) {
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "[" + "거래금액:" + amount + "원 잔액:" + balance + "원 " + transactionDate + transactionTime + "]";
	}
}