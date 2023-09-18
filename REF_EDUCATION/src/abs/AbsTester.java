package abs;

public class AbsTester {

	public static void main(String[] args) {
		AbsDog dog = new AbsDog();
		AbsCat cat = new AbsCat();
		//추상메소드를 오버라이딩한 실체클래스를 인스턴스해 메소드를 사용
		
		dog.Sound();
		dog.Move();
		dog.dogdog();
		
		cat.Sound();
		cat.Move();
		cat.catcat();
		
		
	}

}
