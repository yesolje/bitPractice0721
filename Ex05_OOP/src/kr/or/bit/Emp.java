package kr.or.bit;


public class Emp { //Emp extends Object 생략
	private int empno;
	private String ename;
	
	public Emp(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

//	@Override
//	public String toString() { //toString을 재정의
//		// TODO Auto-generated method stub
//		return "사원정보" + this.empno + ","  +this.ename;
//	}
	
	//Object toString() 그대로 사용하면 주소값을 출력하도록 만들어놓은 애..
	//개발자가 필요에 따라서는 재정의해서 사용한다.
	//자원의 정보를 확인하는 형태로
	
	@Override  //우클릭 + source + generate tostring 으로도 제작 가능
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	
}
