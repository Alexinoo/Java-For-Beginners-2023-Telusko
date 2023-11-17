/* Anonymous Object in Java
   =============================
 * 
 * In Java, an anonymous object is an object that is created without giving it a name. Anonymous objects are often used to create objects on the fly and pass them as arguments to methods.
 * 
 * In this example, we create an anonymous object of the Person class and call its display method. 
 * 
 * The anonymous object is created using the new keyword and is immediately passed to the display method, without giving it a name.
 * 
 * Anonymous objects are often used in combination with inner classes, anonymous classes, and lambda expressions.
 */

class Person { 
	String name; 
	int age; 

	Person(String name, int age) 
	{ 
		this.name = name; 
		this.age = age; 
	} 

	void display() 
	{ 
		System.out.println("Name: " + name+ ", Age: " + age); 
	} 
} 

class Main { 
	public static void main(String[] args) 
	{ 
		// Create an anonymous object 
		// and call its display method 
		new Person("John", 30).display(); 
	} 
}
