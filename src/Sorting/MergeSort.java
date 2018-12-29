package Sorting;

public class MergeSort {
	
	private long numOfInst =0;   //use to count the number of instruction
	
	public long getNumberOfInst(){
		return numOfInst;
	}
	public void reset(){
		numOfInst = 0;
	}
	
	public void merge(int[]array, int low, int mid, int high){
		int i=low,j=mid+1,count=0;
		int temp[] = new int[high-low+1]; // temp array contain the sorted part of the array
		while(i<=mid&&j<=high){
			if(array[i]<array[j]){ //do the compare
				temp[count] = array[i]; // if element at i smaller than element at j, put element i to to front of temp array 
				i++; //update pointer, always pointing at front of temp array
				numOfInst++;
			}else{
				temp[count] = array[j]; //same procedure with above if element j smaller than element i
				j++;
				numOfInst++;
			}
			count++;
		}
		if(i<=mid){
			for(int in = count;in<temp.length;in++){
				temp[in] = array[i]; // if all element from second half of array are store in temp array, add everything left
				//in first half to temp array
				i++;
			}
		}else{
			for(int in = count;in<temp.length;in++){
				//same with above, if there are staffs left in second part of array, add them to temp array
				temp[in] = array[j];
				j++;
				numOfInst++;
			}
		}
		for(int n=0;n<(high-low+1);n++){
			array[low+n] = temp[n];
			//add temp array to origin array
		}
		
	}
	
	public void mergeSort(int[]array, int low, int high){
		int mid;
		if(low<high){
			mid = (high-low)/2+low; //divide array into left and right parts
			mergeSort(array,low,mid); //do merge sort on left part recursively
			mergeSort(array,mid+1,high); //do merge sort on right part recursively
			merge(array,low,mid,high); //combine left and right part together
		}
		
		
	}

}
