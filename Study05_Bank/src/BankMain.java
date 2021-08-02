import java.util.ArrayList;

public class BankMain {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		//계좌 생성
		bank.addAccount("123456", "순형");
		bank.addAccount("343434", "예슬");
		bank.addAccount("222222", "병민");
		bank.addAccount("222255", "병민");
		//계좌번호로 계좌찾기
		bank.getAccount("222445");
		//소유자로 계좌 찾기
//		bank.findAccount("병민");
	
		
		//계좌목록 보기
//		System.out.println("===전체계좌목록===");
//		ArrayList<Account> ar = new ArrayList<Account>();
//		ar = bank.getAccount();
//		for(Account value : ar) {
//			System.out.println("계좌번호 : "+value.getAccountNo());
//			System.out.println("성함 : " +value.getName());
//		}
		
//		System.out.print("===총계좌수는 : ");
//		System.out.println(bank.getTotalAccount());
		
		
		//계좌번호로 예금하기
//		bank.getAccount("222255").deposit(1000);
//		bank.getAccount("222255").deposit(1000);
//		bank.getAccount("222255").getTransactions();
		
//		bank.getAccount("222255").withdraw(500);
//		bank.getAccount("222255").getTransactions();
		
	}

}
