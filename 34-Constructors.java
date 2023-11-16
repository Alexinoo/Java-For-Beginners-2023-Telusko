

    /* Java Constructors
       =================
     * 
     * A constructor in Java is a special method that is used to initialize objects.
     * 
     * The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.
     * 
     * If no values are provided , the object is created with default values ; i.e null for strings and 0 for integers
     * 
     * Every time an object is created using the new() keyword, at least one constructor is called.
     *  
     * 
     * How Java Constructors are Different From Java Methods?
     * ======================================================
     * 
     * Constructors must have the same name as the class within which it is defined it is not necessary for the method in Java.
     * 
     * Constructors do not return any type while method(s) have the return type or void if does not return any value.
     * 
     * Constructors are called only once at the time of Object creation while method(s) can be called any number of times.
     * 
     * 
     * Need of Constructors in Java
     * ==============================
     * 
     * Think of a Box. 
     * 
     * If we talk about a box class then it will have some class variables (say length, breadth, and height).
     * 
     * But when it comes to creating its object(i.e Box will now exist in the computer’s memory), then can a box be there with no value defined for its dimensions? 
     * 
     * The answer is No.
     * 
     * So constructors are used to assign values to the class variables at the time of object creation, either explicitly done by the programmer or by Java itself (default constructor).
     * 
     * When is constructor called ?
     * ============================
     * 
     * Each time an object is created using a new() keyword, at least one constructor (it could be the default constructor) is invoked to assign initial values to the data members of the same class. 
     * 
     * 
     * Rules for writing constructors are as follows:
     * ==============================================
     * 
     * The constructor(s) of a class must have the same name as the class name in which it resides.
     * 
     * A constructor in Java can not be abstract, final, static, or Synchronized.
     * 
     * Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.
     * 
     * We have learned that constructors are used to initialize the object’s state. Like methods, a constructor also contains a collection of statements(i.e. instructions) that are executed at the time of Object creation.
     */

class Geek {

    Geek(){
        System.out.println("Constructor called..");
    }

    public static void main(String[] args) {
         Geek obj = new Geek();
    }
    
}
