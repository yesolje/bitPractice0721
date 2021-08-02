import java.util.ArrayList;

public class BankMain {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		//계좌 생성
		System.out.println("1. 계좌 생성");
		bank.addAccount("123456", "순형");
		bank.addAccount("343434", "예슬");
		bank.addAccount("222222", "병민");
		bank.addAccount("222255", "병민");
		System.out.println();
		
		
		//계좌번호로 계좌찾기
		System.out.println("2. 계좌번호로 계좌 찾기");
		System.out.println(bank.getAccount("222255").toString());
		System.out.println();
		
		
		//소유자로 계좌 찾기
		System.out.println("3. 소유자로 계좌 찾기");
		ArrayList<Account> ar = new ArrayList<Account>();
		ar = bank.findAccount("병민");
		for(Account value : ar) {
			System.out.println("[계좌번호 : "+value.getAccountNo()+" 성함 : " + value.getName()+"]");
		}
		System.out.println();
		
		
		//계좌목록 보기
		System.out.println("4. 전체계좌목록 조회");
		ar = bank.getAccount();
		for(Account value : ar) {
			System.out.println("[계좌번호 : "+value.getAccountNo()+" 성함 : " + value.getName()+"]");
		}
		System.out.println();
		
		
		//총계좌수
		System.out.println("5. 총계좌 수");
		System.out.println(bank.getTotalAccount() + " 개");
		System.out.println();
		
		
		//계좌번호로 예금하기
		bank.getAccount("222255").deposit(1000);
		bank.getAccount("222255").deposit(1000);
		
		//내역 확인
		System.out.println("6. 예금후 거래내역 조회");
		System.out.println(bank.getAccount("222255").getTransactions());
		System.out.println();
		
		//계좌번호로 출금하기
		bank.getAccount("222255").withdraw(500);
		
		//내역 확인
		System.out.println("7. 출금후 거래내역 조회");
		System.out.println(bank.getAccount("222255").getTransactions());
		System.out.println();
		
	}

}
