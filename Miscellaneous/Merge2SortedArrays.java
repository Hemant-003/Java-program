import java.util.*;
class Merge2SortedArrays {
	public static void main(String[] args) {
		int ar1[] = {1,3,5, 5, 234, 654, 888};
		int ar2[] = {2,4,6,8,10,11,34};
		System.out.println(Arrays.toString(merge2Arrays(ar1, ar2)));
		System.out.println(Arrays.toString(merge2Arrays(null, ar2)));
		System.out.println(Arrays.toString(merge2Arrays(null, null)));
	}
	private static int[] merge2Arrays(int ar1[], int ar2[]){
		if (ar1 == null) ar1 = new int[0];
		if (ar2 == null) ar2 = new int[0];

		int i = 0, j = 0, k = 0;
		int ar3[] = new int[ar1.length + ar2.length];
		while( i < ar1.length && j < ar2.length ) {
			if (ar1[i] <= ar2[j]){
				ar3[k++] = ar1[i++];
			} else {
				ar3[k++] = ar2[j++];
			}
		}

		if (i == ar1.length) {
			while (j < ar2.length) {
				ar3[k++] = ar2[j++];
			}
		}

		if (j == ar2.length) {
			while (i < ar1.length) {
				ar3[k++] = ar1[i++];
			}
		}
		return ar3;
	}

}