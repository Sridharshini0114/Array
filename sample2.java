
import java.util.Scanner;
class demo1{
	int i,j,n,m;
	Scanner sc=new Scanner(System.in);
	int empid[][]=new int[2][2];
	void get1()
	{
		System.out.println("Enter the n and m value:");
		n=sc.nextInt();
		m=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println("Enter the array value is:");
				empid[i][j]=sc.nextInt();
			}
			
		}
	}
	void get2()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println("your array value is:"+empid[i][j]);
				
			}
		}
	}
	public class sample2{
		public static void main(String[] args) {
			demo1 f1=new demo1();
			f1.get1();
			f1.get2();
		}
	}
}


		
		
		
			
		
		
	




	