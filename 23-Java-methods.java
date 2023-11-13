 /* JAVA METHODS is like a function
         * ================
         * 
         * Methods in Java is a collection of statements that perform some specific task and return the result to the caller.
         * 
         * A Java method can perform some specific task without returning anything.
         * 
         * In Java, every method must be part of some class that is different from languages like C, C++, and Python. 
         * 
         * 
         * 
         * Method Declaration
         * ==================
         * 
         * In general, method declarations have 6 components:
         * 
         * 1. MODIFIER: [ Note: It is Optional in syntax. ]
         * =============
           It defines the access type of the method i.e. from where it can be accessed in your application. In Java, there 4 types of access specifiers. 

            > public:    It is accessible in all classes in your application.
            > protected:     It is accessible within the class in which it is defined and in its subclass/es
            > private:   It is accessible only within the class in which it is defined.
            > default:    It is declared/defined without using any modifier. It is accessible within the same class and package within which its class is defined.

         *
         * 2. The return type: 
         * ===================
         * 
         * The data type of the value returned by the method or void if does not return a value. It is Mandatory in syntax.

         * 3. Method Name: 
         * ==================
         * 
         * The rules for field names apply to method names as well, but the convention is a little different. It is Mandatory in syntax.

         * 4. Parameter list: 
         * ==================
         * 
         * Comma-separated list of the input parameters is defined, preceded by their data type, within the enclosed parenthesis. If there are no parameters, you must use empty parentheses ().  It is Optional in syntax.

         * 5. Exception list: [ Note: It is Optional in syntax. ]
         * ==================
         * The exceptions you expect by the method can throw, you can specify these exception(s). 

         * 6. Method body: 
         * =================
         * 
         * it is enclosed between braces. The code you need to be executed to perform your intended operations.  It is Optional in syntax.
         * 
         * 
         * EXAMPLE
         * ===========
         
            public int max(int x , int y){
                if (x > y)
                    return x;
                else
                    return y;
            }
         * 
         * 
         * 
         */

         
/**
 * Helper Class
 */
class Java_methods {

    public int max(int x , int y){

        if (x > y)
            return x;
        else
            return y;
    }
    
    // Driver code
    public static void main(String[] args) {

        Java_methods compare = new Java_methods();
            
        int greatestValue = compare.max(10,19);

        System.out.println(greatestValue);
        
        }
        
    }
