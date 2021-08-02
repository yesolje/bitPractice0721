import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts;
	private int totalAccount;
	
	Bank(){
		accounts = new ArrayList<Account>();
		this.totalAccount = 0;
	}
	
	//계좌 생성
	public void addAccount(String accounts, String name) {
		totalAccount++;
		this.accounts.add(new Account(accounts, name));
	}
	
	// 번호로 계좌번호 찾기
	public Account getAccount(String accountNo) {
		Account act = null;
		for (Account ac : accounts) {
			if (ac.getAccountNo().equals(accountNo)) {
				act = ac;
			}
		}
		return act;
	}
	
//	이름으로 계좌찾기
	public ArrayList<Account> findAccount(String name){
		ArrayList<Account> acc = new ArrayList<Account>();
		for(Account value : accounts) {
			if(value.getName().equals(name)) {
				acc.add(value);
			}
		}
		return acc;
	}
	
	//계좌목록 보기 
	public ArrayList<Account> getAccount(){
		return accounts;
	}
	//총계좌수 반환하기 
	public int getTotalAccount() {
		return totalAccount;
	}
}
