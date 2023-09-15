package animal;


public class Zookeeper {
//사육사는 동물을 케어함
	//먹이를 줍니다
	Animal a;//필드의 다형성
	//animal클래스를 a로 지정
	void feed(Animal a) {//사육사의 메소드 메소드의 다형성도 가능
		//animal 클래스 a가 들어오면 a라고 지정한 animal의 메소드 실행	
		a.soundFeed();} //리턴타입의 다형성도 됨
	//슈퍼클래스 애니멀의 관리를 맞는 소스 
// a타입(animal)타입의 입력이 있을때 animal의 메소드를 출력
}
