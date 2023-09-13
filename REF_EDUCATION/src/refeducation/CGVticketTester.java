package refeducation;

public class CGVticketTester {

	public static void main(String[] args) {
		CGVInformation cgv = new CGVInformation("라이언킹","123번");//참조형 변수를 불러옴
		
		
		System.out.println("극장이름: " + CGVInformation.CINEMA_NAME); 
		System.out.println("영화제목: " + cgv.movieName);
		System.out.println("좌석번호: " + cgv.movieTheit);
		
		
		cgv = new CGVInformation(20230914);
		cgv.ticketNum = cgv.getTicketNum(2);
		
		System.out.println("상영일시: " + cgv.movieDate);
		System.out.println("티켓번호: " + cgv.ticketNum);
		System.out.println("지난 티켓번호: " + cgv.lastNum);
	}

}
