/* Java and Multiple Inheritance
   =============================
 *
 * Multiple Inheritance is a feature of an object-oriented concept, where a class can inherit properties of more than one parent class. 
 * 
 * The problem occurs when there exist methods with the same signature in both the superclasses and subclass. 
 * 
 On calling the method, the compiler cannot determine which class method to be called and even on calling which class method gets the priority. 
 * 
 * Java Program to Illustrate Unsupportance of Multiple Inheritance
 * 
*/

//  Class 1
// First Parent class
class Parent1 {
 
  // Method inside first parent class
  void fun() {
 
    // Print statement if this method is called
    System.out.println("Parent1");
  }
}
 
// Class 2
// Second Parent Class
class Parent2 {
 
  // Method inside first parent class
  void fun() {
 
    // Print statement if this method is called
    System.out.println("Parent2");
  }
}
 
// Class 3
// Trying to be child of both the classes
class Test extends Parent1, Parent2 {
 
  // Main driver method 
  public static void main(String args[]) {
 
    // Creating object of class in main() method
    Test t = new Test();
 
    // Trying to call above functions of class where
    // Error is thrown as this class is inheriting
    // multiple classes
    t.fun();
  }
}

// Output: Compilation error is thrown

/*
 * 
 * Conclusion: As depicted from code above, on calling the method fun() using Test object will cause complications such as whether to call Parent1’s fun() or Parent2’s fun() method. 
 * 
 * 
 * So a work around for this confusion is to use interfaces which we are going to look at in the later videos
 */
