class Need_for_Multi_dim_array {

    /*  Multi-dimensional Array
     * 
     * numbers[][] - Stores several array elements in form of rows and columns
     * 
     * numbers[][] = new int[3][4] --
     *  prints 
     *      0000
     *      0000
     *      0000
     *  
     * Accessing Individual values
     * 
            (0,0) , (0,1) , (0,2) , (0,3)
            (1,0) , (1,1) , (1,2) , (1,3)
            (2,0) , (2,1) , (2,2) , (2,3)
     * 
     */

    public static void main(String[] args) {
        
        int numbers[][] = new int[3][4]; // 3 arrays with 4 elements each

        
        // Print the values
        for( int i = 0 ; i < 3; i++) {

            for (int j = 0; j < 4; j++) {               

                System.out.print( numbers[i][j]  +" ");
            }
            System.out.println();
        } 
        
        ///////////////////////////////////////////////
        
        System.out.println("================================");

        //////////////// Assign Random values using Math.random() //////////////
        for( int i = 0 ; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                // Random elements
                numbers[i][j] = (int)(Math.random() * 10);

                System.out.print(numbers[i][j] +" ");
            }
            System.out.println();
        } 
        
        
        ///////////////////////////////////////////////
        
        System.out.println("=========for Each loop =======================");

        for (int i[] : numbers) {
            
            for (int j : i) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    
}
