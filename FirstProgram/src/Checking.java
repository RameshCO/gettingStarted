


interface One{
	
	String getname();
	
}

abstract class Two implements One{
	
	public Two(String name,String age){
		System.out.println(name+""+age);
	}
	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class Checking extends Two implements One{

	public Checking(String name, String age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	static{
	System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checking c = new Checking("RameshMalla", "18");
		System.out.println("DUDE");
	}

	

}
