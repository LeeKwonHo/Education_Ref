package refeducation;

public class ClothseInfo {
	static String DESIGNER = "LeeKwonHo"; //디자이너는 한명
	String colthesType;
	String size;
	String color;
	String style;
	double vat;
	double fullPrice;
	
	public ClothseInfo(String colthesType
			,String size
			,String color
			,String style) {
		
		this.colthesType = colthesType;
		this.size = size;
		this.color = color;
		this.style = style;
	}
	
	double getPrice(double vat) {
		fullPrice = vat;
		return this.vat = vat * 0.1;
	}
	
	//boolean clothesType 사용해보기
	/*
	 * 생성자에서 불리언 타입도 매개변수로 기입후
	 *  clothesType이 트루라면 
	 *  this.clothesType = (clothesType) ? "상의" : "하의";  , 항이 3개라서 3항연산자라고 함
	 *  ㄴ 트루라면 앞의 내용 펄스라면 뒤의 내용
	 *  생성자를 테스터에서 불러올때 상의 하의로 나눠서 2개 불러보기
	 *  프린트를 생성자 안에 넣어보기
	 *  print메소드 안에 넣기
	 *  테스터에서 메소드 자체를 불러서 출력해보기
	 *  숙제, 복습하기
	 *  void활용해서 정보를 저장해두고 프린트메소드안에 쳐박기
	 */
	
}
