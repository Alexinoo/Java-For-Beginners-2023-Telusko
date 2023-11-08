class Typeconversion {
    public static void main(String[] args){

        /* Type Conversion or Casting*/

        byte byteVal = 127; //range [ -127 to 128 ]

        int intVal = 12; //range [-2147483647 to 2147483647 ]

        // Reassign - byteVal cannot  hold 256
        // byteVal = intVal;  -- Error Type Conversion


        byteVal = (byte)intVal;  //Casting
        // intVal = byteVal;  --Works 

        /* Perfoms modulus operation if the value is > 256
        
        e.g.

              int intVal = 257; 
              byte byteVal = (byte)intVal; 
              System.out.println("Integer value : "+byteVal); -- 257 % 256 = 1

        */ 


        // FLoat casting/conversion
        float priceFloat = 499.99f;
        int priceInt = (int)priceFloat;


        System.out.println("Byte value : "+byteVal);
        System.out.println("Integer value : "+intVal);

        System.out.println("--------------------------");

        System.out.println("Float value : "+priceFloat);
        System.out.println("Integer value : "+priceInt);
    }
}