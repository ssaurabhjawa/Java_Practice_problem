
package November_12_2016;

import java.io.FileOutputStream;
import java.io.FileInputStream;

public class ReadInputWriteOutput {

	public static void main(String[] args) throws Exception
	//throws is used for exception, file inputstream tends to have errors
	{
		int i =0;
		FileInputStream fin = new FileInputStream("/Users/saurabhjawa/Desktop/NIITJAVA/Test.doc");
		
		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
		}
	
		String name = "Hello Java Students....";
		FileOutputStream fout = new FileOutputStream("/Users/saurabhjawa/Desktop/NIITJAVA/Test.doc");
				byte b[] = name.getBytes();
		fout.write(b);
		
	}
}
