    /*
     * Getters and Setters
     * ====================
     * 
     * In Java, Getter and Setter are methods used to protect your data and make your code more secure. 
     * 
     * Getter and Setter make the programmer convenient in setting and getting the value for a particular data type.
     * 
     * Getter in Java: (accessors)
     * ===========================
     * 
     *  It returns the value of data type int, String, double, float, etc.
     * For the program’s convenience, the getter starts with the word get followed by the variable name.
     * 
     * 
     * Setter in Java: (mutators)
     * ==========================
     * 
     * While Setter sets or updates the value (mutators). It sets the value for any variable used in a class’s programs. and starts with the word set followed by the variable name. 
     * 
     * Syntax 
     * ========
     * 
      class ABC{
        
            private variable;
            
            public void setVariable(int x){
                this.variable=x;
            }
            
            public int getVariable{
                return variable;
            }
        }

      * Generate Getters and Setters with VsCode
      =================================

        > Right Click on Source Action >  Select Generate Getters and Setters
    
////////////////////////////////////////////////////////////////////////////////////

 * Class 1 - Helper class
 */
class People {

    private String name;

    // Method 1 - Getter (accessors)
    public String getName(){
        return name;
    }

    // Method 2 - Setter (mutators)
    public void setName(String name){
        // this keyword refers to current instance itself
        this.name = name;
    }

 // Normal method for printing details
    public void printName(){
        System.out.println("Name : "+name);
    }
    
   
}
class Getters_and_setters {

    public static void main(String[] args) {
        
        People per = new People();

        per.setName("John");

        per.printName();
    }
    
}
