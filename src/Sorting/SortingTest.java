package Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SortingTest {
	public static void main(String[]args){
		Run();
	}
	public static void Run(){
		SortingTest st = new SortingTest();
	    int[]test;
		QuickSort testQ = new QuickSort();
		MergeSort testM = new MergeSort();
		test  = new int[10000];
		st.assignValue(test);
		testQ.reset();
		testM.reset();
		
        long startTime1 = System.currentTimeMillis();
		testQ.quickSort(test, 0, test.length-1);
		long stopTime1 = System.currentTimeMillis();
        long t1 = stopTime1 - startTime1; //calculate time
        long startTime2 = System.currentTimeMillis();
		testM.mergeSort(test, 0, test.length-1);
		long stopTime2 = System.currentTimeMillis();
        long t2 = stopTime2 - startTime2;
		System.out.println("Test input n "+10000+":\nNumber of Operation of Quick Sort: "+t1+""
				+ "\nNumber ofOperation of Merge Sort: "+t2 );
		test  = new int[20000];
		st.assignValue(test);
		testQ.reset();
		testM.reset();
	      startTime1 = System.currentTimeMillis();
			testQ.quickSort(test, 0, test.length-1);
			 stopTime1 = System.currentTimeMillis();
	         t1 = stopTime1 - startTime1;
	         startTime2 = System.currentTimeMillis();
			testM.mergeSort(test, 0, test.length-1);
			 stopTime2 = System.currentTimeMillis();
	         t2 = stopTime2 - startTime2;
		System.out.println("Test input n "+20000+":\nNumber of Operation of Quick Sort: "+t1+""
				+ "\nNumber ofOperation of Merge Sort: "+t2 );
		test  = new int[50000];
		st.assignValue(test);
		testQ.reset();
		testM.reset();
		  startTime1 = System.currentTimeMillis();
			testQ.quickSort(test, 0, test.length-1);
			 stopTime1 = System.currentTimeMillis();
	         t1 = stopTime1 - startTime1;
	         startTime2 = System.currentTimeMillis();
			testM.mergeSort(test, 0, test.length-1);
			 stopTime2 = System.currentTimeMillis();
	         t2 = stopTime2 - startTime2;
		System.out.println("Test input n ="+50000+":\nNumber of Operation of Quick Sort: "+t1+""
				+ "\nNumber ofOperation of Merge Sort: "+t2 );
		test  = new int[100000];
		st.assignValue(test);
		testQ.reset();
		testM.reset();
		  startTime1 = System.currentTimeMillis();
			testQ.quickSort(test, 0, test.length-1);
			 stopTime1 = System.currentTimeMillis();
	         t1 = stopTime1 - startTime1;
	         startTime2 = System.currentTimeMillis();
			testM.mergeSort(test, 0, test.length-1);
			 stopTime2 = System.currentTimeMillis();
	         t2 = stopTime2 - startTime2;
		System.out.println("Test input n ="+100000+":\nNumber of Operation of Quick Sort: "+t1+""
				+ "\nNumber ofOperation of Merge Sort: "+t2 );
		test  = new int[500000];
		st.assignValue(test);
		testQ.reset();
		testM.reset();
		  startTime1 = System.currentTimeMillis();
			testQ.quickSort(test, 0, test.length-1);
			 stopTime1 = System.currentTimeMillis();
	         t1 = stopTime1 - startTime1;
	         startTime2 = System.currentTimeMillis();
			testM.mergeSort(test, 0, test.length-1);
			 stopTime2 = System.currentTimeMillis();
	         t2 = stopTime2 - startTime2;
		System.out.println("Test input n ="+500000+":\nNumber of Operation of Quick Sort: "+t1+""
				+ "\nNumber ofOperation of Merge Sort: "+t2 );
		test  = new int[1000000];
		st.assignValue(test);
		testQ.reset();
		testM.reset();
		  startTime1 = System.currentTimeMillis();
			testQ.quickSort(test, 0, test.length-1);
			 stopTime1 = System.currentTimeMillis();
	         t1 = stopTime1 - startTime1;
	         startTime2 = System.currentTimeMillis();
			testM.mergeSort(test, 0, test.length-1);
			 stopTime2 = System.currentTimeMillis();
	         t2 = stopTime2 - startTime2;
		System.out.println("Test input n ="+1000000+":\nNumber of Operation of Quick Sort: "+t1+""
				+ "\nNumber ofOperation of Merge Sort: "+t2 );
		test  = new int[5000000];
		st.assignValue(test);
		testQ.reset();
		testM.reset();
		  startTime1 = System.currentTimeMillis();
			testQ.quickSort(test, 0, test.length-1);
			 stopTime1 = System.currentTimeMillis();
	         t1 = stopTime1 - startTime1;
	         startTime2 = System.currentTimeMillis();
			testM.mergeSort(test, 0, test.length-1);
			 stopTime2 = System.currentTimeMillis();
	         t2 = stopTime2 - startTime2;
		System.out.println("Test input n ="+5000000+":\nNumber of Operation of Quick Sort: "+t1+""
				+ "\nNumber ofOperation of Merge Sort: "+t2 );
		test  = new int[10000000];
		st.assignValue(test);
		testQ.reset();
		testM.reset();
		  startTime1 = System.currentTimeMillis();
			testQ.quickSort(test, 0, test.length-1);
			 stopTime1 = System.currentTimeMillis();
	         t1 = stopTime1 - startTime1;
	         startTime2 = System.currentTimeMillis();
			testM.mergeSort(test, 0, test.length-1);
			 stopTime2 = System.currentTimeMillis();
	         t2 = stopTime2 - startTime2;
		System.out.println("Test input n ="+10000000+":\nNumber of Operation of Quick Sort: "+t1+""
				+ "\nNumber ofOperation of Merge Sort: "+t2 );
		test  = new int[50000000];
		st.assignValue(test);
		testQ.reset();
		testM.reset();
		  startTime1 = System.currentTimeMillis();
			testQ.quickSort(test, 0, test.length-1);
			 stopTime1 = System.currentTimeMillis();
	         t1 = stopTime1 - startTime1;
	         startTime2 = System.currentTimeMillis();
			testM.mergeSort(test, 0, test.length-1);
			 stopTime2 = System.currentTimeMillis();
	         t2 = stopTime2 - startTime2;
		System.out.println("Test input n ="+50000000+":\nNumber of Operation of Quick Sort: "+t1+""
				+ "\nNumber ofOperation of Merge Sort: "+t2 );
		test  = new int[100000000];
		st.assignValue(test);
		testQ.reset();
		testM.reset();
		  startTime1 = System.currentTimeMillis();
			testQ.quickSort(test, 0, test.length-1);
			 stopTime1 = System.currentTimeMillis();
	         t1 = stopTime1 - startTime1;
	         startTime2 = System.currentTimeMillis();
			testM.mergeSort(test, 0, test.length-1);
			 stopTime2 = System.currentTimeMillis();
	         t2 = stopTime2 - startTime2;
		System.out.println("Test input n ="+100000000+":\nNumber of Operation of Quick Sort: "+t1+""
				+ "\nNumber ofOperation of Merge Sort: "+t2 );
		test  = new int[110000000];
		st.assignValue(test);
		testQ.reset();
		testM.reset();
		  startTime1 = System.currentTimeMillis();
			testQ.quickSort(test, 0, test.length-1);
			 stopTime1 = System.currentTimeMillis();
	         t1 = stopTime1 - startTime1;
	         startTime2 = System.currentTimeMillis();
			testM.mergeSort(test, 0, test.length-1);
			 stopTime2 = System.currentTimeMillis();
	         t2 = stopTime2 - startTime2;
		System.out.println("Test input n ="+110000000+":\nNumber of Operation of Quick Sort: "+t1+""
				+ "\nNumber ofOperation of Merge Sort: "+t2 );
		test  = new int[120000000];
		st.assignValue(test);
		testQ.reset();
		testM.reset();
		  startTime1 = System.currentTimeMillis();
			testQ.quickSort(test, 0, test.length-1);
			 stopTime1 = System.currentTimeMillis();
	         t1 = stopTime1 - startTime1;
	         startTime2 = System.currentTimeMillis();
			testM.mergeSort(test, 0, test.length-1);
			 stopTime2 = System.currentTimeMillis();
	         t2 = stopTime2 - startTime2;
		System.out.println("Test input n ="+120000000+":\nNumber of Operation of Quick Sort: "+t1+""
				+ "\nNumber ofOperation of Merge Sort: "+t2 );
		test  = new int[130000000];
		st.assignValue(test);
		testQ.reset();
		testM.reset();
		  startTime1 = System.currentTimeMillis();
			testQ.quickSort(test, 0, test.length-1);
			 stopTime1 = System.currentTimeMillis();
	         t1 = stopTime1 - startTime1;
	         startTime2 = System.currentTimeMillis();
			testM.mergeSort(test, 0, test.length-1);
			 stopTime2 = System.currentTimeMillis();
	         t2 = stopTime2 - startTime2;
		System.out.println("Test input n ="+130000000+":\nNumber of Operation of Quick Sort: "+t1+""
				+ "\nNumber ofOperation of Merge Sort: "+t2 );
		test  = new int[140000000];
		st.assignValue(test);
		testQ.reset();
		testM.reset();
		  startTime1 = System.currentTimeMillis();
			testQ.quickSort(test, 0, test.length-1);
			 stopTime1 = System.currentTimeMillis();
	         t1 = stopTime1 - startTime1;
	         startTime2 = System.currentTimeMillis();
			testM.mergeSort(test, 0, test.length-1);
			 stopTime2 = System.currentTimeMillis();
	         t2 = stopTime2 - startTime2;
		System.out.println("Test input n ="+140000000+":\nNumber of Operation of Quick Sort: "+t1+""
				+ "\nNumber ofOperation of Merge Sort: "+t2 );
		test  = new int[150000000];
		st.assignValue(test);
		testQ.reset();
		testM.reset();
		  startTime1 = System.currentTimeMillis();
			testQ.quickSort(test, 0, test.length-1);
			 stopTime1 = System.currentTimeMillis();
	         t1 = stopTime1 - startTime1;
	         startTime2 = System.currentTimeMillis();
			testM.mergeSort(test, 0, test.length-1);
			 stopTime2 = System.currentTimeMillis();
	         t2 = stopTime2 - startTime2;
		System.out.println("Test input n ="+150000000+":\nNumber of Operation of Quick Sort: "+t1+""
				+ "\nNumber ofOperation of Merge Sort: "+t2 );
		test  = new int[160000000];
		st.assignValue(test);
		testQ.reset();
		testM.reset();
		  startTime1 = System.currentTimeMillis();
			testQ.quickSort(test, 0, test.length-1);
			 stopTime1 = System.currentTimeMillis();
	         t1 = stopTime1 - startTime1;
	         startTime2 = System.currentTimeMillis();
			testM.mergeSort(test, 0, test.length-1);
			 stopTime2 = System.currentTimeMillis();
	         t2 = stopTime2 - startTime2;
		System.out.println("Test input n ="+160000000+":\nNumber of Operation of Quick Sort: "+t1+""
				+ "\nNumber ofOperation of Merge Sort: "+t2);
		
	}
	public void assignValue(int[]x){
		Random rd = new Random();
		for(int i =0;i<x.length;i++){
			x[i] = rd.nextInt(50000000)+1;
		}
	}

}
