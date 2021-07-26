/*
 this : 객체 자신을 가르키는 this(this.empno, this.ename)
 this : 생성자를 호출하는 this(this(100,"red"))
 
 상속
 부모(base)
 자식(this)
 super(현재 자식이 부모의 접근 주소값) : 상속관계에서 부모 자원에 접근
 
 [용법 1] super >> 상속관계에서 자식이 부모의 접근 주소
 [용법 2] super >> 상속관계에서 부모의 생성자를 호출(명시적으로)
 
 Tip)
 C# :base
 java : super()
 */
class Base{
	String basename;
	Base(){
		System.out.println("Base 기본 생성자 함수");
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("basename : " + this.basename);
	}
	void method() {
		System.out.println("나는 부모함수");
	}
}
class Derived extends Base{
	String dname;
	Derived(){
		System.out.println("Derived 기본 생성자 함수");
	}
	Derived(String dname){
		super(dname); //[용법 2]-> 상속관계에서 부모 생성자를 호출
					  //How to? 자녀생성자에 super() 생성 후 불러올 부모생성자의 인자를 넣는다
		this.dname = dname;
		System.out.println("dname:"+ this.dname);
	}
	@Override
	void method() {
		System.out.println("부모함수를 재정의 했다!");
	}
	//그런데 어느날... 부모님 생각.. 그리워요
	//재정의 되었다면 부모 자원에 접근이 불가
	
	//접근 방법 (super): 별도의 함수 안에서
	void parent_method() {
		super.method(); //[용법 1] -> 부모자원을 호출
						//How to? 메소드 새로 생성후 super. + 오버라이딩 관계의 부모메소드 선언
	}
}
public class Ex06_Inherit_super {

	public static void main(String[] args) {
		//Derived d = new Derived();
		Derived d2 = new Derived("홍길동");
		//super가 없으면 호출한 클래스에서는 생성자를 뭐로 쓸지 고민하지만, 
		//상위 클래스의 생성자는 무조건 default 가 된다.
		//때문에 상위 클래스의 생성자를 직접 지정하고 싶으면 super를 써야 한다.
		d2.method();
		
		d2.parent_method();//오버라이딩 관계에서 자녀가 아닌 부모의 메소드를 가져왔다
	}

}
