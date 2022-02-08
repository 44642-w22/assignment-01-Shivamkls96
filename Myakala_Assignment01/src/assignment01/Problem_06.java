package assignment01;
import java.util.*;

public class Problem_06 {
	
public static void main(String args[]) 
	{
		Stack<Integer> p = new Stack<Integer>();
		Scanner ms = new Scanner(System.in);
		System.out.println("Enter no of integers");
		int size = ms.nextInt();
	
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the element at index "+i);
			p.add(i, ms.nextInt());
		}
		System.out.println("Output(A): " +prob6(p));
}
	
	public static ArrayList<Integer> prob6(Stack<Integer> s)
	{
		ArrayList<Integer> b = new ArrayList<Integer>();
		int size= s.size();
		 
	for (int i=s.size()-1;i>=s.size()/2;i--)
	    {	
			 b.add(s.get(i));
		} 
		for (int i=0;i<s.size()/2;i++) 
		{
			b.add(s.get(i));			
		}
		 		
		return b;
	}
}
