package inheritenceAndCosntructor;

public class Class3 extends Class2 {

	public Class3() {
		super();
		System.out.println("This is class 3 Constructor");
	}
	
	public void printSomethingFromClass3() {
		System.out.println("This is class 3 methdo" + name);
	}
}
