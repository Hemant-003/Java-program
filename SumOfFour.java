import java.util.Scanner;

public class SumOfFour {
	public static void main(String[] args) {
		
		int[] numArray = new int[4]; // Define an array of integers of size 4.
		Scanner s = new Scanner(System.in);
                int i;
		for(i=0; i<4; i++){
			numArray[i] = s.nextInt(); // Get the input
		}
		
		int sum = 0;
		for(int j=0;j<numArray.length;j++){
		sum += numArray[j];
		}
		
		System.out.print(sum); // Print the sum
		s.close();
	}
}