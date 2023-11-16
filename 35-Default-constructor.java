/* Types of Constructors in Java
   =============================
 * 
 * Primarily, there are three types of constructors in Java are mentioned below:
 * 
   > Default Constructor
   > Parameterized Constructor
   > Copy Constructor

 * 
 *  Default Constructor
 * =====================
 * 
 * A constructor that has no parameters is known as default the constructor.
 * 
 * A default constructor is invisible. 
 * 
 * And if we write a constructor with no arguments, the compiler does not create a default constructor. It is taken out. 
 * 
 * 
 * NOTE : Default constructor provides the default values to the object like 0, null, etc. depending on the data type.
 * 
 * 
 * A default constructor is created automatically behind the scene if we don't create it and explicitly initialize the instance variables to default values.
 * 
 * Generate Default Constructors with VsCode
   =========================================

        > Right Click on Source Action >  Select Generate Constructors

        > Unselect the instance variables
 */
class Geek {

    // Default Constructor
    Geek(){
        System.out.println("Default Constructor called..");
    }

    public static void main(String[] args) {
         Geek obj = new Geek();
    }
    
}