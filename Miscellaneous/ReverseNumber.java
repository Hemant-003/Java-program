import java.util.Scanner;
public class ReverseNumber{
	public static void main(String []args){
		int ReverseN=0;

		

		System.out.println("Enter number you want to Reverse");
		Scanner s = new Scanner(System.in);
		String NumberN = s.next();
		int ValueInt=Integer.parseInt(NumberN);
			while(ValueInt!=0){
				 ReverseN = ReverseN * 10;
          		ReverseN = ReverseN + ValueInt%10;
         		 ValueInt= ValueInt/10;
         		 
      }
      System.out.println(ReverseN);
      }
			
	}
	
