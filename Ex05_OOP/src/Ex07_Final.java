/*
변수 <-> 상수
상수 : 초기화가 되고 나서 (최초 값 할당)이 되면 변경이 불가
상수자원 : 고유값 (주민번호) ,수학(PI, 소프트웨어 버전 번호, 시스템번호)
상수는 관용적으로 대문자

java : final int NUM= 0;
c# : const integer NUM=0;

final 키워드

1. final 이 class 앞에 붙으면
final class Math{} >> 상속 금지 >> 설계도(상속안되 1장)>>final class MyMap
2. final 이 method 앞에 붙으면
final void print(){} >> 상속관계에서 재정의 금지(override)

public static final jumin; //객체간 공유자원(변하지 않는) static 상수를 주로 쓴다
public static final void print(){} // 별의미가 없다

*/
class Vcard{
	final String KIND="heart";//상수는 반드시 초기화를 해야 사용 가능하다
	final int NUM = 10;
	void method() {
		System.out.println(Math.PI);
	}
}

class Vcard2 {
	final String KIND;
	final int NUM;
	
	//상수에게 믿음을 줘야 한다. 객체 생성시 반드시 초기화 해줄것이라는 믿음
	Vcard2(){ //필드부에서 초기화 안할거면 생성자에서라도 꼭 해야한다.
		this("heart", 10);
	}
	Vcard2(String kind, int num){
		this.KIND = kind;
		this.NUM = num;
	}
	@Override
	public String toString() {
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
	
	
}

public class Ex07_Final {
	public static void main(String[] args) {
		Vcard vcard = new Vcard();
		System.out.println(vcard.KIND);
		vcard.method();
		
		Vcard2 vcard2 = new Vcard2("spade",7);
		System.out.println(vcard2.toString());
	}

}
