package ArraysProgramms;

public class FindThDuplicateElementsInArray {

	public static void main(String[] args) {
		int a[]= {1,4,5,6,1,7};// compare first value with rest all values
		int count=0;
		for(int i=0;i<a.length-1;i++) {
			
			for (int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {

					System.out.println("Found Duplicate value : "+a[i]);
					count++;
				}
			}
		}if(count==0) {
		System.out.println("Duplicate elements not found");
	}
	}
}
