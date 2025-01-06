package accessmodifiers;

public class Accessmodifiersexample1 {
	
	public void display1() {
		
		System.out.println("Public");
		
	}
   private  void display2() {
		
		System.out.println("Private");
		
	}
  protected void display3() {
	
	System.out.println("Protected");
	
}
  void display4() {
	
	System.out.println("Default");
	
}
	public static void main(String[] args) {
		
		Accessmodifiersexample1  obj1=new Accessmodifiersexample1() ;
		obj1.display1();
		obj1.display2();
		obj1.display3();
		obj1.display4();

	}

}
