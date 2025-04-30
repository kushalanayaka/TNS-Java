package ArrayConcepts;

public class JaggedArrays {
	public static void main(String args[]) {
		
		int arr[][] = new int[3][];
		
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[1];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*1000);
			}
		}
		for(int m[] : arr) {
			for(int n:m) {
				System.out.print(n+" ");
			}
			System.out.println(" ");
			}
	}

}
