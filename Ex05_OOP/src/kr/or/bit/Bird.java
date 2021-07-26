package kr.or.bit;

//새(공통 일반 추상) >> 새는 날 수 있다. 새는 빠르다
public class Bird {
	//공통기능
	public void fly() {
		System.out.println("flying");
	}
	
	//설계자가 
	//설계도를 상속하는 당신은 특정함수에 대해서 [재정의]를 했으면 [좋겠다] =99프로
	protected void moveFast() {
		fly();
	}
	
}
