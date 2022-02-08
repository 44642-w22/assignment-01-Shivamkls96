package assignment01;
import java.util.*;

public class Problem_02 {
	
public static void main(String args[]) {
		
		Scanner ms= new Scanner(System.in);
		LinkedList<Integer> c = new LinkedList<>();
		System.out.println("Enter k");
		int k= ms.nextInt();
		System.out.println("Enter no of input elements");
		int size=ms.nextInt();
		for (int a=0;a<size;a++) {
			System.out.println("Enter element");
			c.add(ms.nextInt());
		}	
		System.out.println("Output (L2) : " +prob2(c,k));
	} 
	
public static LinkedList<ArrayList> prob2(LinkedList<Integer> p, int k){
		
	LinkedList<ArrayList> outputList = new LinkedList<>();
		
		for (int y=0;y<p.size()-1;y++) {
			ArrayList<Integer> q = new ArrayList<>();
			
				int a = p.get(y);
				int b = p.get(y+1);
				if((a+b)==k)
				{
					q.add(a);
					q.add(b);
				}
				
			
			if(q.size()!=0) {
				outputList.add(q);
			}

		}
					
		return outputList;
		
	} 
}
