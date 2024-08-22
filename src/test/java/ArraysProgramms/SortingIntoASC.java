package ArraysProgramms;

import java.util.Arrays;

public class SortingIntoASC {

	public static void main(String[] args) {
		int a[]= {40,2,50,3,1};//comparing first values and second value then do swap.
		System.out.println("Before :"+Arrays.toString(a));
		int temp;
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=0;j<a.length-1;j++) {
				if(a[j]<a[j+1]) {  //40<2
					 temp=a[j];    //40 
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		

	}
		System.out.println("After :"+Arrays.toString(a));

}
}
