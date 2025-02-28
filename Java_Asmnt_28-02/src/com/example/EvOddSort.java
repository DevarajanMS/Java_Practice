package com.example;

import java.util.Scanner;
import java.util.Arrays;
public class EvOddSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		int low = 0, hi = arr.length - 1;
		
        while (low < hi) {
            while (arr[low] % 2 == 0 && low < hi)
                low++;
            while (arr[hi] % 2 == 1 && low < hi)
                hi--;
            if (low < hi) {
                int temp = arr[low];
                arr[low] = arr[hi];
                arr[hi] = temp;
                low++;
                hi--;
            }
        }
        System.out.println("Array after segregation: " + Arrays.toString(arr));
        in.close();
	}
}
