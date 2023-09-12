package refeducation;

public class PersonInformation {

	String nation = "대한민국";
	String name;
	int age;
	
	public PersonInformation(String name, int age) {//()안에 매개변수를 지정, 매개변수랑 입력해줘야하는 변수, 빈칸;
		this.name = name;//this로 초기화할 변수 지정
		this.age = age;
	}
	
}
