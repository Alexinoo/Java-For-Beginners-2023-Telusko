 /*
  * Immutable String in Java
  ============================
  *
  * In Java, string objects are immutable. Immutable simply means unmodifiable or unchangeable. 
  *
  * Once a string object is created its data or state can’t be changed but a new string object is created.
  *
  * Here Sachin is not changed but a new object is created with “Sachin Tendulkar”. 
  *
  * That is why a string is known as immutable.

  * But if we explicitly assign it to the reference variable (Example 2), it will refer to the “Sachin Tendulkar” object. 

  *
  * Memory Allotment of String
    ============================
  *
  * Whenever a String Object is created as a literal, the object will be created in the String constant pool. 
  * This allows JVM to optimize the initialization of String literal.

  * Example: 

        String demoString = "Geeks";

  * The string can also be declared using a new operator i.e. dynamically allocated.

  * In case of String are dynamically allocated they are assigned a new memory location in the heap. 

  * This string will not be added to the String constant pool.

    Example: 

        String demoString = new String("Geeks");

  * If you want to store this string in the constant pool then you will need to “intern” it.

    Example:

        String internedString = demoString.intern(); 
        // this will add the string to string constant pool.

  * It is preferred to use String literals as it allows JVM to optimize memory allocation.

  * Note: String objects are stored in a special memory area known as string constant pool.

  * However, by the use of the ‘new’ keyword, The JVM will create a new string object in the normal heap area even if the same string object is present in the string pool. 

  */
 class Mutable_vs_immutable {
    
    public static void main(String[] args) {
        

        /////////////  Example 1: ////////////////////
        
        String s = "Sachin";     
        // concat() method appends the string at the end
        s.concat(" Tendulkar");     
        // Prints Sachin because strings are immutable objects
        System.out.println(s); //Sachin





        ///////////////////////  Example 2: ///////////
        String name = "Alex";     
        // concat() method appends the string at the end
        name = name.concat(" Mwangi");     
        // Explicitly assigned we create a new object "Alex Mwangi" in the string constant pool
        System.out.println(name); //Alex Mwangi
    }
}
