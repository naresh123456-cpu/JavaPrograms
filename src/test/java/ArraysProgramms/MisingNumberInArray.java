package ArraysProgramms;

public class MisingNumberInArray {

	public static void main(String[] args) {
		
		int []a= {1,3,4,5,6};
		int sum=0;
		int n=a.length+1;
		int expSum=n*(n+1)/2;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		int missingNumber=expSum-sum;
		System.out.println(missingNumber);
	}

}
