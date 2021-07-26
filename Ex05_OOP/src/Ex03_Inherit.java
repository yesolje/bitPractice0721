//설계도
class Tv{
	boolean power; // false
	int ch;
	
	void power() {
		this.power = !this.power; //호출할때마다 T/F 바뀜
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}
class Vcr{ //비디오 플레이어
	boolean power;
	void power() {
		this.power = !this.power;
	}
	void play() {
		System.out.println("재생하기");
	}
	void stop() {
		System.out.println("정리하기");
	}
	void rew() {}
	void ff() {}
}
/*
 Tv 설계도
 Vcr 설계도
 
 요구사항 : TvVcr 이라는 제품
 1. class TvVcr extends Tv , Vcr (x) >> 다중상속 금지
 2. class Tv extends Vcr >> TvVcr extends Tv >> 문법 계층적 상속
    >> 자원 이름 충돌 (어떤 객체는 기능 사용 불가)
 
 해결 : 한놈은 상속하고 한놈은 포함...
 class TvVcr extends
 1. Tv 상속 , Vcr 포함 : class TvVcr extends Tv{Vcr vcr;}
 2. Tv 포함 , Vcr 상속 : class TvVcr extends Vcr{Tv tv;}
 3. class TvVcr{Tv tv , Vcr vcr}
   >> 셋다 문제 없다
 
 기준 : 주기능 , 메인기능 >> 둘 중에 비중 >> 비중이 높은 클래스(상속) >>나머지 포함
 
 */
class TvVcr extends Tv{
	Vcr vcr;// 있어야 해요(TvVcr 만들어지면 Vcr 생산 무조건)
	TvVcr(){
		vcr = new Vcr();
	}
}
public class Ex03_Inherit {

	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		t.power();
		System.out.println("전원 : "+ t.power);
		t.chUp();
		System.out.println("채널 : " + t.ch);
		
		//비디오
		t.vcr.power(); //이 코드 사용에 익숙해져야 한다
		System.out.println("비디오 전원 : "+ t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		
		t.vcr.power();
		t.power();
		System.out.println("Tv 전원 :"+ t.power );
		System.out.println("비디오 전원 : " + t.vcr.power);
		
	}

}
