package singletoneducation;

public class OnlyOneFlyTester {

	public static void main(String[] args) {
		
		OnlyOneFly  fly = OnlyOneFly.getIntance();
		
		System.out.println(fly.PrintFly("fly"));
		System.out.println("My Flygt Number IS \"" + fly.PrintflyNum(2)+ "\"" );
	}
}
