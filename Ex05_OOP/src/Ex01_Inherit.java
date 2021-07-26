/*
 * OOP
 * 1. 상속
 * 2. 캡슐화 private > getter,setter
 * 3. 다형성
 * 
 * 1. 상속
 * java : child extends Base
 * C#:child : base
 * 
 * 2.특징
 * 다중 상속은 불가 
 * 단일상속 원칙: 계층적 상속
 * 다중 상속을 지원
 * 
 * 3. 상속
 * 진정한 의미 : 재사용성
 * 단점 : 초기 설계 비용이 듦(추상화 : 공통분모)
 * 장점 : 재사용성을 설정하여 시간이 갈수록 비용/시간 단축
 * 
 * 4. 상속관계
 * grandfather > father > child
 * 상속관계...
 * child child = new Child();
 * 부모부터 메모리에 먼저 올라간다
 * */

class Grandfather{
	public Grandfather() {
		System.out.println("Grandfather");
	}
	public int gmoney = 5000;
	private int pmoney = 1111;//private 는 상속단계에서도 접근 불가
}
class Father extends Grandfather{
	public Father() {
		System.out.println("Father");
	}
	public int fmoney = 3000;
}
class Child extends Father{
	public Child() {
		System.out.println("child");
	}
	public int cmoney = 1000;
}

//사용자가 만드는 모든 클래스 = default로 object 를 물려받는다
class Car extends Object{}
//여러분이 빈 클래스 만들어도 최소한 object 가지는 public 자원은 사용가능하다


public class Ex01_Inherit {

	public static void main(String[] args) {
		Child child = new Child();//생성단계에 heap 올리는 순서 > grand>father>child
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);
		
		Car car = new Car();
	}

}
