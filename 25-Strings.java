 /*What are Strings in Java ?
  * =============================
  *
  * Strings are the type of objects that can store the character of values and in Java, every character is stored in 16 bits i,e using UTF 16-bit encoding. 
  *
  * A string acts the same as an array of characters in Java.
  *
  * A collection of characters surrounded by double quotes
  *  
  * e.g. String name = "Geeks";
     
  * |G |e |e |k |s |
    |__|__|__|__|__|
     0  1  2  3   4

     Addresses
     __________

     G - 0x23452
     e - 0x23453
     e - 0x23454
     k - 0x23455
     s - 0x23456

  * Ways of Creating a String
    ==========================

  * There are two ways to create a string in Java: 

    > String Literal

       - To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool). 

       - Example

        String demoString = “GeeksforGeeks”;

    > Using new Keyword

       - String s = new String(“Welcome”);

       - In such a case, JVM will create a new string object in normal (non-pool) heap memory and the literal “Welcome” will be placed in the string constant pool. The variable s will refer to the object in the heap (non-pool)

       - Example : 
       
        String demoString = new String (“GeeksforGeeks”);

  */
 
 class Strings {
    public static void main(String[] args) {
        
        // String name = "Alex";     
        
        // Equivalent To
        String name = new String("Alex");  

        System.out.println("String : "+name);

        System.out.println("Length of the characters : "+name.length());

        System.out.println("Concatenation : "+name.concat(" Mwangi"));

        System.out.println("Index of a certain character specified index(0) : "+name.charAt(0));

        System.out.println("Lower case : "+name.toLowerCase());

        System.out.println("Upper case : "+name.toUpperCase());

        System.out.println(name);
    }
}
