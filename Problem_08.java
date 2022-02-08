package assignment01;
import java.util.*;

public class Problem_08 {
	
public static void main(String[] args) {
		
		Queue<Integer> k = new LinkedList<Integer>();
		Scanner ms = new Scanner(System.in);
		System.out.println("Enter no of integers");
		int size = ms.nextInt();
		
		for (int i=0; i<size;i++)
		{
			System.out.println("Enter the number");
			k.add(ms.nextInt());
		}
		
		System.out.println("Output(A): " +prob8(k));
		
	}

	public static ArrayList<Integer> prob8 (Queue<Integer> a)
	
	{
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		int x = a.size();
		int a1[] = new int[x];	
		for(int l=0;l<x;l++)
		{
			a1[l]=a.poll();
		}

		if(x%2==0)
		{
		
		for (int i=0,j=x/2+1;i<x/2;i++,j--)
		{
			
			if (j<=x/2-1) 
				break;	
			    b.add(a1[j]);	
				b.add(a1[i]);			
		}	
		}
		
		else 
		{
			for (int i=0,j=x/2+1;i<x/2;i++,j--)
			{
				
				if (j<=x/2-1) 
					break;
				    b.add(a1[j]);	
					b.add(a1[i]);				
			}
			b.add(a1[x/2]);
		}
		return b;
		}
}
