 class Multi_dimensional_arrays {
   public static void main(String[] args) {
    
    /*
     * MULTI-DIMENSIONAL ARRAYS
     * ==========================
     * A multidimensional array is an array of arrays.
     * Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.
     * To create a two-dimensional array, add each array within its own set of curly braces:
     
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

     *  myNumbers is now an array with two arrays as its elements.
     * 
     * ACCESS ELEMENTS
     * =================
     * To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the element inside that array. 
     * This example accesses the third element (2) in the second array (1) of myNumbers:
     * 
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7
     * 
     * 
     * CHANGE ELEMENT VALUES
     * =========================
     * You can also change the value of an element:
     
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7
     * 
     * 
     * 
     * 
     * Loop Through a Multi-Dimensional Array
     * ========================================
     * We can also use a for loop inside another for loop to get the elements of a two-dimensional array (we still have to point to the two indexes):
     * 
     */

      int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
      
        for (int i = 0; i < myNumbers.length; i++) {

            for(int j = 0; j < myNumbers[i].length; j++) {
                 System.out.println(myNumbers[i][j]);
        }
    }

 }
    
}
