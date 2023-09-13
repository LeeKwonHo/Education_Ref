package refeducation;

public class ClothesShopTester {

	public static void main(String[] args) {
		ClothseInfo clothseInfo = new ClothseInfo("상의", "110", "검은색", "박스티");
		//상의 정보와 가격,부가세
		System.out.println("디자이너: " + ClothseInfo.DESIGNER);
		System.out.println("의류구분: " + clothseInfo.colthesType);
		System.out.println("사이즈: " + clothseInfo.size);
		System.out.println("색상: " + clothseInfo.color);
		System.out.println("종류: " + clothseInfo.style);
		
		clothseInfo.getPrice(50000.0);
		System.out.println("가격: " + clothseInfo.fullPrice);
		System.out.println("부가세: " + clothseInfo.vat);
		
		System.out.println("\n");
		
		//하의 정보와 가격, 부가세
		ClothseInfo clothseInfo2 = new ClothseInfo("하의", "Large", "회색", "츄리닝");
		System.out.println("디자이너: " + ClothseInfo.DESIGNER);
		System.out.println("의류구분: " + clothseInfo2.colthesType);
		System.out.println("사이즈: " + clothseInfo2.size);
		System.out.println("색상: " + clothseInfo2.color);
		System.out.println("종류: " + clothseInfo2.style);
		
		clothseInfo.getPrice(20000.0);
		System.out.println("가격: " + clothseInfo.fullPrice);
		System.out.println("부가세: " + clothseInfo.vat);
	}

}
