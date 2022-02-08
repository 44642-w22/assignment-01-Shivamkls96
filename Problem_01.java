package assignment01;
import java.util.*;

public class Problem_01 {
	
public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner ms = new Scanner(System.in);
		System.out.println("Please enter no of elements in Linked list:");
		int size = ms.nextInt();
		 for(int x=0; x<size; x++)
		 {
			 System.out.println("Enter the element:");
			 list.add(x, ms.nextInt());
		 }
		
		 System.out.println("Output(L2): " +prob1(list));
		
	}
		
		
	public static LinkedList<Integer> prob1(LinkedList<Integer> list1) {
		
		LinkedList<Integer> list2 = new LinkedList<>();
		
		for (Integer num : list1) {
			
			int j,sum=0;
			
			for (j=1;j<=num/2;j++) {
				if(num%j==0)
				{
					sum=sum+j;
				}
			}
			
			if(sum==num)
			{
				list2.add(num);
			}
			}
		return list2;
			
			}
}
