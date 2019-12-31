//program to demonstrate the FileWriting operation

//package nikitha;
package streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		try{
			FileOutputStream fos = new FileOutputStream("D:\\Sample\\Resume");
			//output stream outputs as a new file
			for(int i=65;i<151;i++)
				fos.write(i);
			fos.close();
			System.out.println("Successfully written");
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
	}

}
