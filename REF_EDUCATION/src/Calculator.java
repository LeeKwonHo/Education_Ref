
public class Calculator {//클래스명과 파일명은 항상 동일하게
	//add기능을 가진 클래스
	
	static int sum;//결과값을 저장, 글로벌변수 new되었을때 메모리에 올라가는변수
	//sum의 값을 저장
	int price;
	
	public Calculator(int price) {
		
		this.price = price;
	}
	
	
	int getSum() {//캡슐화된 값을 메소드(처리과정)을 통해 알려주는것
		return sum;
	
	}
	int add(int a, int b) {// int a는 매개변수의 타입 선언
		sum = a+b;//연산결과를 sum에 먼저 넣어주고
		return sum;
	}
	int del(int a, int b) {
		sum = a-b;
		return sum;
	}
	int add(int a, int b, int c) {//메소드명이 2개더하기와 같음, 
		sum = a + b + c;
		return sum;
	}
	

}
