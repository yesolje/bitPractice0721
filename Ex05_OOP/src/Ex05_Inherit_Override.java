import kr.or.bit.Emp;

class Test2{
	int x = 100;
	void print() {
		System.out.println("부모함수 test2");
	}
}

class Test3 extends Test2{
	int x = 300; //c#의 부모 무시하기 --> 자바에서는 쓰지 마세요! 
	//멤버필드는 재정의를 하는 것이 아니라 메소드만 재정의를 해야 하는 것이다!!!
	
	@Override
	void print() {
		System.out.println("자식이 부모 함수를 재정의 합니다");
	}
	
	void print(String str) { //이건 인자값 바꿨으므로 overloading이다(하나의 이름으로 여러가지 기능)
		System.out.println("나 오버로딩이야" + str);
	}
}


public class Ex05_Inherit_Override {

	public static void main(String[] args) {
		Emp emp = new Emp(1000,"홍길동");
		System.out.println(emp); //주소값
		System.out.println(emp.toString()); // 주소값
		//참조변수 emp를 출력하면 컴파일러가 뒤에 toString() 넣어서 출력
		
		Test3 t3 = new Test3();
		System.out.println(t3.x);
		
		t3.print(); //함수의 재정의를 통한 재사용
		t3.print("재정의");
	}

}
