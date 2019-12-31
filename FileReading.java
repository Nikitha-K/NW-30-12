//program to demonstrate the FileReading operation

package streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = new FileInputStream("D:\\Sample\\Resume");
			int x;
			while((x=fis.read())!=-1)
				System.out.println((char)x +" -ASCII value is "+(int)x);
			fis.close();
				
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
