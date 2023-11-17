/*
 * Inheritance - 'is a'
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


class ScientificCalculator extends Calculator{

    public String son = "Scientific Calculator";

    public int multiply(int firstValue,int secondValue){
        return firstValue * secondValue;
    }

    public int divide(int firstValue , int secondValue){
        return firstValue / secondValue;
    }

}

class AdvancedScientificCalculator extends ScientificCalculator{

    public String children = "Advanced Scientific Calculator";

    public double power(int firstValue,int secondValue){
        return Math.pow(firstValue, secondValue);
    }

   

}

class Geek {
    public static void main(String[] args) {

        AdvancedScientificCalculator sc = new AdvancedScientificCalculator();
        
        int sum = sc.add(10,5);
        int difference = sc.subtract(10,5);
        int product = sc.multiply(10,5);
        int quotient = sc.divide(10,5);
        double power = sc.power(5,2);

        System.out.println("Father : "+sc.father);
        System.out.println("Son : "+sc.son);
        System.out.println("Addition : " +sum+ "\nSubtraction : " +difference+"\nProduct : " +product+ "\nDivision : " +quotient+ "\nPower : "+power);
    }
}