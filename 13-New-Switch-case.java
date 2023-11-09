class New_switch_case {

    // SWITCH CAN BE USED A STATEMENT AND ALSO AS AN EXPRESSION
    public static void main(String[] args) {
    
    String day = "Sunday";
    String option1 = "";
    String option2 = "";
    String option3 = "";

    // Switch as a conditional statement - NORMAL
    switch (day) {
        case "Saturday","Sunday" ->System.out.println("Wake up at 7 am");    

        case "Monday" ->System.out.println("Wake up at 6 am");
    
        default ->System.out.println("Wake up at 8 am");
    }



    /////////////////////////////////////////////////////////////////////////////////////////// Switch as an Expression - returns a value - 01


        switch (day) {
            case "Saturday","Sunday" -> option1 = "7 am";
            case "Monday" ->option1 = "6 am";
            default ->option1 = "8 am";
        }


    // Assign value to switch
        option2 = switch (day) {
            case "Saturday","Sunday" -> "7 am";
            case "Monday" ->"6 am";
            default ->"8 am";
        };

    // Assign value to switch
        option3 = switch (day) {
            case "Saturday","Sunday" : yield "7 am";
            case "Monday" :yield "6 am";
            default : yield "8 am";
        };

        System.out.println("Switch case option 1 : "+option1);
        System.out.println("Switch case option 2 : "+option2);
        System.out.println("Switch case option 3 : "+option3);
   } 
}
