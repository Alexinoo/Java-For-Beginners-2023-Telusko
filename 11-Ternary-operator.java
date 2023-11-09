class Ternary_operator {
    public static void main(String[] args) {

        int number = 7;

        String result = "";
        
        // Normal If else
        // if(number%2 ==0)
        //     result = "Even";
        // else    
        //     result = "Odd";

        // Ternary operator   
        result = (number%2==0) ? "Even" : "Odd";

        System.out.println(number+" is "+result+ " number");
    }
}