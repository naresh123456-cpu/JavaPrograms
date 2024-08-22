package ArraysProgramms;

public class UpdateArrayWithtwoValues {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5};
		int []updateArray=new int[a.length+1];
		
		for(int i=0;i<a.length;i++) {
			updateArray[i]=a[i];
		}
		updateArray[a.length-1]=0;
		updateArray[a.length]=9;
		for(int i=0;i<updateArray.length;i++) {
			System.out.print(updateArray[i]+" ");
		}
	}

}
