class Pbase{
	int p =100;
}
class Cbase extends Pbase{
	int c = 200;
}

class Dbase extends Pbase{
	
}

public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		System.out.println(cbase.toString());
		
		Pbase p = cbase;//다형성
		System.out.println("부모의 주소값 : "+p);
		
		Dbase dbase = new Dbase();
		p = dbase; //다형성
		
		System.out.println(p); //c -> d로 주소 옮김
		//부모는 자식타입의 주소를 받을 수 있다
		
		//주의사항
		///////////////////////////////////////////
//		Cbase c = p;//부모타입은 자식타입보다 상위기 때문에 바로 못준다
		Cbase c = (Cbase)p; //부모객체의 주소를 다시 자식에게 줄 때에는 자식타입 casting이 필요하다
		
		
		
	}

}
