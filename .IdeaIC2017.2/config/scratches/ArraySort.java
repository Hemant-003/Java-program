import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array");
        int len = scanner.nextInt();
        int[] myArray = new int[len];
        int i;
        System.out.println("Enter " + len + "Number");
        for (i = 0; i < myArray.length; i++) {
            int number = scanner.nextInt();
            myArray[i] = number;
        }
        for(i=0;i<myArray.length;i++){
            for (int j=0;j<myArray.length;j++)
            if (myArray[i]> myArray[j]){
               int temp = myArray[i];
               myArray[i]=myArray[j];
               myArray[j]=temp;

            }
            for (i=0;i<myArray.length;i++){
                System.out.println(myArray[i]);
            }
        }
//        Arrays.sort(myArray);
//        System.out.println(Arrays.toString(myArray));
//

        }


    }