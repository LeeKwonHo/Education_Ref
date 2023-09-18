package abs;

public class AbsDog extends AbstractExAnimal{
//실체클래스에서 추상메소드를 오버라이딩해서 구현
	@Override
	void Sound() {
		System.out.println("Dog Sound");
		
	}

	@Override
	void Move() {
		System.out.println("Move Dog");
	}
	void dogdog() {
		System.out.println("Not Abstract Method DOG");
	}

}
