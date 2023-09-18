package ifc;

public class CTest {

	public static void main(String[] args) {
		//인터페이스에 연결된 클래스는 다형성으로 사용가능
		A a = new C();//다형성으로 C를 A로 바꿈
		B b = new C();
		D d = new C();
		a.a();
		b.b();
		
		C c = new C();
		
		ct1(c);
		ct1(a);
	}	
		static void ct1(C c) {
			System.out.println("Hello Wolrd");
		}
		static void ct1(A a) {
			System.out.println("Hello Wolrd");
		}
	

}
