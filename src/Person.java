public class Person {
	
	String name, address;
	
	
	//overload constructor
	Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	Person(String name) {
		this(name, null);
	}
	//end overload constructor
	void sayHello(String name) {
		System.out.println("Hello "+ name + ", My name is "+ this.name);
	}
}
