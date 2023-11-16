/*
 * Constructor Overloading
 * =========================
 * 
 * The most important topic that comes into play is the strong incorporation of OOPS with constructors known as constructor overloading.
 * 
 * Just like methods, we can overload constructors for creating objects in different ways.
 * 
 * 
 * The compiler differentiates constructors on the basis of the number of parameters, types of parameters, and order of the parameters. 
 */

class Geek {

    String name;
    int age;
    int id;

    // Default constructor - no arguments
    Geek() {
        System.out.println("Default Constructor called - no arguments");
    }
    // constructor with one argument
    Geek(String name) {
        System.out.println("Constructor with one argument - String : " + name);
    }
 
    // constructor with two arguments
    Geek(String name, int age){
        System.out.println("Constructor with two arguments : String and Integer : " + name + " " + age);
    }
 
    // Constructor with one argument but with different
    // type than previous..
    Geek(long id) {
        System.out.println("Constructor with one argument : Long : " + id);
    }

    public static void main(String[] args) {
        
        Geek g = new Geek();
        Geek g0 = new Geek("Geeks");
        Geek g1 = new Geek("Alex", 32);
        Geek g2 = new Geek(325614567);
    }
}