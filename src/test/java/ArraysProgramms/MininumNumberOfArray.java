package ArraysProgramms;

public class MininumNumberOfArray {

	public static void main(String[] args) {
		int a[]= {50,60,10,1,40,20};
		int min=a[0];
		for(int i=1;i<=a.length-1;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("The minimum number is  "+min);
}
}
