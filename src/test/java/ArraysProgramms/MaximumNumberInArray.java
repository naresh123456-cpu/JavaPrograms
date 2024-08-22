package ArraysProgramms;

public class MaximumNumberInArray {

	public static void main(String[] args) {
		int a[]= {50,20,140,60,80,90,1580};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
			max=a[i];
			}
		}
		System.out.println("Maximum number from array is: "+max);

}
}
