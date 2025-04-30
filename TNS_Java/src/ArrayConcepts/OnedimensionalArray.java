package ArrayConcepts;

public class OnedimensionalArray {
	
	
	public static void main(String Args[]) {
	int arr[] = {1,2,3,4,5,6};
	
	for(int i=0; i<arr.length-1; i++) {
		
//		System.out.println("Array of " + i + " is "+ arr[i]);
	
	}
	
	int a[] = new int[3]; //Dynamic initialization of array
	a[0] = 12;
	a[1] = 34;
	a[2] = 52;
	
	for(int i=0; i<a.length; i++) {
		
		System.out.println("Array of " + i + " is "+ a[i]);
	
	}

}
}