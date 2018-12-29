package Sorting;

import java.util.Scanner;

public class  QuickSort {
	private long count = 0;

	
	public long getNumberOfInst(){
		return count;
	}
	public void reset(){
		count = 0;
	}
	
	public void swap(int[] array, int i, int j) {
		//helper method to swap element in array
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
		count++;
	}
	
	public int partition(int arr[], int left, int right) {
		int pivot = arr[(left + right) / 2]; // Pick an element as pivot point. 
		
		while (left <= right) { // loop through the array
			// Find element on left that should be on right side of pivot point
			//if its not, pointer move right for one position
			while (arr[left] < pivot) { 
				left++;
				count++;
			}
			
			// Find element on right that should be on left side of pivot point
			//if its not, pointer move left for one position
			while (arr[right] > pivot) {
				right--;
				count++;
			}
			
			//if both while loop stop,that means we find two element we want to swap
			//the we swap elements, and update left and right pointer
			if (left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left; 
	}
	
	public void quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right); 
		if (left < index - 1) { // if index has not yet reached leftmost part, Sort left half of array
			quickSort(arr, left, index - 1);
		}
		if (index < right) { // if index has not yet reached rightmost part, Sort right half of array
			quickSort(arr, index, right);
		}
	}

	} 


