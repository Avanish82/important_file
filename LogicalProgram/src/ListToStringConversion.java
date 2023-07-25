import java.util.ArrayList;
import java.util.List;

public class ListToStringConversion {
	
	public static void main(String args[]) {
	
//	ArrayList<String> list = new ArrayList<String>();
//	list.add("one");
//	list.add("two");
//	list.add("three");
//
//	String listString = "";
//
//	for (String s : list)
//	{
//	   // listString += s + "\t";
//	    System.out.print(s+",");
//	}
//     
//	System.out.println(listString);
//	
//	}
//second way
	
	ArrayList<String> list = new ArrayList<String>();
	list.add("one");
	list.add("two");
	list.add("three");
 
	StringBuilder sb = new StringBuilder();
	for (String s : list)
	{
	    sb.append(s);
	    sb.append(",");
	}

	System.out.println(sb.toString());
    }
}
