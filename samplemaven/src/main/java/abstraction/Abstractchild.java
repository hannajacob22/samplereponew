package abstraction;

public class Abstractchild extends Abstractionparent{
	
	public static void main(String args[])
	{
	Abstractchild obj=new Abstractchild();
	obj.display();
	obj.add();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
	
	int sum=5+4;
	System.out.println(sum);
	
		
		
	}
	
	

}
