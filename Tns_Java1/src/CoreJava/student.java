package CoreJava;

public class student {
	   private int roolno;
	   private String name;
	   
   public static void main(String args[]) {
	   

   }

public int getRoolno() {
	return roolno;
}

public void setRoolno(int roolno) {
	this.roolno = roolno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


public String toString() {
	return "student [roolno=" + roolno + ", name=" + name + ", getRoolno()=" + getRoolno() + ", getName()=" + getName()
			+ "]";
}
}


