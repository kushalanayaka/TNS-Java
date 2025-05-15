package CoreJava;

public class enclpasulation {
	public static void main(String args []) {
		
		Studts std = new Studts();
		std.setId(21);
		std.setName("Kushal");
		std.setAddr("Hsr");
		
		System.out.println("ID: "+std.getId()+" NAME: "+std.getName()+" Address: "+std.getAddr());
		
	}

}

class Studts{
	
	private int Id;
	private  String addr;
	private String Name;
	
	public void setId(int no) {
		this.Id = no;
	}
	
	public int getId() {
		return Id;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	
	public String getName() {
		return Name;
	}
	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
