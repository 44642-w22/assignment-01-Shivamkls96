package assignment01;
import java.util.*;

public class Problem_03 {
	
 public static void main(String args[]) {
		
		ArrayList<Integer> k = new ArrayList<>();
		Scanner ms = new Scanner (System.in);
		System.out.println("Enter numbers");
		int size=ms.nextInt(); 
		for (int i=0;i<size;i++) {
			System.out.println("Enter number");
			k.add(ms.nextInt());
		}
		
		System.out.println("Output: " +prob3(k));
		
	} 
	
	public static Integer prob3(ArrayList<Integer> p)
	{
		int y;
		
		if(p.size()!=0)
		{
			Collections.sort(p);
			y= p.get(p.size()-1);
		}
		else 
		{
			y=Integer.MIN_VALUE;	
		}
		
		return y;		
	}
}
