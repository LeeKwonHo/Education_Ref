package refeducation;

public class ClothseInfo {
	static String DESIGNER = "LeeKwonHo"; //디자이너는 한명
	
	String colthesType;
	String size;
	String color;
	String style;
	double vat;
	double fullPrice;
	int a;
	
	public ClothseInfo(String colthesType
			,String size
			,String color
			,String style) {
		this.colthesType = colthesType;
		this.size = size;
		this.color = color;
		this.style = style;
	}
	public ClothseInfo(int a) {
		
		this.a = a;
	}
	
	double getPrice(double vat) {
		fullPrice = vat;
		return this.vat = vat * 0.1;
	}
	
	
	
}
