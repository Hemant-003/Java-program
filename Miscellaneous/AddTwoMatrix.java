import java.util.Scanner;

public class AddTwoMatrix{
	public static void main(String []args){

	Scanner s = new Scanner(System.in);
	int row,col;
	System.out.println("Enter row : ");
	row = s.nextInt();
	System.out.println("Enter col : ");
	col = s.nextInt();

	int matrix1[][] = new int [row][col];
	int matrix2[][] = new int [row][col];
	int sum[][] = new int [row][col]; 

		System.out.println("Enter Elements for matrix1");
		for (int a=0;a<row ;a++ ) {
			for(int b=0;b<col;b++){
				matrix1[a][b]= s.nextInt();
			}
		}
		System.out.println("Enter Elements for matrix2");
		for (int c=0;c<row;c++) {
			for (int d=0;d<col;d++) {
				matrix2[c][d] = s.nextInt();
			}
		}
		for (int e=0;e<row ;e++ ) {
			for (int f=0;f<col ;f++ ) {
				sum[e][f] = matrix1[e][f]+matrix2[e][f];
			}
		}
		for (int g=0;g<row ;g++ ) {
			for (int h=0; h<col ;h++ ) {
				System.out.println(sum[g][h]+"\t");
				System.out.println("");	
			}
			
		}
				 
	}
	
}