package streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File Copying to new file
		try{
			FileInputStream fis = new FileInputStream("D:\\Sample\\Resume");
			FileOutputStream fos = new FileOutputStream("D:\\Sample\\FileCopy");
			int x;
			while((x=fis.read())!=-1){
				
				System.out.println(" ");
				fos.write(x);
			}
				
			System.out.println("Successfully copied");
			
			fis.close();
			fos.close();
				
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
