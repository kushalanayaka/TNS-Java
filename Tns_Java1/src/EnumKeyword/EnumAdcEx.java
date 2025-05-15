package EnumKeyword;

public class EnumAdcEx {

	public static void main(String[] args) {
         
		
		Pizza.Medium.setPrice(400);;
		System.out.println(Pizza.Medium+" : " + Pizza.Medium.getPrice());
		
//		for(Pizza p : Pizza.values()) {
//			System.out.println(p + " : " + p.getPrice());
//		}
	}

}


enum Pizza{
	Small(100), Medium(250), Full(500), FimalyOffer(), BestOffer();
	
	private int price;
	
	Pizza(){
		this .price = 1000;
	}
	
	Pizza(int price){
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int newprice) {
		this.price = newprice;
	}
}