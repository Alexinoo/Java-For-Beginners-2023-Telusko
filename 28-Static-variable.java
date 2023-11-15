/**
 * Mobile - Helper class
 */
class Mobile {

    String brand;
    int price;
    // String name ; Before
    String name = "SmartPhone"; //After

    void show(){
        System.out.println( "Brand : "+brand);
        System.out.println( "Price : "+price);
        System.out.println( "Name : "+name);
    }
    
}

/*
 * Main Driver class
 */

class Static_variable {

    public static void main(String[] args) {
        
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 1500;
        // m1.name = "SmartPhone";

        Mobile m2 = new Mobile();
        m2.brand = "iPhone";
        m2.price = 2000;
        // m2.name = "SmartPhone";

        m1.show();
        m2.show();

        // Since name "SmartPhone" is common and shared by m1,m2 instances, we can make it a class-level variable and thus by declaring it as static and therefore it belongs to the class itself rather than to any specific instance of the class. 
        // This means that there is only one copy of the variable in memory, regardless of how many instances of the class are created.

        // Therefore any changes to the variable will be reflected across all instances of the class.

        // Accessed using the class name 
            // e.g. Mobile.name rather than object.property (m1.name or m2.name)
    }
    
}
