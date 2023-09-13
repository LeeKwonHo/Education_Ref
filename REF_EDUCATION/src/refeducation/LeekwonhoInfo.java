package refeducation;

public class LeekwonhoInfo {
	//이름, 나이, 성별, 키, 발 사이즈, 거주지역
	static String name = "LeeKwonHo";
	int age;
	int footSize;
	int tallSize;
	String gender;
	String living;
	
	public LeekwonhoInfo(String gender, String living) { // 문자열 입력시 사용되는 생성자
		this(0, 0, 0);
		this.gender = gender;
		this.living = living;
		
	}
	
	public LeekwonhoInfo(int age, int footSize, int tallSize) { // 생성자 오버로드로 인해 숫자가 들어올떄만 사용하게 지정
		this.age = age;
		this.footSize = footSize;
		this.tallSize = tallSize;
	}
	
	
	int getAge(int age) { //만 나이를 구하는 메소드
		return age = age - 2;
		
	}
}
