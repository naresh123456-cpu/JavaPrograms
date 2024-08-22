package ArraysProgramms;

public class MoveZeroesToLast {

	public static void main(String[] args) {
		int []a= {1,4,0,0,12,4};
		int temp=0;
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
