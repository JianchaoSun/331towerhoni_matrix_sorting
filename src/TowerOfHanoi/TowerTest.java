package TowerOfHanoi;
//2^n times, everytime redo the previous step twice,
 
public class TowerTest {
	public static void main(String[] args){
		
		run();
	}
	
	public static void run(){
		
		long test[] = new long[35]; //stop when it reach 35,or it too large to handle
		TowerOfHanoi tower = new TowerOfHanoi(-1);
		
		for(int i =2;i<=40;i*=2){
			
		    integer temp =new integer(i); //prevent stackoverflow problem when enter reference variable to recursion call
		    tower.set(temp.getInt());
		    long startTime = System.currentTimeMillis();
		    tower.solve(temp.getInt(), 1, 2, 3);
		    long stopTime = System.currentTimeMillis();
	        long elapsedTime = stopTime - startTime;
		    System.out.println("input size"+i+" step used: "+tower.getCount()+","+ " time in timemills used "+elapsedTime); 
		    test[i] = tower.getCount();
		
		}
	}

}
class integer{ //inner class to prevent stackoverflow problem
	int x;
	public integer(int n){
		x=n;
	}
	public int getInt(){
		return x;
	}
}
