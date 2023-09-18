package abs;

public class C extends B{
	//추상메소드는 계속해서 상속됨
	//정말 중요한 메소드가 아니면 그냥 오버라이딩으로 만들기
	void a() {}
	void b() {}
	//추상클래스를 상속받은 클래스도 추상클래스 선언을 하면 나머지 클래스가 다시 사용해야함
}
