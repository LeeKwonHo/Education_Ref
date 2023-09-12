package refeducation;

public class CGVInformation {
	
	public static String Cgv = "CGV";//극장명
	//티켓번호, 영화제목, 상영일시, 상영관
	int ticketNum;
	int movieDate;
	String movieName;
	String movieTheit;
	//생성자명은 클래스명과 동일
	public CGVInformation(String moviName, String movieTheit) { // String or int
		this(1,1);
		this.movieName = moviName;
		this.movieTheit = movieTheit;
	}
	//생성자 오버로딩
	public CGVInformation(int ticketNum, int movieDate) {
		
		this.ticketNum = ticketNum;
		this.movieDate = movieDate;
	}
	
	
/*
 * 메소드 오버로딩 만들어보기 티켓이 1장 들어가면 2장이나오는 시스템 ++변수
 */
	
}
