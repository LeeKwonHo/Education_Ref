package refeducation;

public class PersonTester {

	public static void main(String[] args) {
		PersonInformation Ps = new PersonInformation("이권호", 23);//생성자 호출후 매개변수 입력
		System.out.println(Ps.nation + "출생");
		System.out.println(Ps.name + "님");
		System.out.println(Ps.age + "세");
		
		PersonInformation ps2 = new PersonInformation("강성식", 23);
		System.out.println(ps2.nation + "출생");
		System.out.println(ps2.name + "님");
		System.out.println(ps2.age + "세");

	}

}
