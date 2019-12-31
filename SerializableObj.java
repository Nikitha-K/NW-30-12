
//program to illustrate Object Serialization

package streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileOutputStream fos;
		try{
			fos = new FileOutputStream("D:\\Sample\\Customer");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Customer customer1 = new Customer(1021,"Deloitte",767678);
			Customer customer2 = new Customer(1022,"Infosys",521422);
			Customer customer3 = new Customer(1023,"TCS",13524);
			Customer customer4 = new Customer(1024,"Dell",12378);
			
			oos.writeObject(customer1);
			oos.writeObject(customer2);
			oos.writeObject(customer3);
			oos.writeObject(customer4);
			
			oos.close();
			fos.close();
								
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		
	}
}
