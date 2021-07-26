/*
 * 실무개발환경(협업)에서는
 * 설계도 1장은 연습 말고는 쓸 일 없다.
 * 
 * 설계도가 많다(업무가 복잡하다) > 하나의 설계도 불가 > 규칙에 맞게 여러개의 설계도
 * 쇼핑몰 >> 회원관리 , 배송 , 주문관리, 상품관리, 관리자... 도메인 >> 각각의 설계도
 * 
 * 배송 회원 , 상품
 * 고민 : 여러개의 설계도를 어떤 기준에서 나누고 합치고 작업을 할거냐
 * 
 * 학자 정의.. 업무 지식이 없더라도 업무..
 * 1. is ~ a-> 는 ~이다.(부모를 뒤에) >> 상속관계
 * 2. has ~ a ->은 ~ 를 가지고 있다  >> 포함관계(작게 나누어진다)
 * 
 * 원  도형 관계
 * 원은 도형이다(o)
 * 원은 도형을 가지고 있다(x)
 * >>원 extends 도형
 * 
 * 도형 : 추상화, 일반화 >> 공통자원(분모) >> 그리다, 색상
 * 원 : 구체화, 특수화
 * 
 * 원은 점이다(x)
 * 원은 점을 가지고 있다(o)
 * >> class 원{ 점(부품)}
 * 
 * 개인적인...
 * 학술(70) +30 경험
 * 
 * 경찰 권총 관계
 * 경찰은 권총이다 (x)
 * 경찰은 권총을 가지고 있다(o)
 * Class 권총{}
 * Class 경찰{
 * 	   //권총 ..
 * 	   //void 출동(권총){
 * 		}
 * }
 * 
 * 예)원, 삼각형, 사각형 만드는 설계도를 작성하세요
 * 원은 도형이다
 * 삼각형은 도형이다
 * 사각형은 도형이다
 * 
 * 도형 : 추상화, 일반화 >> 공통자원(분모) >>그리다, 색상
 * 원 : 구체화, 특수화 >> 원만이 가지는 특징이 있다 >> 반지름 한 점(좌표값)
 * 
 * 점 : 좌표값(x,y )만나는 점
 * 원은 점을 가지고 있다
 * 삼각형은 점을 가지고 있다
 * 사각형은 점을 가지고 있다
 * 
 * class Shape {색상, 그리다}
 * class Point {x, y}
 * 
 * 원은
 * 
 * 원 extends Shape{
 * 		Point(부품)
 * }
 * 
 * 
 * */
class Shape{
	String color = "gold";
	void draw() {
		System.out.println("그리다");
	}
}

class Point{
	int x;
	int y;
	
	//x, y 기본값이 있고
	Point(){
		//this.x = 0;
		//this.y = 0;
		this(10,10);
	}
	//필요에 따라서는 입력받고 싶어요
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
}

//원 만들기(원의 정의는 한 점과 반지름을 가지고 있다)
//1. 원은 도형이다.
//2. 원은 점을 가지고 있다.(member filed : 부품 타입)
//3. 원은 반지름을 가지고 있다(특수성) r

class Circle extends Shape{
	Point point;
	int r;
	
	Circle() {
		//this.r = 10;
		//this.point = new Point(2,3);
		this(10,new Point(100,100));
	}
	Circle(int r , Point point){
		this.r = r;
		this.point = point;
	}
	
}

//원 만든것을 참조해서
//삼각형을 만드세요
//삼각형은 3개의 점과 그리다 라는 기능을 가지고 있다
//shape ,Point 제공 받아서 사용할것
//default 로 삼각형을 만들 수 있고, 3개의 점을 받아서 삼각형을 그릴 수 있다
//(x,y)(x,y),(x,y)



//썩 좋지 않은 방법
//class Triangle extends Shape{
//	Point a;
//	Point b;
//	Point c;
//	
//	public Triangle() {
//		this(new Point(1,0),new Point(-1,0),new Point(0,1));
//		//this.a = new Point(-1,0); 이걸 축약한게 위에거
//		//this.b = new Point(1,0);
//		//this.c = new Point(0,1);
//	}
//	
//	public Triangle(Point a, Point b ,Point c) {
//		this.a = a;
//		this.b = b;
//		this.c = c;
//	}
//	//추가 기능 구현 가능(삼각형만이 가지는 특별한 기능)
//	void trianglePoint() {
//		System.out.printf("a : (%d,%d)\t " ,a.x ,a.y);
//		System.out.printf("b : (%d,%d)\t " ,b.x ,b.y);
//		System.out.printf("c : (%d,%d)\t " ,c.x ,c.y);
//	}
//}



//이렇게 하는게 좋은 방법
class Triangle extends Shape{
	Point [] pointArray;
	
	Triangle() {
		
//		this.pointArray = new Point[3];
//		pointArray[0] = new Point(10,20);
//		pointArray[1] = new Point(2,3);
//		pointArray[2] = new Point(4,5);

		this(new Point[]{new Point(10,20),new Point(20,30),new Point(40,60)});
	}
	
	Triangle(Point[] pointarray){
		this.pointArray = pointarray;
	}
	
	//추가 기능 구현 가능(삼각형만이 가지는 특별한 기능)
	void trianglePoint() {
		for(Point point : this.pointArray){
			System.out.printf("a : (%d,%d)\t " ,point.x ,point.y);
		}
	}
}





public class Ex02_Inherit_Composition {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println(circle.r);
		System.out.println(circle.point.x);
		System.out.println(circle.point.y);
		circle.draw();
		System.out.println(circle.color);
		System.out.println("_____________________");
		Circle circle2 = new Circle(50,new Point(1,5));
		System.out.println(circle2.r);
		System.out.println(circle2.point.x);
		System.out.println(circle2.point.y);
		circle2.draw();
		System.out.println(circle2.color);
		
		System.out.println("*******점을 따로 받지 않는 삼각형");
		Triangle triangle = new Triangle();
		triangle.draw();
		triangle.trianglePoint();
		
		System.out.println();
		
		System.out.println("*******점을 따로 받은 삼각형");
		Point[] pointarr = new Point[] {new Point(1,2),new Point(1,2),new Point(1,2)};//포인트 배열 먼저 생성
		Triangle triangle2 = new Triangle(pointarr);
		triangle2.draw();
		triangle2.trianglePoint();
		
	}

}
