package com.example;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysOp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		
		int left = 0, right = n-1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		System.out.println("Reversed Array: "+Arrays.toString(arr));
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		System.out.println("Minimum: "+min+"\nMaximum: "+max);
		in.close();
	}
}
