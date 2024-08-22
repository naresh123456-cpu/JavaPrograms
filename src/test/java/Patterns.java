
public class Patterns {

	public static void main(String[] args) {
	
		int n=20;
		int currentOddNumber=1;
		for(int i=20;i<=n;i--) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for (int j = i; j <= i; j++) {
                System.out.print(currentOddNumber + " ");
                currentOddNumber += 2;  // Move to the next odd number
            }
            System.out.println();  // Move to the next line
        }
			

	}

}
