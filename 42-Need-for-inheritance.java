/* Inheritance in Java - 'is a'
   ===================
 *
 * Inheritance is an important pillar of OOP(Object-Oriented Programming). 
 * 
 * It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class. 
 * 
 * In Java, Inheritance means creating new classes based on existing ones. 
 * 
 * A class that inherits from another class can reuse the methods and fields of that class. 
 * 
 * In addition, you can add new fields and methods to your current class as well.  
 * 
 * 
 * Why Do We Need Java Inheritance?
 * ================================
 * 
 * Code Reusability:  
   >  The code written in the Superclass is common to all subclasses. Child classes can directly use the parent class code.

 * Method Overriding: 
   >  Method Overriding is achievable only through Inheritance. It is one of the ways by which Java achieves Run Time Polymorphism.

 * Abstraction: 
   >  The concept of abstract where we do not have to provide all details is achieved through inheritance. Abstraction only shows the functionality to the user.

 * Important Terminologies Used in Java Inheritance
 * ================================================
 * 
 * Class:
   -------   
    >  A Class is a set of objects which shares common characteristics/ behavior and common properties/ attributes. Class is not a real-world entity. It is just a template or blueprint or prototype from which objects are created.

 * Super Class/Parent Class: 
   -------------------------
    >  The class whose features are inherited is known as a superclass(or a base class or a parent class).

 * Sub Class/Child Class: 
   ----------------------
   >  The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.

 * Reusability: 
   -------------  
   >  Inheritance supports the concept of 'reusability', i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.

 * How to Use Inheritance in Java?
 * ===============================
 * 
 * The extends keyword is used for inheritance in Java. Using the extends keyword indicates you are derived from an existing class. In other words, 'extends' refers to increased functionality.

 * Syntax : 

    class derived-class extends base-class {  
        //methods and fields  
    }  


 */
// Java Program to illustrate Inheritance (concise)



// Base or Super Class
class Employee {
	int salary = 60000;
}

// Inherited or Sub Class
class Engineer extends Employee {
	int benefits = 10000;
}

// Driver Class
class Geek {
	public static void main(String args[])
	{
		Engineer E1 = new Engineer();
		System.out.println("Salary : " + E1.salary+ "\nBenefits : " + E1.benefits);
	}
}

