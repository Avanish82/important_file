import java.io.File;
import java.io.IOException;

public class FileCreate {
	
	public static void main(String args[]) {
		
		File file= new File("D:\\fileDelete\\abc.text");
		try {
			if(file.createNewFile()) {
				System.out.println("File is created");
			}else {
				System.out.println("File is not created");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		 
		File f= new File("D:\\fileDelete");
		String s[]= f.list();
		for(String s1: s) {
//			final String extension = ".pdf";
//			if(extension==s1.trim()) {
			File f1= new File(f,s1);
			f1.delete();
			System.out.println("File is deleted="+s1);
//		}else
//			System.out.println("hi ddddddddddddd");
		}
	}

}
