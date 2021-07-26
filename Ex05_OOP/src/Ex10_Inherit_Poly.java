/*
 다형성
 java : [상속관계]에서 [하나의 참조변수]가 [여러개의 다른 타입]을 가질 수 있다
 [하나의 참조변수] >> 부모객체
 [여러개의 다른 타입]>> 부모를 상속한 자식 객체
 
 부모 클래스 타입의 참조변수가 여러개의 자식클래스 주소를 가질 수 있다.
 
 */
class Tv2{
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}

class CapTv extends Tv2{ // 자막이 있는 Tv
	//특수화, 구체화 자원 구현 >> 자막기능
	String text;
	String captionText() {
		return this.text = "현재 자막 처리중";
	}
}

public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		CapTv captv = new CapTv();
		captv.power();
		System.out.println("전원 : " + captv.power);
		
		captv.chUp();
		System.out.println("채널 : " + captv.ch);
		
		System.out.println(captv.captionText());
		//기존까지 배운 내용
		
		//원칙적으로 타입이 같지 않으면 할당이 불가능
		/*
		 상속관계에서 [부모타입]은 [자식타입]의 [주소]를 가질 수 있다 = 다형성
		 단, 부모는 자신의 자원만 접근할 수 있다.
		 단, 재정의는 제외한다. 
		  */
		Tv2 tv2 = captv;//부모는 자식의 주소를 달 수 있다
		System.out.println(tv2.toString());//CapTv@2401f4c3
		System.out.println(captv.toString());//CapTv@2401f4c3
		//주소 = 메모리의 재사용
		
		tv2.power(); //자신의 타입 객체만 접근 가능
		
	}

}
