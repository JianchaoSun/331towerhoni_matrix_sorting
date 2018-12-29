package TowerOfHanoi;

public class TowerOfHanoi {
	   
        private int dec=-1;
   	    private int[] tower;
	    private long count; //to count the number of steps
	    
	    public TowerOfHanoi(int dec1){
	    	dec = dec1;
	    }
	    
	    public long getCount(){
	    	return count;
	    }
	    
	    public void set(int x){ //separate this from solve class
	        tower = new int[]{0,x,0,0}; //start from second element of array, so its easier to visualize the disk
	        count = 0; 
	    }
	    
	    public void move(int x, int y){
	        tower[x]--; //after moving,remove top from the origin plate, and add to new plate
	        tower[y]++;
	        count++; //record step used
	        if(dec !=-1){
	        System.out.println("From tower "+x+" to tower "+y); }//to see how to move each steps
	    }
	    
	    public void solve(int num, int begin, int mid, int end){
	        if (num == 2){
	            move(begin, mid); //when n reach 2, do the basic operation,
	            //move from beginning to middle, beginning to last,lastly
	            //move middle to end
	            move(begin, end);
	            move(mid, end);
	            
	        } else {
	            solve(num-1, begin, end, mid);  //only act when number reach basic step 2.
	            move(begin, end); //another basic step,repeat same step every time when recursion reach here. 
	            solve(num-1, mid, begin, end);
	          
	        }
	    }
}
