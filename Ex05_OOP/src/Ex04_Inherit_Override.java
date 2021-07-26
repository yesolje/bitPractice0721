/*
 Today Point
 [상속관계] 에서 override : 상속관계에서 자식이 부모의 함수를 [재정의]
 재정의 : 틀(함수의 이름 , 타입 , parameter)의 변화는 없고 {} 안의 내용만 변화
 [상속관계]에서 [자식클래스]가 [부모클래스]의 함수의 내용을 바꾼다.(재정의)
 
 
 */
class Point2{
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x + "/" + this.y;
	}
}

class Point3D extends Point2{
	//x, y, z
	int z = 6;
	
	//1. 함수 하나를 새로 만든다 String getPosition3(){}
	
	//누군가가.. 함수 하나가지고 여러개 만들면 불편한데...
	//부모의 함수를 재사용 가능 ... >> 재정의
	//annotation 은 [java code만으로 전달할 수 없는 부가적인 정보]를 [컴파일러나 개발툴]로 전달할 수 있다
	//@Override annotation은 [super class]나 [interface]의 [method를 override 하고 있음을 명시]한다
	
	@Override
	String getPosition() {
		return this.x + "/" + this.y + "/" + this.z;
	}
	
}

public class Ex04_Inherit_Override {

	public static void main(String[] args) {
		Point3D point = new Point3D();
		String result = point.getPosition();
		System.out.println(result);
	}

}
