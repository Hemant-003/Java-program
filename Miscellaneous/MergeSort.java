import java.util.*;

class MergeSort {

	private static int ar[] = {12, 23, 1, 43, 0, 78, 76, 6};
			// Expected Output 	{0, 1, 6, 12, 23, 43, 76, 78}
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
		testCasesForMerge();
		testCasesForSort();
		sort(ar, 0, ar.length - 1);

		System.out.println(Arrays.toString(ar));
	}

	private static void sort(int ar[], int start ,int end){
		int numberOfElements = end - start + 1;
		if (numberOfElements == 1) return; 
		if (numberOfElements == 2) {
			if(ar[start] > ar[end]){
				int temp;
				temp = ar[start];
				ar[start] = ar[end];
				ar[end] = temp;
				return;
			}
			return;
		}
		int mid = ((end - start) / 2) + start;
		sort(ar, start, mid);
		sort(ar, mid + 1, end);
		merge(start, mid, end);
	}

	/* 
	 Length of array1 is m
	 Length of array2 is n
	 Space complexity is m + n
	 Time complexity 
		 O(m + n)
	*/


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
		//{12, 23, 1, 43}
		while (i <= mid && j <= end) {
			if (ar[i] <= ar[j]) {
				sortedArray[sortedArrayIndex++] = ar[i++];
			} else {
				sortedArray[sortedArrayIndex++] = ar[j++];
			}
			
		}

		while (j <= end) {
			sortedArray[sortedArrayIndex++] = ar[j++];
		}

		while (i <= mid) {
			sortedArray[sortedArrayIndex++] = ar[i++];
		}

		//Copying values back to original array
		for (i = 0; i < sortedArray.length; i++) {
			ar[start + i] = sortedArray[i];
		}

		return sortedArray;
	}

	private static void testCasesForSort(){
		System.out.println("-------------------------------------");
		int mergedSortedArrays[] = {12, 23, 1, 43};
		ar = mergedSortedArrays;
		int start = 0, end = 3;
		sort(ar, start, end);
	}

	private static void testCasesForMerge(){
		System.out.println("-------------------------------------");
		int mergedSortedArrays1[] = {1,3,5, 6, 234,654,888, 2,4,6,8,10,11,34};
		ar = mergedSortedArrays1;
		int start = 0, mid = 6, end = 13;
		int result[] = merge(start, mid, end);
		System.out.println(Arrays.toString(result));

		System.out.println("-------------------------------------");
		int mergedSortedArrays2[] = {2,1};
		ar = mergedSortedArrays2;
		start = 0; mid = 0; end = 1;
		result = merge(start, mid, end);
		System.out.println(Arrays.toString(result));

		System.out.println("-------------------------------------");
		int mergedSortedArrays3[] = {2,3,1};
		ar = mergedSortedArrays3;
		start = 0; mid = 1; end = 2;
		result = merge(start, mid, end);
		System.out.println(Arrays.toString(result));

		System.out.println("-------------------------------------");
		int mergedSortedArrays4[] = {2};
		ar = mergedSortedArrays4;
		start = 0; mid = 0; end = 0;
		result = merge( start, mid, end);
		System.out.println(Arrays.toString(result));

		System.out.println("-------------------------------------");
		int mergedSortedArrays5[] = null;
		ar = null;
		start = 0; mid = 0; end = 0;
		result = merge(start, mid, end);
		System.out.println(Arrays.toString(result));

		System.out.println("-------------------------------------");
		int mergedSortedArrays6[] = {12, 23, 1, 43};
		ar = mergedSortedArrays6;
		start = 0; mid = 1; end = 3;
		result = merge(start, mid, end);
		System.out.println(Arrays.toString(result));
	}
}
