package animal;


public class Zookeeper {
//사육사는 동물을 케어함
	//먹이를 줍니다
	Animal a;//필드의 다형성
	
	void feed(Animal a) {//사육사의 메소드 메소드의 다형성도 가능
			a.soundFeed();} //리턴타입의 다형성도 됨
	

}
