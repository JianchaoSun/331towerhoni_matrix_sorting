import java.util.Scanner;

public class ClassicalMatraix {
	
	private static int[][]matrix;
	private static long count = 0;

	public static void main(String[] args){
	       test();
	}
	
	public static long getCount(){
		return count;
	}
	public static void test(){
		int[][]n = {{1,3,5},
				{2,5,2},
				{7,9,1},};
		int[][]m = {{6,3,1},
				{6,11,3},
				{19,2,1},};
		System.out.println("input matrix 1: ");
		printM(n);
		System.out.println("input matrix 2: ");
		printM(m);
		System.out.println("Calculation test(you can modify input maatrix in ClassicalMatraix class line 17): ");
		printM(doCalculation(n,n));
		Scanner s = new Scanner(System.in);
		System.out.println("Do you want to see time spend for different size of input 1 for yes, every other number for no ");
		int cho = s.nextInt();
		if(cho == 1){
		System.out.println("time spent of test: ");
		int[][]t1,t2;
		reset();
		for(int i=2;i<10000;i*=2){
			t1 = new int[i][i];
			t2 = new int[i][i];
			
			long startTime = System.currentTimeMillis();
	  		doCalculation(t1,t2);
	  		long stopTime = System.currentTimeMillis();
	        long elapsedTime = stopTime - startTime;
	  		System.out.println(i+ ": "+ elapsedTime);
		}
		}
	}
	public static void printM(int[][]m){
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[0].length;j++){
				System.out.print(m[i][j]+",");
			}
			System.out.println();
		}
	}
	public static void reset(){
		matrix = new int[0][0];
		count=0;
	}
	
	public static int[][] doCalculation(int[][]m1,int [][]m2){
		matrix = new int[m1.length][m1[0].length]; 
		for(int i=0;i<m1.length;i++){ //traversal through the every row of matrix
			for(int j =0;j< m1[0].length;j++){ //traversal through every column of matrix
				matrix[i][j] = m1[i][0]*m2[0][j]; //calculate the first one here to save n^2 time
				for(int k=1;k<m1.length;k++){ //do all the addition and multiplation for element at i,j in the matrix to return 
					matrix[i][j] = matrix[i][j] + m1[i][k]*m2[k][j];
					count++;
				}
			}
			
		}
		return matrix;
	}
	

}
