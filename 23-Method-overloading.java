
/* Method Overloading in Java
===============================
 *
 * In Java, Method Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.
 * 
 * Method overloading in Java is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding. 
 * 
 * 
 * 
 * Different Ways of Method Overloading in Java
 * =============================================
 *
    >   Changing the Number of Parameters.
    >   Changing Data Types of the Arguments.
    >   Changing the Order of the Parameters of Methods

*/


class Method_overloading {
    
    // Overloaded sum(). This sum takes two int parameters 
    public int sum(int x, int y) {
         return (x + y);
         } 
  
    // Overloaded sum(). This sum takes three int parameters 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
  
    // Overloaded sum(). This sum takes two double 
    // parameters 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 


     // Driver code 
    public static void main(String args[]) 
    { 
        Method_overloading s = new Method_overloading(); 
        System.out.println(s.sum(10, 20)); 
        System.out.println(s.sum(10, 20, 30)); 
        System.out.println(s.sum(10.5, 20.5)); 
    } 
}
