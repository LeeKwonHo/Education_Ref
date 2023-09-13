package refeducation;

public class CGVInformation {
	
	public static String CINEMA_NAME = "CGV";//극장명바뀌지 않으니 고정 스태틱
	//티켓번호, 영화제목, 상영일시, 상영관
	int ticketNum;
	int lastNum;
	int movieDate;
	String movieName;
	String movieTheit;
	//생성자명은 클래스명과 동일
	public CGVInformation(String moviName, String movieTheit) { // String or int
		this(1);
		this.movieName = moviName;
		this.movieTheit = movieTheit;
	}
	//생성자 오버로딩
	public CGVInformation(int movieDate) {
		this.movieDate = movieDate;
	}
	
		int getTicketNum(int ticketNum) {
			lastNum = ticketNum;
			return ++ticketNum;
	}
/*
 * TIPs) 생성자를 오버로딩할떄 계단식으로 만들자 보기 쉽고 작성하기 쉬워보임
Ex) 
Car()
this("이름없음", 0);

Car(String name)
this("name", 0);
this.name = name;

Car(String name, int number)
this("name", 0, 0);
this.name = name;
this.number = number;

Car(String name, int number, int maxSpeed)
this.name = name;
this.number = number;
this.maxSpeed = maxSpeed;
 */
}
