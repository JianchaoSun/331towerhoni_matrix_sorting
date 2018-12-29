import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class fractionalKnapsack {
	private double gain;
	private double size;
	private List<obj>stealList;
	
	public static void main(String[] args) throws FileNotFoundException{
		fractionalKnapsack fk =new fractionalKnapsack(3);
		fk.readFile("");
		fk.sort();
		fk.put();
		fk.getPrice();
	}
	
	public fractionalKnapsack(double s){
		size = s;
		stealList = new ArrayList<obj>();
	}
	
	public void calculateMax(double si,double sack) throws FileNotFoundException{
		size = si;
		fractionalKnapsack fk =new fractionalKnapsack(sack);
		fk.readFile("");
		fk.sort();
		fk.put();
		System.out.println("The maximum profit is" +fk.getPrice());
	}
	
	public double getPrice(){
		System.out.println(gain);
		return gain;
	}
	
	public void put(){
		for(int i=0;i<stealList.size();i++){
			if(stealList.get(i).weight<size){
				gain += stealList.get(i).price;
				size = size-stealList.get(i).weight;
			}else{
				gain += stealList.get(i).price*(size/stealList.get(i).weight);
				i=stealList.size();
			}
		}
	}
	
	public void sort(){
		Collections.sort(stealList);
		
		for(obj x: stealList){
			System.out.println(x.ratio);
		}
	}
	
	public void readFile(String fil) throws FileNotFoundException{
		Scanner scanner = new Scanner(new FileReader("C:\\Users\\clark\\Desktop\\3310.txt")); //path is changeable
		  try
		  {
		    while( scanner.hasNext() )
		    {
		    	int price = 0;
		        int weight = 0;       	
		        price = scanner.nextInt(); 
		        weight = scanner.nextInt();
		        stealList.add(new obj(price,weight));
		    }
		  } finally
		  {
			    scanner.close();
			  }
	}
	
	public class obj implements Comparable<obj>{
		double weight;
		double price;
		double ratio;
		public obj(double p, double w){
			price = p;
			weight = w;
			ratio = p/w;
		}
		public int compareTo(obj o) {
			return (int) (o.ratio-ratio);
		}
		
	}
}
