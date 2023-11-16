
/* Types of Constructors in Java
   =============================
 * 
 * Primarily, there are three types of constructors in Java are mentioned below:
 * 
   > Default Constructor
   > Parameterized Constructor
   > Copy Constructor

 * 
 *  Parameterized Constructor
 * ==========================
 * 
 * A constructor that has parameters is known as parameterized constructor. 
 * 
 * If we want to initialize fields of the class with our own values, then use a parameterized constructor.
 * 
 * 
 * Generate Parameterized Constructors with VsCode
   ===============================================

        > Right Click on Source Action >  Select Generate Constructors

        > Select the instance variables that you want to initialize
 */
class Geek {

    // data members of the class.
    String name;
    int id;
    
    Geek(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    public void printDetails(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
    }

    public static void main(String[] args) {
        Geek obj = new Geek("Alex",1);
        obj.printDetails();
    }
    
}
