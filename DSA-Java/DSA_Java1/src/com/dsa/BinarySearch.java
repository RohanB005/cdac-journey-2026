package com.dsa;


public class BinarySearch {
        public static int recursiveSearch(int[] arr, int left, int right, int target) {
        	if(left > right) {
        		return -1;
        	}
        	int mid = left + (right - left) / 2;
        	if(arr[mid] == target) {
        		return mid;
        	}
        	if(target < arr[mid]) {
        		return recursiveSearch(arr, left, mid-1, target);
        	}
        	return recursiveSearch(arr, mid+1, right, target);
    }

        public static void main(String[] arr) {
			// sum of arrays
			/*int sum = 0;
			for(int num : arr) {
				sum += num;
			}
			System.out.println("Sum: " + sum);*/
			
			//min max
			/*int min = arr[0];
			int max = arr[0];
			for(int num : arr) {
				if(num < min) min = num;
				if(num > max) max = num;
			}
			System.out.println("Min: " + min + ", Max: " + max);*/
			/*int first = Integer.MIN_VALUE;
			int second = Integer.MAX_VALUE;
			for(int num : arr) {
				if(num > first) {
					second = first;
					first = num;
				}else if(num > second && num != first) {
					second = num;
				}
			}
			System.out.println("Second Largest Num: " + second);*/
			/*int left = 0, right = arr.length - 1;
			while(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left ++;
				right --;
			}
			/*System.out.println(Arrays.toString(arr));
			for(int i=0;i<arr.length;i+=2) {
				System.out.print(arr[i] + " ");
			}*/
			int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
			int target = 56;
			int result = recursiveSearch(sortedArray, 0, sortedArray.length - 1,target);
			
			if(result == -1) {
				System.out.println("Element not found");
			}
			else {
				System.out.println("Element found at index: " + result);
			}
		} 
}


