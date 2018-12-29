import java.util.Scanner;

import Sorting.MergeSort;
import Sorting.QuickSort;
import Sorting.SortingTest;
import TowerOfHanoi.TowerOfHanoi;
import TowerOfHanoi.TowerTest;

public class Test {
	private SortingTest sortTest;
	private TowerTest towerTest;
	public static void main(String[] args){
		run();
	}

	
	
	
	public static void run(){
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
		System.out.print("Which test do you want to run?(inter number) \n1.Quick Sort"
				+ "\n2.Merge Sort\n3.Compare Quick and Merge Sort growth rate(input size up to 1.5*10^8)\n4.Tower Test"
				+ "\n5.Traditional Matrix Test\n6.Strassen's Matrix"
				+ "\n7.quit\n");
		choice = sc.nextInt();
		if(choice == 1){
			
			System.out.println("You can modify the run method in Test class (line 31) to change your input array");
			QuickSort q =new QuickSort();
			int[]tempTest={3,5,1,3,12,7,19,221,100,3,13,32,23,11,94,20}; //change array here
	    	
	    	System.out.println("Origin list:");
	    	
	    	for(int i=0;i<tempTest.length;i++){
			     System.out.print(tempTest[i]+",");
			  }
		    q.quickSort(tempTest, 0, tempTest.length-1);
		    System.out.println("\nAfter quick sorting: ");
		    
		    for(int i=0;i<tempTest.length;i++){
		         System.out.print(tempTest[i]+",");
		      }
		  
		    System.out.println("\nNumber of Operation: "+q.getNumberOfInst());
			
		}
		else if(choice == 2){
			
			System.out.println("You can modify the run method in Test class (line 52) to change your input array");
			MergeSort m =new MergeSort();
	    	int[]tempTest={3,5,1,3,12,7,19,221,100,3,13,32,23,11,94,20}; //change array here
	    	
	    	System.out.println("Origin list:");
	    	
	    	for(int i=0;i<tempTest.length;i++){
			     System.out.print(tempTest[i]+",");
			  }
		    m.mergeSort(tempTest, 0, tempTest.length-1);
		    System.out.println("\nAfter merge sorting: ");
		    
		    for(int i=0;i<tempTest.length;i++){
		         System.out.print(tempTest[i]+",");
		      }
		  
		    System.out.println("\nNumber of Operation: "+m.getNumberOfInst());
			
		}
		else if(choice == 3){
			System.out.println("Might take 1 to 2 minutes to run");
			SortingTest st = new SortingTest();
			st.Run();
			
		}
		else if(choice == 4){
			TowerTest t = new TowerTest();
			t.run();
			Scanner scn =new Scanner(System.in);
			System.out.println("Do you want to see step by step process? Enter -1 for No, other number for the input size");
			int choice1 =scn.nextInt();
			if(choice1 == -1){
				
			}else{
				TowerOfHanoi to = new TowerOfHanoi(choice1);
				to.set(choice1);
				to.solve(choice1, 1, 2, 3);
			}
		}
		else if(choice == 5){
			ClassicalMatraix.test();
			
		}else if(choice  == 6){
			StrassenMethod.test();
		}
		
		}while(choice!=7);
	}
}
