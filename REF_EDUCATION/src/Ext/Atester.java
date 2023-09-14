package Ext;

public class Atester{

	public static void main(String[] args) {
		
		//ext 안에서 객체 생성(new)의 의미도 포함하는
		A a = new A();//C -- B -- A순으로 처리
//		a.a(); //불러온건 A클래스인데 상속된 부모클래스의
		a.b();//부모 클래스의 메소드도 사용 A하나로
//		a.c();//B의 상속된 C도 사용가능
		//여기서 출력순서는 내가 적은대로 나옴
//		new A().a();
	}

}
