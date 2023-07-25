 import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListToListStore {
	
	public static void main(String args[]) {
		
		List<String> lt=new ArrayList<>();
		lt.add("Avanish");
		lt.add("kumar");
		lt.add("Singh");
		System.out.println(lt);
		
		//List to LinkList data store 
		LinkedList<String> ll=new LinkedList<>();
		for(String st: lt) {
			//System.out.println(st);
			ll.add(st);
		}
		 System.out.println(ll);
	}

}
