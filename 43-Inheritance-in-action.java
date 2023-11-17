/*
 * Inheritance - 'is a'
 * 
 * e.g Scientific Calculator is a Calculator
 * 
 */
class Calculator {

    public String father = "Calculator";
    
    public int add(int firstValue , int secondValue){
        return firstValue + secondValue;
    }

    public int subtract(int firstValue , int secondValue){
        return firstValue - secondValue;
    }
}


class Scientific_calculator extends Calculator{

    public String son = "Scientific Calculator";

    public int multiply(int firstValue,int secondValue){
        return firstValue * secondValue;
    }

    public int divide(int firstValue , int secondValue){
        return firstValue / secondValue;
    }

}

class Geek {
    public static void main(String[] args) {

        Scientific_calculator sc = new Scientific_calculator();
        
        int sum = sc.add(10,5);
        int difference = sc.subtract(10,5);
        int product = sc.multiply(10,5);
        int quotient = sc.divide(10,5);

        System.out.println("Father : "+sc.father);
        System.out.println("Son : "+sc.son);
        System.out.println("Addition : " +sum+ "\nSubtraction : " +difference+"\nProduct : " +product+ "\nDivision : " +quotient);
    }
}