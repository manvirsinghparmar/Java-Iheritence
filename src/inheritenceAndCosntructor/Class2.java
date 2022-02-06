package inheritenceAndCosntructor;

public class Class2 extends Class1 {
	
	String name="Thomas";

	public Class2() {
		super();
		System.out.println("This is class 2 Constructor");
	}

	public void printSomethingFromClass2() {
		System.out.println("This is class 2 methdo" + name);
	}

}
