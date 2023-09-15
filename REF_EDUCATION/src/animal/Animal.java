package animal;

public class Animal {
//부모 클래스, 슈퍼클래스
	public void soundFeed() {//동물에는 먹을때 나는 소리가 있다
		System.out.println("Animal Feed");
		//매개변수의 다형성
		//메인 메소드에 바로 애니멀을 가져오면 애니멀만 사용하게 됨
		//왜냐면 애니멀은 다른 동물들의 슈퍼클래스이기 떄문에
		//서브 클래스의 기능을 사용 못함
	}
	
	
	
}
