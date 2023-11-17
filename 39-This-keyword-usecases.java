/* 
 * Methods to use ‘this’ in Java
 * ===============================
 * 
 * Following are the ways to use the ‘this’ keyword in Java mentioned below:

    1. Using the ‘this’ keyword to refer to current class instance variables.
    2. Using this() to invoke the current class constructor
    3. Using ‘this’ keyword to return the current class instance 
    4. Using ‘this’ keyword as the method parameter
    5. Using ‘this’ keyword to invoke the current class method 
    6. Using ‘this’ keyword as an argument in the constructor call
 *
 * 
 * 1. Using the ‘this’ keyword to refer to current class instance variables.
 * =========================================================================
 * 
 *
    class Test {
        int a;
        int b;

        // Parameterized constructor
        Test(int a, int b){
            this.a = a;
            this.b = b;
        }

        void display(){
            // Displaying value of variables a and b
            System.out.println("a = " + a + " b = " + b);
        }

        public static void main(String[] args){
            Test object = new Test(10, 20);
            object.display();
        }
    }

    Output
    a = 10  b = 20
 *
 * 
 * 2. Using this() to invoke the current class constructor
 * =======================================================
 *  
    class Test {
        int a;
        int b;

        // Default constructor
        Test(){
            this(10, 20);
            System.out.println("Inside default constructor \n");
        }

        // Parameterized constructor
        Test(int a, int b){
            this.a = a;
            this.b = b;
            System.out.println("Inside parameterized constructor");
        }

        public static void main(String[] args) {
            Test object = new Test();
        }
    }

    Output
    Inside parameterized constructor
    Inside  default constructor 

 *
 * 3. Using ‘this’ keyword to return the current class instance 
 * ============================================================
 *      
    class Test {
        int a;
        int b;

        // Default constructor
        Test() {
            a = 10;
            b = 20;
        }

        // Method that returns current class instance
        Test get() { 
            return this; 
        }

        // Displaying value of variables a and b
        void display(){
            System.out.println("a = " + a + " b = " + b);
        }

        public static void main(String[] args) {
            Test object = new Test();
            object.get().display();
        }
    }

    Output
    a = 10  b = 20

 *
 * 
 * 4. Using ‘this’ keyword as a method parameter
 * =============================================
 *  
    class Test {
        int a;
        int b;

        // Default constructor
        Test(){
            a = 10;
            b = 20;
        }

        // Method that receives 'this' keyword as parameter
        void display(Test obj){
            System.out.println("a = " + obj.a + " b = " + obj.b);
        }

        // Method that returns current class instance
        void get() { 
            display(this); 
        }

        // main function
        public static void main(String[] args) {
            Test object = new Test();
            object.get();
        }
    }

    Output
    a = 10  b = 20

 *
 * 
 * 5. Using ‘this’ keyword to invoke the current class method 
 * ==========================================================
 * 
 
    class Test {

        void display(){
            // calling function show()
            this.show();

            System.out.println("Inside display function");
        }

        void show(){
            System.out.println("Inside show function");
        }

        public static void main(String args[]) {
            Test t1 = new Test();
            t1.display();
        }
    }

    Output
    Inside show function
    Inside display function
 * 
 * 
 * 6. Using ‘this’ keyword as an argument in the constructor call
 * ==============================================================
 * 
    class A {
        B obj;

        // Parameterized constructor with object of B
        // as a parameter
        A(B obj) {
            this.obj = obj;

            // calling display method of class B
            obj.display();
        }
    }

    class B {
        int x = 5;

        // Default Constructor that create an object of A
        // with passing this as an argument in the
        // constructor
        B() { 
            A obj = new A(this); 
        }

        // method to show value of x
        void display() {
            System.out.println("Value of x in Class B : " + x);
        }

        public static void main(String[] args){
            B obj = new B();
        }
    }

    Output
    Value of x in Class B : 5

 * 
 *
 */


class Test {

    public static void main(String[] args) {
        
    }
    
}
