package refeducation;

public class CGVticketTester {

	public static void main(String[] args) {
		CGVInformation cgv = new CGVInformation("라이언킹","123번");
		CGVInformation cgv1 = new CGVInformation(1234, 20230914);
		
		System.out.println("극장이름: " + CGVInformation.Cgv);
		
		System.out.println("영화제목: " + cgv.movieName);
		System.out.println("좌석번호: " + cgv.movieTheit);
		
		System.out.println("티켓번호: " + cgv1.ticketNum);
		System.out.println("상영일시: " + cgv1.movieDate);
	}

}
