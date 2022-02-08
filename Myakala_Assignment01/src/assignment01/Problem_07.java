package assignment01;
import java.util.*;

public class Problem_07 {
	public static void main(String args[]) 
	{
		Queue<Integer> k = new LinkedList<Integer>();
		Scanner ms = new Scanner(System.in);
		System.out.println("Enter no of elements");
	    int size = ms.nextInt();
	    
	   for ( int i=0; i<size;i++)
	    	
	    {
	    	System.out.println("Enter the element to queue");
	    	k.add(ms.nextInt());
	    }

	    System.out.println("Output: " +prob7(k));
	}

	public static int prob7(Queue<Integer> a)
	{
		int number =0;
		int size = a.size();
		for (int i=size-1;i>=0;i--)
		{
			number = (int) (number + a.poll()* Math.pow(2, i));
		}
		return number;
	}
}
