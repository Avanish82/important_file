import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SeperateCommaAndRemoveSpace {
	
public static void main(String args[]) {
			
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		String str=list.toString();
		System.out.println("String="+str);
		String st = str.replace(",","");
		System.out.println("St ="+st);
		String st1=str.replaceAll("\\]|\\[", "");
		System.out.println("St1 ="+st1);
		String st2 = st1.replace(",","");
		System.out.println("St2 ="+st2);
		String st3 = st2.replaceAll("\\s", "");
		System.out.println("St3 ="+st3);
		String st4=st1.replaceAll(",", ".");
		System.out.println("St4 ="+st4);
		String st5=st1.replaceAll(",", ";");
		System.out.println("St5 ="+st5);
		String st6 = st5.replaceAll("\\s", "");
		System.out.println("St6 ="+st6);
	
//		String listString = "";
//	
//		for (String s : list)
//		{
//		   listString += s + "\t";
//		    System.out.print(s+",");
//		}
//	     
//		System.out.println(listString);
		
   }

}
