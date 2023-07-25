import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

 

/*
 * public String[] list(FilenameFilter filter)
 *
 * Parameters:
 * ----------
 *
 * filter - A filename filter
 *
 * How to use FilenameFilter to list out all files that
 * are end with “.txt” extension in folder “D:/work“,
 * and then delete it.
 */

public class FileDemo
{

    public static void main(String[] args)
    {
        FileDemo fileDemo = new FileDemo();
//        fileDemo.deleteFiles("D:/fileDelete", ".pdf");
        fileDemo.deleteFiles("D:\\fileDelete", ".pdf");
        
        File file= new File("D:\\fileDelete\\abc.pdf");
		try {
			if(file.createNewFile()) {
				System.out.println("File is created");
			}else {
				System.out.println("File is not created");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
    }

    public void deleteFiles(String dirName, String fileExtension)
    {
        File fileDir = new File(dirName);

        ExtensionFilter extFilter = new ExtensionFilter(fileExtension);

        /*
         * Returns an array of strings naming the files and
         * directories in the directory denoted by this
         * abstract pathname that satisfy the specified
         * filter.
         */
        String[] listOfFileNames = fileDir.list(extFilter);

        if (listOfFileNames.length == 0)
        {
            System.out.println("no files end with : " + fileExtension);
            return;
        }

        List<String> lt=new ArrayList<>();
        String str=lt.toString();
        String st1=str.replaceAll("\\]|\\[", "");
        for (String fileName : listOfFileNames)
        {
        	lt.add(fileName);
            String filePath = new StringBuilder(dirName)
                    .append(File.separator).append(fileName).toString();
            File file = new File(filePath);
            boolean isDeleted = file.delete();
            // isDeleted = st1.delete();
            System.out.println(file.getAbsolutePath() + " isDeleted = "
                    + isDeleted);
        }

    }
     

}