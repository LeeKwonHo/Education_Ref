package singletoneducation;

public class OnlyOneFly {
	
	private static OnlyOneFly onlyonefly;
	//위 처럼 하나의 껍데기만 지정해서 잠궈버리고
	int Num;
	private OnlyOneFly() { //생성자도 잠궈버림 하지만 계속 사용가능
	}
	
	public static OnlyOneFly getIntace() { //퍼블릭 스태틱으로 열어둔 겟인스턴스 기능만 사용가능하게
		
		if( null == onlyonefly) {    //하지만 생성자가 존재하지 않을때만
			onlyonefly = new OnlyOneFly(); //new로 하나의 생성자만 올려줌
			}
		
		return onlyonefly; //리턴으로 지정한 생성자의 기능을 돌려줌
		}
	
	String PrintFly(String fly){ //메소드 부분 연구 필요
		return "Let's Fly Togther!!";
	}
	
	int PrintflyNum(int Num){
		return this.Num = Num;
	}
}
