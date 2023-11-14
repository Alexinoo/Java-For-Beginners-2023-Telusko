 /*  Jagged Multi-dimensional Array 
     * 
     * Jagged - Stores several arrays of varying sizes
     * 
     * Jagged - numbers[][] = new int[3][] -- 3 arrays but not sure of the internal elements
     *  
     *  
     * Assigning Sizes 
     * 
     * numbers[0] = new int[3] ;  1st Array - will have 3 elements
     * numbers[1] = new int[4] ;  2nd Array - will have 4 elements
     * numbers[2] = new int[2] ;  3rd Array - will have 2 elements
     */

class Jagged_multi_dim_array {
    public static void main(String[] args) {
        
        int numbers[][] = new int[3][]; //jagged

        numbers[0] = new int[3];
        numbers[1] = new int[4];
        numbers[2] = new int[2];

        //Normal  Loop
        
        System.out.println("==== Normal For Loop ============");

        for (int i = 0; i < numbers.length; i++) {        

            for (int j = 0; j < numbers[i].length; j++) {

                numbers[i][j] = (int)(Math.random()*10);

                System.out.print(numbers[i][j] +" ");
              }
               
            System.out.println();
        }


        System.out.println("==== For Each Loop ============");

        for (int i[] : numbers) {
            for (int j : i) {
                System.out.print(j +" ");
            }
            System.out.println();
        }


        System.out.println("==== JAGGED - 1 ============");

        int pattern[][] = new int[9][];       

        for (int i = 0; i < pattern.length; i++) {

            pattern[i] = new int[i + 1];
            
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print("*");                
            }
            System.out.println();
        }


         System.out.println("==== JAGGED - 2 ============");

         int count = 1;

         for (int i = 0; i < pattern.length; i++) {

            if (i > 4){
                pattern[i] = new int[ i - count];                
                count = count + 2;
                
            }else{
                pattern[i] = new int[i + 1];
            }
            
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print("*");                
            }
            System.out.println();
        }
    }
}
