import java.util.HashSet;

class Demo5{
	HashSet<Integer>list1=new HashSet();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1004);
		System.out.println("your list of data is:"+list1);
		System.out.println("your list of data is:"+list1.size());
		System.out.println("your list of data is:"+list1.contains(1001));
//		System.out.println("your list of data is:"+list1.remove(1001));
//		System.out.println("your list of data is:"+list1.size());
		
	}
}
public class sample9 {

	public static void main(String[] args) {
		Demo5 f1 = new Demo5();
		f1.get1();


	}

}
