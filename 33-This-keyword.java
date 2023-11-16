/* ‘this’ reference in Java
    ============================
     * 
     * In Java, ‘this’ is a reference variable that refers to the current object, or can be said “this” in Java is a keyword that refers to the current object instance. 
     * 
     * It can be used to call current class methods and fields, to pass an instance of the current class as a parameter, and to differentiate between the local and instance variables.
     * 
     * Using ‘this’ reference can improve code readability and reduce naming conflicts.
     * 
     * Java this reference Example 
     * ===========================
     * 
     * In Java, this is a reference variable that refers to the current object on which the method or constructor is being invoked. It can be used to access instance variables and methods of the current object.
*/


// Java Program to implement
// Java this reference

// Driver Class
 class Person {

	// Fields Declared
	String name;
	int age;

	// Constructor
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	// Getter for name
	public String get_name() { 
        return name; 
    }

	// Setter for name
	public void change_name(String name){
		this.name = name;
	}

	// Method to Print the Details of
	// the person
	public void printDetails()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println();
	}

	// main function
	public static void main(String[] args)
	{
		// Objects Declared
		Person first = new Person("ABC", 18);
		Person second = new Person("XYZ", 22);

		first.printDetails();
		second.printDetails();

		first.change_name("PQR");
		System.out.println("Name has been changed to: "
						+ first.get_name());
	}
}

