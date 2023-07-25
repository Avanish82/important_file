
public class Split {
	
	public static void main(String args[])
    {
        String str = "geekss@for@geekss, kka, jlaj. kjaj, jlja";
        String[] arrOfStr = str.split(",");
 
        for (String a : arrOfStr)
            System.out.println(a);
    }
}


//first way to string split 
//String str = "geekss@for@geekss";
//String[] arrOfStr = str.split("@", 5);
//
//for (String a : arrOfStr)
//    System.out.println(a);
//}