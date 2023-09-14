package Ext;

public class A extends B {
	
	int a;
	
	public  A() { //정보와 처리만 불러오기 가능
//		super(1); //부모 클래스가 지정한 매개변수로 접근
		System.out.println("A 생성자");
	}
	
	void a() {
		
		System.out.println("Hi I'am \"A\"");
	}
	void b() {
		System.out.println("I'am B method2");
	}// b메소드의 재정의 오버라이딩
	
	}
