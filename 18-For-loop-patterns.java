class For_loop_patterns {
    public static void main(String[] args) {

        /*
         * 1
         * 12
         * 123
         * 1234
         * 12345
         */
        
        for (int i = 1; i <= 5; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j); 
            }
            System.out.println();  
        }

        System.out.println("==============================="); 

         /*
         * 12345
         * 12345
         * 12345
         * 12345
         * 12345
         */

        for (int i = 1; i <= 5; i++) {
            
            for (int j = 1; j <= 5; j++) {
                System.out.print(j); 
            }
            System.out.println();  
        }

         System.out.println("==============================="); 

         /*
         * #####
         * ####
         * ###
         * ##
         * #
         */

         for (int i = 5; i >= 1; i--) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); 
            }
            System.out.println();  
        }       

    }
}
