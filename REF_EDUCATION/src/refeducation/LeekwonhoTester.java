package refeducation;

public class LeekwonhoTester {

	public static void main(String[] args) {
		 LeekwonhoInfo Lee = new LeekwonhoInfo("남자","대한민국 파주시");//객체 불러오기
		 System.out.println("이름: " + LeekwonhoInfo.name); // 스태틱변수를 그대로 사용
		 System.out.println("거주지: " + Lee.living); //매개변수에 입력한 문자열 출력
		 System.out.println("성별: " + Lee.gender);
		 
		 
		 Lee = new LeekwonhoInfo(23, 270, 178);//매개변수에 문자열이 아닌 정수를 입력시
		 System.out.println("나이: " + Lee.age);// 매개변수에 입력한 정수 출력
		 System.out.println("신장: " + Lee.tallSize);
		 System.out.println("족장: " + Lee.footSize);
		 
		 
		 int age = Lee.getAge(23); // 참조변수를 만든 클래스의 메소드를 사용하고 값을 리설트에 저장
		 //Lee.age = Lee.getAge(23);으로 바로 넣을수도 있음
		 System.out.println("만 나이: " + age); // 메소드 getAge를 불러와 처리
		 
		 Lee.age= Lee.getAge(23);
		 System.out.println("만 나이: " + Lee.age);
		 
	}

}
