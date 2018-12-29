import java.util.Random;
import java.util.Scanner;
public class StrassenMethod {
	  int[][]matrix;
	  private static long count =0;
	  public static void main(String[] args) {
	      test();
	    }
	  
	  

	  public static void test(){
	  	int[][]n = {{1,3,5},
	  			{2,5,2},
	  			{7,9,1},};
	  	int[][]m = {{6,3,1},
	  			{6,11,3},
	  			{19,2,1},};
	  	System.out.println("input matrix 1: ");
	  	print(n);
	  	System.out.println("input matrix 2: ");
	  	print(m);
	  	System.out.println("Calculation test(you can modify input maatrix in StrassenMatraix class line 32): ");
	  	print(strassenMatrix(n,n));
		Scanner s = new Scanner(System.in);
		System.out.println("Do you want to see time spend for different size of input 1 for yes, every other number for no ");
		int cho = s.nextInt();
		if(cho == 1){
	  	System.out.println("Time used for test: ");
	  	int[][]t1,t2;
	  	for(int i=2;i<10000;i*=2){
	  		t1 = new int[i][i];
	  		t2 = new int[i][i];
	  		//just test matrix with different size, every time i = i*2;
	  		long startTime = System.currentTimeMillis();
	  		strassenMatrix(t1,t2);
	  		long stopTime = System.currentTimeMillis();
	        long elapsedTime = stopTime - startTime;
	  		System.out.println(i+ ": "+ elapsedTime);
	  	}
		}
	  }
	  
