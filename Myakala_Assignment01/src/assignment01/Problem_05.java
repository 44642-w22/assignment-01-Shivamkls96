package assignment01;
import java.util.*;

public class Problem_05 {

	public static void main(String args[]) 
	{
		String str1 = new String();
		Scanner ms = new Scanner(System.in);
		System.out.println("Enter expression:");
		str1=ms.nextLine();
		System.out.println("Output: " +prob5(str1));	
    }
	
	public static boolean prob5 (String p) {
		
		 if ((p.length() % 2) == 1) return false;
		  else {
		    Stack<Character> t = new Stack<>();
		    for (char z : p.toCharArray())
		      switch (z) {
		        case '{': t.push('}'); break;
		        case '(': t.push(')'); break;
		        case '[': t.push(']'); break;
		        default :
		          if (t.isEmpty() || z != t.peek()) { return false;}
		          t.pop();
		      }
		    return t.isEmpty();
		  }
		}
}
