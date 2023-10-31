import java.util.HashSet;
import java.util.Iterator;

class Demo6{
	HashSet<Integer>list1=new HashSet();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1004);
		Iterator g1=list1.iterator();
		while(g1.hasNext()) {
			System.out.println(g1.next());
		}
		System.out.println("your list of data is:"+list1);
		System.out.println("your list of data is:"+list1.size());
		System.out.println("your list of data is:"+list1.contains(1001));
//		System.out.println("your list of data is:"+list1.remove(1001));
//		System.out.println("your list of data is:"+list1.size());
		
	}


	}



public class hasNEXT {

	public static void main(String[] args) {
		Demo6 f1 = new Demo6();
		f1.get1();


	}

}
