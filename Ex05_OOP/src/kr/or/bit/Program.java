package kr.or.bit;

public class Program {

	public static void main(String[] args) {
		Pclass pc = new Pclass();
		pc.k = 10;
		pc.p = 11; //같은 패키지 내이니까 protected 변수도 불러오기에 문제 없다.
		//결국 protected 활용은 상속이다.
	}

}
