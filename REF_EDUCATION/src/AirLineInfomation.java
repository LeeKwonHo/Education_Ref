
public class AirLineInfomation { // 클래스명 지정, 파일명과 같아야함, 대문자로 시작(권장)
	// 모든데이터는 문자로 표현 가능
	String startTime;// 출발시간
	String endTime;// 도착시간
	String flightNumber;// 항공편명
	String ticketNumber;// 항공권번호
	String from;// 출발지
	String to;// 도착지

	// 기능,메소드
//	항공권 사용여부, boolean isUsed 
	boolean isUsed() { // 사용여부에 대한 처리를 메소드에서 진행
		// DB정보 확인, void선언이 아닐땐 리턴이 잇어야함
		return false;
	}

}