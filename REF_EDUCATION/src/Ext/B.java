package Ext;

public class B extends C {
	 
	int b;
	
	public  B() {
		System.out.println("B 생성자");
	}
	
	public  B(int i) {
		super(1);
		System.out.println("B-1 생성자");
	}
	
	void b() {
		System.out.println("I'am B method");
	}

}
