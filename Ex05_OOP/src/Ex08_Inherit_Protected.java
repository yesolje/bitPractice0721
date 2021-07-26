import kr.or.bit.Pclass;

/*
 private , default , public ,[상속관계에서] protected
 
  protected : 박쥐 > default , public 
  
  >>상속이 없는 클래스 안에서 protected 접근자는 default 와 같다.
  >>결국에는 protected는 상속관계에서만 의미를 가진다.
  
 */
class Dclass{
	public int i;
	private int p;
	int s;
	protected int k; //이렇게 쓰면 default 접근자와 똑같다.
}

class Child2 extends Pclass{
	void method() {
		//다른 패키지 ...default 접근 불가
		this.k = 10; //다른패키지여도 상속하니까 protected 접근 가능
		System.out.println(this.k);
	}
}

public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.method();
	}

}
