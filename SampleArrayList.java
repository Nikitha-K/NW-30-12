package nikitha;
import java.util.ArrayList;
import java.util.Iterator;

public class SampleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list=new ArrayList();
		list.add(1426);
		list.add(123);
		list.add("deloitte");
		list.add(32.9788);
		list.add(null);
		System.out.println(list+" "+list.size());
		
		list.add("hyderabad");
		list.add(2,"java");
		list.add(7,"uot");
		System.out.println(list+" "+list.size());
		
		list.remove(new Integer(1426));
		System.out.println(list+""+list.size());
		Iterator itr=list.listIterator();
		while(itr.hasNext()){
			//System.out.println(itr.next());
	
			Object obj=itr.next();
			if(obj instanceof Integer)
				System.out.println(obj);
			
		}
			
		
		
	}

}
