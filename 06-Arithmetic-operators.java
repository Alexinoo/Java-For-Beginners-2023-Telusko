class Arithmetic_operators {
    public static void main(String[] args) {
       
        /*
         *  Arithmetic Operators
         *  Arithmetic operators are used to perform common mathematical operations.

            Operator	Name	        Description	                                   Example	
                +	    Addition	    Adds together two values	                    x + y	
                -	    Subtraction	    Subtracts one value from another	            x - y	
                *	    Multiplication	Multiplies two values	                        x * y	
                /	    Division	    Divides one value by another	                x / y	
                %	    Modulus	        Returns the division remainder	                x % y	
                ++	    Increment	    Increases the value of a variable by 1	        ++x	
                --	    Decrement	    Decreases the value of a variable by 1	        --x

            -----------------------------------------------------------------------

                ++x	- pre-increment
                x++	- post-increment
         */

         int firstValue = 200;
         int secondValue = 110;

         int sum = firstValue + secondValue;
         int diff = firstValue - secondValue;
         int product = firstValue * secondValue;
         float quotient = (float)firstValue / secondValue;
         int modulo = firstValue % secondValue;


         
        
         System.out.println("First Value : "+firstValue );
         System.out.println("Second Value : "+secondValue );

         System.out.println("------------------------ ");
         System.out.println("Addition (+) : "+sum);
         System.out.println("Subtraction (-) : "+diff);
         System.out.println("Multiplication (*) : "+product);
         System.out.println("Division (/) : "+quotient);
         System.out.println("Modulus (%) : "+modulo);

         firstValue++; //firstValue = firstValue + 1
         secondValue--; //firstValue = firstValue + 1

         System.out.println("------------------------ ");
         System.out.println("Increment (++) : "+firstValue);
         System.out.println("Decrement (--) : "+secondValue);

    }
}