 class Arrays {

    public static void main(String[] args) {
        
        /* ARRAYS
         * ==========
         * Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
         * 
         * DECLARATION
         * ===============
         * To declare an array, define the variable type with square brackets: 
         * String[] cars;
         * 
         * 
         * ARRAY OF STRINGS
         * ================
         * We have now declared a variable that holds an array of strings. To insert values to it, you can place the values in a comma-separated list, inside curly braces:
         * String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
         * String cars[] = {"Volvo", "BMW", "Ford", "Mazda"};
         * 
         * 
         * ARRAY OF INTEGERS
         * ================
         * int[] myNum = {10, 20, 30, 40};
         * OR int myNum[] = {10, 20, 30, 40};
         * 
         * 
         * 
         * 
         * 
         * CHANGE AN ARRAY ELEMENT
         * ========================
         * To change the value of a specific element, refer to the index number:
         
            cars[0] = "Opel";
         * 
         * 
         * 
         * 
         * ACCESS THE ELEMENTS OF AN ARRAY
         * ================================= 
         * You can access an array element by referring to the index number.
         * This statement accesses the value of the first element in cars:
         
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            System.out.println(cars[0]);
           // Outputs Volvo
         *
         * 
         * 
         * 
         * ARRAY LENGTH
         * =============
         * To find out how many elements an array has, use the length property:
         
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
           OR  String cars[] = {"Volvo", "BMW", "Ford", "Mazda"};
            System.out.println(cars.length);
            // Outputs 4
         *
         * 
         */

         // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
         String cars[] = {"Volvo", "BMW", "Ford", "Mazda"};

         System.out.println("////// FOR LOOP //////////////////");

         for (int index = 0; index < cars.length; index++) {

            System.out.println(cars[index]);            
         }
         
         System.out.println();

         System.out.println("//////  ARRAY LENGTH //////////////////");
         System.out.println("Array Length : "+cars.length);
         System.out.println();


         System.out.println("////// for-each  Loop //////////////////");
         
         for (String value : cars) {
            System.out.println(value);
         }
         
        System.out.println();
        
        System.out.println("////// Update First Element in Array //////////////////");
        cars[0] = "Lexus 570";

        System.out.println("////// Updated List //////////////////");
         
         for (String value : cars) {
            System.out.println(value);
         }


    }
    
}
