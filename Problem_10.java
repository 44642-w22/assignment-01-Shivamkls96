package assignment01;
import java.util.*;

public class Problem_10 {
static String val = ""; 
	
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of elements in deque");
		int size=keyboard.nextInt();
	    Deque<String> d1 = new ArrayDeque<String>();

		for (int a=0;a<size;a++)
		{
			System.out.println("Enter element"+a+" to Deque");
			d1.add(keyboard.next());
		}
		
		System.out.println("Enter the number of elements in Array");
		int size2=keyboard.nextInt();
		
		int[] ia = new int[size2];
		
		//Providing input for Array
		for (int i=0;i<size2;i++)
		{
			ia[i]=keyboard.nextInt();
		}
		
		for (Integer p : ia) {
			prob10(p,d1);
		}

		String res = "";
		
		for (String string : d1) {
			res+=string;
		}
		
		System.out.println("\""+res+"\"");	
		
	}
	
	public static void prob10(int p, Deque<String> d1) {
		
		if(p == 1) {
			val = d1.poll();
		}else {
			
			if(val!="") {
				d1.addFirst(val);
				val="";
			}
		}
		
	}
}
