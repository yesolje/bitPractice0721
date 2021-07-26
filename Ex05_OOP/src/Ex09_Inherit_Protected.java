import kr.or.bit.Bird;

//Bird 상속받아서
//protected  참조변수 접근 안되요
//상속관계에서는 접근 됨

class Bi extends Bird{

	@Override
	protected void moveFast() {
		super.moveFast();
	}
	
}
class Ostrich extends Bird{
	//구체화, 특수화
	void run() {
		System.out.println("run");
	}

	@Override
	protected void moveFast() {
		//super.moveFast();
		run(); //재정의를 해줬다
	}
	
}
public class Ex09_Inherit_Protected {

	public static void main(String[] args) {
		Bi bi  =new Bi();
		bi.fly();
		bi.moveFast();
		
		
		//직접//상속관계 아니면 default>> 같은 폴더 내에서 사용 가능
		//간접//사용하고 싶으면 재정의해야 한다>> 상속관계에서는 public 
		
		//결론 :
		//protected 메소드는 같은 폴더 내에서 사용할때는 사용 가능,
		// 다른 폴더 내에서 사용할 때에는 상속관계에 있어야 하고 재정의를 해줘야 한다
		Ostrich o = new Ostrich();
		o.run();
		o.moveFast();
		
	}

}