	   public static void print(int [][] array)
		{
			int n = array.length;

			System.out.println();
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++)
				{
					//first loop traversal row, second loop traversal column, the  print every element of matrix
					System.out.print(array[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	
	   public static int [][] strassenMatrix(int [][] a, int [][] b)
		{
			int n = a.length;
			int [][] result = new int[n][n];

			if((n%2 != 0 ) && (n !=1)) //check if the row and column of array is odd number and greater than 1
			{  //do following if column and row is odd and not 1 
				int[][] a1, b1, c1;
				int n1 = n+1;
				a1 = new int[n1][n1]; //both a1 and b1 are just temp matrix hold value of input matrix 
				b1 = new int[n1][n1];
				c1 = new int[n1][n1]; //store the result after strassen method of a1 and b1 into c

				for(int i=0; i<n; i++)
					for(int j=0; j<n; j++)
					{//just copy a to a1, b to b1
						a1[i][j] =a[i][j];
						b1[i][j] =b[i][j];
					}
				c1 = strassenMatrix(a1, b1);// use recurrence call to calculate a1 and b1 and store answer in c1
				
				for(int i=0; i<n; i++)
					for(int j=0; j<n; j++)
						//after calculation, copy result from temp c1 array to origin matrix
						result[i][j] =c1[i][j];
				return result;
			}

			if(n == 1)
			{ //when n(number of both column and row) reach 1,just do a sample calculation
				result[0][0] = a[0][0] * b[0][0];
			}else if(n == 8){
				//I add this method to increase the speed of strassen method, 
				//the reason for doing this is prevent the calculation run into very edge case,
				//for example, if the i still recursively use strassen method when n=2, it will require a lot more 
				//calculation than using the classical way.
				int[][]temp = new int[n][n];
				temp = doCalculation(a,b);
				for(int i=0; i<n; i++)
					for(int j=0; j<n; j++)
						result[i][j] =temp[i][j];
				return result;
			}
			else
			{
				int [][] A11 = new int[n/2][n/2]; 
				int [][] A12 = new int[n/2][n/2];
				int [][] A21 = new int[n/2][n/2];
				int [][] A22 = new int[n/2][n/2];
                //those 8 step just create 4 smaller matrix for both matrix a and matrix b with the size of 1/4 of origin matrix
				int [][] B11 = new int[n/2][n/2];
				int [][] B12 = new int[n/2][n/2];
				int [][] B21 = new int[n/2][n/2];
				int [][] B22 = new int[n/2][n/2];

				divide(a, A11, 0 , 0);
				divide(a, A12, 0 , n/2);
				divide(a, A21, n/2, 0);
				divide(a, A22, n/2, n/2);
                //those 8 step just assign values from old a,b matrix to 8 new smaller matrix, detail comments in divide method
				divide(b, B11, 0 , 0);
				divide(b, B12, 0 , n/2);
				divide(b, B21, n/2, 0);
				divide(b, B22, n/2, n/2);

				int [][] P = strassenMatrix(matrixAddition(A11, A22), matrixAddition(B11, B22));
				int [][] Q = strassenMatrix(matrixAddition(A21, A22), B11);
				int [][] R = strassenMatrix(A11, matrixSub(B12, B22));  
				int [][] S = strassenMatrix(A22, matrixSub(B21, B11));
				int [][] T = strassenMatrix(matrixAddition(A11, A12), B22);
				int [][] U = strassenMatrix(matrixSub(A21, A11), matrixAddition(B11, B12));
				int [][] V = strassenMatrix(matrixSub(A12, A22), matrixAddition(B21, B22));
                //those 11 operations are just the basic algorithm of strassen method
				//every sub,add method are defined later,for multiplication, just use strassen method
				int [][] C11 = matrixAddition(matrixSub(matrixAddition(P, S), T), V);
				int [][] C12 = matrixAddition(R, T);
				int [][] C21 = matrixAddition(Q, S);
				int [][] C22 = matrixAddition(matrixSub(matrixAddition(P, R), Q), U);

				//following 4 steps just copy the array thats done with calculation back to origin array
				copy(C11, result, 0 , 0);  
				copy(C12, result, 0 , n/2);
				copy(C21, result, n/2, 0);
				copy(C22, result, n/2, n/2);
			}
			return result;
		}
	   public static int[][] doCalculation(int[][]m1,int [][]m2){
			int[][]matrix = new int[m1.length][m1[0].length]; 
			for(int i=0;i<m1.length;i++){ //traversal through the every row of matrix
				for(int j =0;j< m1[0].length;j++){ //traversal through every column of matrix
					matrix[i][j] = m1[i][0]*m2[0][j]; 
					for(int k=1;k<m1.length;k++){ //
						matrix[i][j] = matrix[i][j] + m1[i][k]*m2[k][j];
						count++;
					}
				}
			}
			return matrix;
		}
	
	public static void divide(int[][] p1, int[][] c1, int beg, int end){
		for(int i1 = 0, i2=beg; i1<c1.length; i1++, i2++)
			for(int j1 = 0, j2=end; j1<c1.length; j1++, j2++)//keep 2 pointer every time, 1 points to old matrix, 1 points tp new matrix
			{
				//just use 2 for loop to traversal one of section of old matrix p1 from beg to end 
				//and the copy it to new smaller matrix
				c1[i1][j1] = p1[i2][j2];
			}
	}

	public static void copy(int[][] c1, int[][] p1, int iB, int jB){
		for(int i1 = 0, i2=iB; i1<c1.length; i1++, i2++)
			for(int j1 = 0, j2=jB; j1<c1.length; j1++, j2++)
			{
				//same with divide, keep 2 pointer in each loop,1 for origin, 1 for smaller matrix
				//, copy from smaller matrix back to origin matrix
				p1[i2][j2] = c1[i1][j1];
			}
	}
	
	public static int[][]matrixSub(int[][]m1,int[][]m2){
		int[][]toR = new int[m1.length][m1[0].length];
		for(int i = 0;i<m1.length;i++){
			for(int j=0;j<m1[0].length;j++){
				//basic matrix sub method, loop through 2 matrix, and sub them, store answer in a new matrix
				toR[i][j] = m1[i][j] - m2[i][j];
				
			}
		}
		return toR;
	}
	
	public static int[][] matrixAddition(int[][]m1,int[][]m2){
		//basic matrix addition, traversal every elements in 2 matrix, add every element and store in new matrix
		int[][]toR = new int[m1.length][m1[0].length];
		for(int i = 0;i<m1.length;i++){
			for(int j=0;j<m1[0].length;j++){
				toR[i][j] = m1[i][j]+m2[i][j];

			}
		}
		return toR;
	}
	

}
