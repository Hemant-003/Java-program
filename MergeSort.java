import java.util.*;

class MergeSort {

	private static int ar[] = {12, 23, 1, 43, 0, 78, 76, 6};

	/*

	Problem part 3 :
		* {12, 23, 1, 43, 0, 78, 76, 6}
		* sort(12, 23, 1, 43)
		* sort(0, 78, 76, 6)
		* {1, 12, 23, 43, 0, 6, 76, 78}
		* merge(a, 0, 3,7)
		*
		* {12, 23, 1, 43}
		sort (12, 23)
		sort (1, 43)
		merge
		
		base case => 2/1 elements
		{12, 23}

		mergeSort(int a[], int start, int end)
		if base case
		?? do something
		return
		int mid;
		mergeSort(a, start, mid);
		mergeSort(a, mid+1, end);
		merge()
	*/
	public static void main(String[] args) {
		// int ar1[] = {1,3,5, 5, 234, 654, 888};
		// int ar2[] = {2,4,6,8,10,11,34};
		// System.out.println(Arrays.toString(merge2Arrays(ar1, ar2)));
		// System.out.println(Arrays.toString(merge2Arrays(null, ar2)));
		// System.out.println(Arrays.toString(merge2Arrays(null, null)));

		// testCasesForMerge();

		sort(0, ar.length - 1);
		System.out.println(Arrays.toString(ar));
	}

	private static void sort(int start,int end){
		if (end - start <= 1) {
			if(ar[start] > ar[end]){
				ar[start] = ar[start] + ar[end];
				ar[end] = ar[start] - ar[end];
				ar[start] = ar[start] - ar[end];
				return;
			}
			return;
		}

		int mid = ((end - start) / 2) + start;;
		sort(start, mid);
		System.out.println(start +" "+ mid+" "+ end);
		System.out.println(Arrays.toString(ar));
		sort(mid + 1, end);
		System.out.println(start +" "+ mid+" "+ end);
		System.out.println(Arrays.toString(ar));
		merge(start, mid, end);
	}

	/* 
	 Length of array1 is m
	 Length of array2 is n
	 Space complexity is m + n
	 Time complexity 
		 O(m + n)
	*/

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

	/* 
		Problem part 2 :
			int ar1[] = {1,3,5, 5, 234,654,888, 2,4,6,8,10,11,34};
			start = 0, mid = 6, end	= 13
			[1, 2, 3, 4, 5, 5, 6, 8, 10, 11, 34, 234, 654, 888]

	*/ 

	private static int[] merge(int start,int mid,int end){
		if(ar == null){
			throw new IllegalArgumentException("Array should not be null");
		}
		int sortedArray[] = new int[1 + end - start];
		int sortedArrayIndex = 0;
		int i = start, j = mid + 1;
		while (i <= mid && j <= end) {
			if (ar[i] <= ar[j]) {
				sortedArray[sortedArrayIndex++] = ar[i++];
			} else {
				sortedArray[sortedArrayIndex++] = ar[j++];
			}
		}

		while (j < end) {
			sortedArray[sortedArrayIndex++] = ar[j++];
		}

		while (i <= mid) {
			sortedArray[sortedArrayIndex++] = ar[i++];
		}
		for (i = 0; i < sortedArray.length; i++) {
			ar[start + i] = sortedArray[i];
		}
		return sortedArray;
	}

	// private static void testCasesForMerge(){
	// 	System.out.println("-------------------------------------");
	// 	int mergedSortedArrays1[] = {1,3,5, 5, 234,654,888, 2,4,6,8,10,11,34};
	// 	int start = 0, mid = 6, end = 13;
	// 	int result[] = merge(mergedSortedArrays1, start, mid, end);
	// 	System.out.println(Arrays.toString(result));

	// 	System.out.println("-------------------------------------");
	// 	int mergedSortedArrays2[] = {2,1};
	// 	start = 0; mid = 0; end = 1;
	// 	result = merge(mergedSortedArrays2, start, mid, end);
	// 	System.out.println(Arrays.toString(result));

	// 	System.out.println("-------------------------------------");
	// 	int mergedSortedArrays3[] = {2,3,1};
	// 	start = 0; mid = 1; end = 2;
	// 	result = merge(mergedSortedArrays3, start, mid, end);
	// 	System.out.println(Arrays.toString(result));

	// 	System.out.println("-------------------------------------");
	// 	int mergedSortedArrays4[] = {2};
	// 	start = 0; mid = 0; end = 0;
	// 	result = merge(mergedSortedArrays4, start, mid, end);
	// 	System.out.println(Arrays.toString(result));

	// 	System.out.println("-------------------------------------");
	// 	int mergedSortedArrays5[] = null;
	// 	start = 0; mid = 0; end = 0;
	// 	result = merge(mergedSortedArrays5, start, mid, end);
	// 	System.out.println(Arrays.toString(result));
	// }
}
