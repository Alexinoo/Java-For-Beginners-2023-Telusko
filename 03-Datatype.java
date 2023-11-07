class Datatype {
    public static void main(String [] args){

        /* PRIMITIVE DATATYPES  */

        /* Integer : Whole numbers
            int size(4 bytes)
            byte size(1 byte) -2^7 to 2^7 - 1 => -127 to 128
            short size(8 bytes)
            long  size(2 bytes) 
        */
        int age = 4;
        // byte by = 129 WONT Work!!! -128 to 127
        byte byteInt = 127;
        short shortInt = 567;
        long  longInt = 5854l; //Put l at the end

        /* Float : precision
         float - size (4 bytes)
         double - size (8 bytes)        
        */
        float pi = 3.14f;
        double price = 4999.99;


        /* Character size (2 bytes) - Single Quotes - Accept single character*/
        char c = 'k';

       

        /* Boolean  - True/False*/
        boolean isCompleted = true;


        System.out.println("Integer datatypes");
        System.out.println("-----------------------");
        System.out.println("Integer : "+age);
        System.out.println("Byte : "+byteInt);
        System.out.println("Short : "+shortInt);
        System.out.println("Long : "+longInt);



        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Float datatypes");
        System.out.println("-----------------------");
        System.out.println("Float : "+pi);
        System.out.println("Double : "+price);




        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Character datatypes");
        System.out.println("-----------------------");
        System.out.println("Character : "+c);



        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Boolean datatypes");
        System.out.println("-----------------------");
        System.out.println("Boolean : "+isCompleted);







       
    }
}