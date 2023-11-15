 
 class StringBuffer_vs_StringBuilder {
    /*
     * 
     * StringBuffer is a class in Java that allows you to modify the contents of a string without creating a new object every time.
     * 
     * 
     * Features & Methods of StringBuffer class
     * ========================================
     * 
     * StringBuffer objects are mutable, meaning that you can change the contents of the buffer without creating a new object.
     * 
     * The initial capacity of a StringBuffer can be specified when it is created, or it can be set later with the ensureCapacity() method.
     * 
     * The append() method is used to add characters, strings, or other objects to the end of the buffer.
     * 
     * The insert() method is used to insert characters, strings, or other objects at a specified position in the buffer.
     * 
     * The delete() method is used to remove characters from the buffer.
     * 
     * The reverse() method is used to reverse the order of the characters in the buffer. 
     * 
     * Diff Between StringBuffer and StringBuilder is that StringBuffer is thread safe and the latter is the opposite
     */
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Alex");

        // System.out.println(sb.capacity()); // Default - 16
        // System.out.println(sb.capacity()); // After adding ("Alex") 4 characters - 20

        System.out.println(sb.length()); //4

        // Append Data
        sb.append(" ");
        sb.append("Mwangi");
        System.out.println(sb);


        // Delete Character at a specified position
        sb.deleteCharAt(0);  //Deletes character "A" at 0-index


        // Insert Characters at a specified position 
        sb.insert(0,"A"); // Adds character A at o-index


        // Get a Substring from a string (specify start & end position)       
        String subString = sb.substring(0,2); // Adds character A at o-index
        System.out.println(subString); //Al :  end position is not included

        // Reverse the Order of the characters in the buffer
        sb.reverse();
   


        // Assign String buffer to String
        // String name = sb; // Type-Mismatch Cannot convert from StringBuffer to String
        String name = sb.toString(); // Use .toString()

        System.out.println(name);
    }
}
