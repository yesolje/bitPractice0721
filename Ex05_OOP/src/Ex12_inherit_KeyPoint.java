/*
 시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라는 전자제품 매장이 오픈되면 
[클라이언트 요구사항]
가전제품은  제품의 가격 , 제품의 포인트 정보를 공통적으로 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름을 가지고 있다
ex)
각각의 전자제품은 이름을 가지고 있다(ex: Tv , Audio , Computer)
각각의 전자제품은 다른 가격을 가지고 있다(Tv:5000, Audio:6000 ....)
제품의 포인트는 가격의 10% 적용한다
 
시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다 
예를 들면 : 10만원  , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게되면 가지고 있는 돈은  감소하고 포인트는 올라간다
구매자는 처음 초기 금액을 가질 수 있다

1차 코드 (물건이 3개 ...구매할 수 있는 함수)
**************************************************
 1차오픈 (제품 3개 구매)
 
 공식오픈
 매장에 제품 1000개(마우스, 토스트기, ...) 제품 등록(POS 시스템)
 매장에 1000개의 제품 전시
 고객 >> 고객 불만 폭주 >> ...>>3종류 제품 판매 >>997개 판매 불가
 
 변화에 대응하지 못하는 코드의 문제..
 

**************************************************
 */
class Product{
	int price;
	int bonuspoint;
	Product(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
}
class KtTv extends Product{
	KtTv(){
		super(500);
	}
	@Override
	public String toString() {
		return "KtTv";
	}
}
class Audio extends Product{
	Audio(){
		super(100);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}
class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
}
//구매자
class Buyer{
	int money = 1000;
	int bonuspoint;
	// 구매자는 구매 행위를 할 수 있다.
	//구매 행위(잔액 - 제품의 가격, 포인트 정보 갱신(증가))
	//******구매자는 매장에 있는 모든 물건을 구매할 수 있다.
	
	void kttvBuy(KtTv n) { //구매하려는 물건의 정보가 필요
		if(this.money<n.price) {
			System.out.println("잔액이 부족합니다" + this.money);
			return; // 함수의 종료(구매행위 종료)
		}
		//실 구매행위
		this.money -= n.price;
		this.bonuspoint +=n.bonuspoint;
		System.out.println("구매한 물건은 : "+n.toString());
	}
	void audioBuy(Audio n) { 
		if(this.money<n.price) {
			System.out.println("잔액이 부족합니다" + this.money);
			return; 
		}
		
		this.money -= n.price;
		this.bonuspoint +=n.bonuspoint;
		System.out.println("구매한 물건은 : "+n.toString());
	}
	void noteBookBuy(NoteBook n) { 
		if(this.money<n.price) {
			System.out.println("잔액이 부족합니다" + this.money);
			return; 
		}
		this.money -= n.price;
		this.bonuspoint +=n.bonuspoint;
		System.out.println("구매한 물건은 : "+n.toString());
	}
	//위처럼 쓰지 말고/////////////////////////
	void buy(Product n) {
		if(this.money<n.price) {
			System.out.println("잔액이 부족합니다" + this.money);
			return; 
		}
		this.money -= n.price;
		this.bonuspoint +=n.bonuspoint;
		System.out.println("구매한 물건은 : "+n.toString());
	}
	//이것처럼 쓰자!///////////////////////////
}
public class Ex12_inherit_KeyPoint {

	public static void main(String[] args) {
		//매장에 제품 배치하기
		KtTv kttv = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		
		Buyer buyer = new Buyer();
//		buyer.kttvBuy(kttv);
		buyer.buy(audio);
	
	}

}
