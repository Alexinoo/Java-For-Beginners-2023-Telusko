class Conditional_statements {

    public static void main(String[] args) {
        
        int firstVal = 23;

        int secondVal = 20;

        int thirdVal = 30;

        // if else
        // Use curly brackets if you are printing more than 1 statements
        // e.g. System.out.println("Thank you");

        if(firstVal > secondVal) 
            System.out.println(firstVal + " is greater than "+secondVal);
        else
            System.out.println(firstVal + " is less than "+secondVal);


        // if else if
        if(firstVal > secondVal && firstVal > thirdVal) 
             System.out.println(firstVal + " is greater than "+secondVal+ " and "+thirdVal);
        else if(secondVal > thirdVal)
             System.out.println(secondVal + " is greater than "+firstVal+ " and "+thirdVal);
        else
             System.out.println(thirdVal + " is greater than "+firstVal+ " and "+secondVal);
    }
    
}
