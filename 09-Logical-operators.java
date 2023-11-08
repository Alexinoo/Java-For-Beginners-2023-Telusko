class Logical_operators {

    public static void main(String[] args) {
        /*
         *  Java Logical Operators
         *  You can also test for true or false values with logical operators.
         *  Logical operators are used to determine the logic between variables or values:
         * 
          Operator	Name	     Description		
            && 	    AND	 Returns true if both statements are true otherwise false
            || 	    OR	 Returns true if both or one of the statements is true	
            !	    NOT	 Reverse the result, returns false if the result is true and vice versa
         * 
         */

         System.out.println( 1 == 1 &&  2 > 5); // T && F => F
         System.out.println( 1 == 1 ||  2 > 5); // T || F => T
         System.out.println( !(1 == 1 &&  2 > 5)); // !F =>  T
    }
    
}
