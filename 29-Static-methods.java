/*
 *  Mobile - Helper class
 */

 class Mobile{
    String brand;
    float price;
    static String name = "Smartphone";

    // instance method (non static)
    public void printDetails(){
        System.out.println( brand + " : "+price+ " : "+name);
    }

    // class-level (static)
    public static void printDetailsStatic(Mobile obj){
        System.out.println("====From Static method ==========");
        System.out.println( obj.brand + " : "+obj.price+ " : "+name);
    }
 }

class Static_methods {

    /*
     * Non Static methods - Need to instantiate by creating an object using new keyword and accessing it via the instance name
       e.g.
           Mobile m1 = new Mobile();
           m1.printDetails();

     * 
     *  However, with static methods , instantiating is not needed and you can call the method directly via the class name
     
         e.g.
           Mobile.printDetailsStatic();
     * 
     * The downside of using static methods is that they can only access static variables and not instance variables
     * 
     *  This means we cannot access brand and price instance variable unless we explicitly pass them as parameters when calling printDetailsStatic();
     
       e.g.
           Mobile.printDetailsStatic();
     * This is because, its not clear which instances m1,m2,..mn you are referring and therefore the solution is to pass the object itself to the method
     * 
       e.g.
           Mobile.printDetailsStatic(m1);

     * Then adjust printDetailsStatic static method by accepting object as parameter
     * 
        // class-level (static)
        public static void printDetailsStatic(Mobile obj){
            System.out.println( obj.brand + " : "+obj.price+ " : "+name);
        }

     * Why is the main method in Java static?
     * =======================================
     * It’s because calling a static method isn’t needed of the object. If it were a non-static function, JVM would first build an object before calling the main() method, resulting in an extra memory allocation difficulty. (deadlock - create instance of Static_methods from where without execution..?)
     */
    
    public static void main(String[] args) {
       
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 1599.99f;
        
        Mobile m2 = new Mobile();
        m2.brand = "iPhone";
        m2.price = 1999.99f;

        m1.printDetails();
        m2.printDetails();

        Mobile.printDetailsStatic(m1);

    }
}
