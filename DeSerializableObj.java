
//program to illustrate Object De-Serialization

package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializableObj {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try{
			fis = new FileInputStream("D:\\Sample\\Customer");
			ois = new ObjectInputStream(fis);
			
			Object obj;
			while((obj = ois.readObject())!=null){
				
				Customer cust = (Customer) obj;
				System.out.println(cust.getCustid()+" "+cust.getComm()+" "+cust.getCustname());
				
			}
			
		}
		catch(IOException | ClassNotFoundException e){
			e.printStackTrace();
		}
		
		try{
			ois.close();
			fis.close();
			System.out.println("Done");
			
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
