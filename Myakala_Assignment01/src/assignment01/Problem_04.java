package assignment01;
import java.util.*;

public class Problem_04 {
	
	public static void main(String args[])
	{
		Scanner ms = new Scanner(System.in);
		ArrayList<String> k = new ArrayList<>();
		
		System.out.println("Enter no of strings");
		int size=ms.nextInt();
		for (int i=0;i<size;i++) {
			System.out.println("Enter the string at index "+i);
			k.add(ms.next());
		}	
		
		System.out.println("Output (A2)" + prob4(k)); 
		
	}
	
public static ArrayList<String> prob4(ArrayList<String> p){
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for (String i : p) 
		{
			l.add(i.length());				
		}
		
		int min=l.get(0);
		
		for (int x=0;x<l.size();x++) 
		{	
			for(int j=0;j<l.size();j++)
			{
			if (l.get(x)<l.get(j)) 
			  {	
				String r = p.get(x);
				p.set(x,p.get(j));
				p.set(j,r);
				int t = l.get(x);
				l.set(x,l.get(j));
				l.set(j,t);
			  }
			}
		}	
		return p;	
	}
}
