package ArrayConcepts;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int arr[][] = {{1,2,4}, {2,5,8}};
		
//		for(int i=0; i<arr.length; i++) {
//			
//			for(int j=0; j<arr[i].length; j++) {
//				
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println(" ");
//		}
		
		
		
		int a[][] = new int[3][4];
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {		
		      a[i][j] = (int)(Math.random() * 10);
			}
		}
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<4; j++) {
				
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("----------");
		
		
		for(int m[] : a) {
			for(int n:m) {
				System.out.print(n +" ");
			}
			System.out.println(" ");
		}
		

	}

}
