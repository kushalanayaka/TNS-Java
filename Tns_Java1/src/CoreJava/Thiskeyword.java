package CoreJava;

public class Thiskeyword {
       public static void main(String args[]) {
    	   
    	   Video vi = new Video();
    	   Video vid = new Video();

    	   vi.setNum(1);
    	   vi.setName("Education");
    	   
    	   vid.setNum(2);
    	   vid.setName("Politics");
    	   
    	   vi.display();
    	   vid.display();
    	   
    	   
       }
}

class Video{
	
	int num;
	String name;
	static String quality = "1080q";
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("ID: "+ num +" Name: "+name+" quality: "+Video.quality);
	}
}
