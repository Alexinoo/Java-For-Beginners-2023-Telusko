/*
 *  Mobile - Helper class
 */

 class Mobile{
    String brand;
    float price;
    static String name ;

    // Constructor
    // No need to have name inside the constructor since it will be initialized every time an object is created
    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("Constructor block called");
    }


    // Solution is to have a Static block that initializes name of a phone 
    static {
        name = "Smartphone";
        System.out.println("Static block called");
    }
 }


class Static_block {

    /* Static Block
       ================
     *
     * A static block is a block of code with a static keyword. In general, these are used to initialize the static members.
     * 
     * A constructor is called every time an object created while a static block is initialized/executed only once ; the first time the class is loaded into memory irrespective of how many times an object is created.
     * 
     * Calling of static block in java?
     * ================================
     * 
     * So in order to call any static block, there is no specified way as static block executes automatically when the class is loaded in memory. 
     * 
     * Static block called once and is called first since it is loaded in the memory first before the object can be created.
     * Class is only loaded once
     * 
     * Constructor block called twice since we are cretaing 2 instances m1,m2
     */

     public static void main(String[] args) throws ClassNotFoundException {

        // Mobile m1 = new Mobile();
        // Mobile m2 = new Mobile();

        // What if we don't want to create m1,m2 objects. Does that mean that our Mobile class will not be loaded into memory

        // Well we can use Class.forName("Mobile") which enables the class to be added/loaded into class memory loader
        Class.forName("Mobile");
     }
    
}
