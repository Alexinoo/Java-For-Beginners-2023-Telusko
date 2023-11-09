class While_loop {

    public static void main(String[] args) { 

        int counter = 1;

        while (counter <= 10) {

             System.out.println("Outer loop executing:"+counter);
             
            //  Runs 3 times
             int j = 1;
             while(j <= 3){
                 System.out.println("Inner loop runs :"+j);
                 j++;
             }
             counter++;            
        }

        // Exits when while(false) with the value 11

        System.out.println("Bye : "+counter);
    }
    
}
