//Q6. Reading Data from File and writing to Standard Output Device?
package November_12_2016;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class FileHandlingExam
{
	public static void main(String[] args) throws Exception
	//throws is used for exception, file inputstream tends to have errors
	{
		String name = "Hello Java Students....";
		FileOutputStream fout = new FileOutputStream("/Users/saurabhjawa/Desktop/NIITJAVA/Test.doc");
				byte b[] = name.getBytes();
		fout.write(b);
		
		int i =0;
		FileInputStream fin = new FileInputStream("/Users/saurabhjawa/Desktop/NIITJAVA/Test.doc");
		
		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
		}	
	}
}
