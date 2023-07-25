import java.io.File;

public class FileDelete {
	
	public static void main(String args[]) {
		
		File f= new File("D:\\fileDelete");
		String s[]= f.list();
		for(String s1: s) {
			File f1= new File(f,s1);
			f1.delete();
			System.out.println(s1);
		}
	}

}
