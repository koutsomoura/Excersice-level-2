import java.*;
import java.util.ArrayList;

public class Excersice1 {
	static int num;
	static String seq;

	
	public static void repeat () {
		 num=buffer.getInteger();
		 seq=buffer.getString();
	}
	
	
	
 	public static void main(String []args) {
 		System.out.println("Hello");
 		repeat();
 		ArrayList <Character> 	list=new ArrayList <Character> ();
 		list.add(seq.charAt(0));
 			for (int i=1;i<seq.length();i++) {
 				if (seq.charAt(i)!=seq.charAt(i-1) && !(list.contains(seq.charAt(i)))) {
	 				list.add(seq.charAt(i));
	 				
 				}	
 				
	 		}
 		System.out.println(list);
 		int j=0;
 		int k=0;
 		if(num<=list.size()) {
	 		while(j<list.size()-1 && k<=(num-1)) {
	 			System.out.println("Yes");
	 			for (int i=0;i<seq.length();i++) {
	 				
	 				if(seq.charAt(i)!=list.get(j) && k<=((num-1))) {
	 					j++;
	 					k++;	 					
	 					System.out.print("\n");	
	 				}
					System.out.print(seq.charAt(i));
	 			}
	 		}
 		}
 		else {
 		System.out.println("NO");
 		}
 	}
}
