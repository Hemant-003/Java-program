package com.company;
import java.util.Scanner;
public class AddTwoArrays {


        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            // Reading integer from input
            int N = s.nextInt();

            int[] numArrayA = new int[N];
            int[] numArrayB = new int[N];
            int[] sumArray = new int[N];

            // Read numArray1
            for(int i=0; i<N; i++) {
                numArrayA[i] = s.nextInt();
            }
            // Read numArray2
            for(int i=0; i<N; i++) {
                numArrayB[i] = s.nextInt();
            }
            for (int k=0;k<N;k++) {
                sumArray[k] = numArrayA[k] + numArrayB[k];
            }

            // Print the sumArray
            for(int i=0; i<N; i++) {
                System.out.print(sumArray[i] + " ");
            }

            System.out.println();
            s.close();

        }

    }

