
import java.util.Scanner;
class demo5{
	int index;
    int[] empid= {1001,1002,1003,1004};
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.print("Enter the index:");
		int index=sc.nextInt();
		if(index>=0 && index<empid.length) {
			System.out.println("your  empid is:"+empid[index]);
			
		}
		else {
			System.out.println("Your empid is not available");
		}

	}


}

public class Sample5 {

	public static void main(String[] args) {
		demo5 d1=new demo5();
		d1.get1();
		

	}

}
