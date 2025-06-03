package Practice;

public class arrays {

	public static void main(String[] args) {

		int arr[] = {1, 2, 4, 5};
		int a[] = new int[3];
		
		a[0] = 20;
		a[1] = 21;
		
		for(int i : arr) {
			
			for(int j : a) {
				
			System.out.println(i +" "+ j);
		}
	}
	
}

}
