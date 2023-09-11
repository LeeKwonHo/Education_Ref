
public class CalculatorTester {

	public static void main(String[] args) {
		
		Calculator cal2 = new Calculator();//클래스를 생성하는 명령어,클래스를 메모리에 올림
		//cal이라는 calculater를 만듬 ref
		cal2.add(1, 2);
		Calculator cal3 = new Calculator();
		cal3.add(2, 3);
		
		System.out.println(cal2.getSum());
		System.out.println(cal3.getSum());
	}
}