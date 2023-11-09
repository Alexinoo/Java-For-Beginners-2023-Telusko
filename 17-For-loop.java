class For_loop {

    public static void main(String[] args) {

        // Count 5 working Days 
        // Count 8 working hours in that every day (9 - 5)24hrs system

        for (int day = 1; day <= 7; day++) {

            System.out.println("DAY "+day);
            
            for(int hours = 1; hours <= 8; hours++){
                System.out.println("  "+ (hours+8)+ " - "+(hours+9));
            }
        }



        // WEIRD STUFFS
         int i =1;
         for(;i<=5;){
            System.out.println("DAY "+i);
            i++;
         }
    }
    
}
