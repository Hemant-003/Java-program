import java.util.Scanner;
public class KLargestElement{
	public static void main(String[]args){
		int i;
	
	Scanner s = new Scanner(System.in);
	int len = s.nextInt();
	int [] a = new int [len];
	for (i=0;i<len ;i++ ) {
		a[i]= s.nextInt();
	}
	for(int j=0;j<len;j++){
		System.out.println(a[j]);
	}
	int count = 0;
	int temp;
	
	for (i=0;i<len ;i++ ) {
		for(int k =0;k<len;k++){
		if (a[i]>a[k]){
			temp=a[i];
			a[i]=a[k];
			a[k]= temp;
		}
		System.out.println("sorted array is :"+a[k]);

		}
		
			}

	}
		
	}
