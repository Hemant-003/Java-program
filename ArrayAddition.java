
import java.util.Scanner;
import java.text.DecimalFormat;

public class ArrayAddition{
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter length of array");
        int len = scanner.nextInt();
        int [] myArray = new int [len];
        int i;
        int sum =0;
        System.out.println( "Enter " +len+ "Number");
        for (i=0;i<myArray.length;i++){
            int number = scanner.nextInt();
            myArray[i]= number;
        }
        for (i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
        for (i=0;i<myArray.length;i++){
            sum = sum + myArray[i];
        }
        System.out.println("Total is : " +sum);
        double average = (double) sum/len;
        DecimalFormat numberFormat = new DecimalFormat("#.0000");
        System.out.println("average is : " + numberFormat.format(average));


    }
}
