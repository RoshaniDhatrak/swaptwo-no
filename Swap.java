
public class Swap {
	int no1=10 ,no2=20;
	 
	
	void swap1()
	{
		
		no1 = no1 + no2;
		no2 = no1 - no2;
        no1 = no1 - no2;
        System.out.println("After swaping:"
                           + " no1 = " + no1 + ", no2 = " + no2);
	}
	
	void swap2()
	{
		
		no1 = no1 * no2;
		no2 = no1 / no2;
        no1 = no1 / no2;
        System.out.println("After swaping:"
                           + " no1 = " + no1 + ", no2 = " + no2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap s =new Swap();
		//s.swap1();
		s.swap2(); 
	
	}

}
