class Comparison_operators {

    public static void main(String[] args) {

        /*
         *  Comparison operators are used to compare two values (or variables). This is important in programming, because it helps us to find answers and make decisions.

            The return value of a comparison is either true or false.

            Operator	Name	                    Example
                ==	    Equal to	                 x == y	
                !=	    Not equal	                 x != y	
                >	    Greater than	             x > y	
                <	    Less than	                 x < y	
                >=	    Greater than or equal to	 x >= y	
                <=	    Less than or equal to	     x <= y
        */

        int firstValue = 100;
        int secondValue = 200;

        System.out.println("---------------------");
        System.out.println(firstValue);
        System.out.println(secondValue);


        System.out.println("Equality ( "+ firstValue +" == "+ secondValue+" ) : "+(firstValue == secondValue));

        System.out.println("Not Equal ( "+ firstValue +" != "+ secondValue+" ) : "+(firstValue != secondValue));

        System.out.println("Greater than ( "+ firstValue +" > "+ secondValue+" ) : "+(firstValue > secondValue));

        System.out.println("Less than ( "+ firstValue +" < "+ secondValue+" ) : "+(firstValue < secondValue));

        
        System.out.println("Greater than or equal to( "+ firstValue +" >= "+ secondValue+" ) : "+(firstValue >= secondValue));

        System.out.println("Less than or equal to( "+ firstValue +" <= "+ secondValue+" ) : "+(firstValue <= secondValue));
        
    }
    
}
