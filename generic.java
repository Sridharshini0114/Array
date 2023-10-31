class sampleDemo{
	public <M> M test (M m)
	{
		return m;
		
	}
}
public class generic {

	public static void main(String[] args) {
		sampleDemo f1=new sampleDemo();
		System.out.println(f1.test("Sri"));
		System.out.println(f1.test(200));
		System.out.println(f1.test(4.5));
	

	}

}
