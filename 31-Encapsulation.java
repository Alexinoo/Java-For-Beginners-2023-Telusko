    /*
     * ENCAPSULATION - Bundling up into a single unit
     * ===============================================
     * 
     * This is a fundamental concept in OOP that refers to the bundling of data and methods that operate on that data within a single unit called a class in Java. 
     * 
     * It is a way of hiding the implementation details of a class from outside access and only exposing a public interface that can be used to interact with the class.
     * 
     * In Java, encapsulation is achieved by declaring the instance variables of a class as private, which means they can only be accessed within the class.
     * 
     * 
     * To allow outside access to the instance variables, public methods called getters and setters are defined, which are used to retrieve and modify the values of the instance variables, respectively. 
     * 
     * 
     * By using getters and setters, the class can enforce its own data validation rules and ensure that its internal state remains consistent.
     * 
     * Another way to think about encapsulation is, that it is a protective shield that prevents the data from being accessed by the code outside this shield. 
     * 
     * Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of its own class in which it is declared.
     * 
     * 
     * As in encapsulation, the data in a class is hidden from other classes using the data hiding concept which is achieved by making the members or methods of a class private, and the class is exposed to the end-user or the world without providing any details behind implementation using the abstraction concept, so it is also known as a combination of data-hiding and abstraction.
     * 
     * 
     * Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
     */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/*
 * 
 * Person - Helper class
*/
     
class Person{
    private String name;
    private int age;

    // setName(String name) && getName()
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    // setAge(String name) && getAge()
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }


    // showDetails
     void showDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
     }
}



 class Encapsulation {   
    
    public static void main(String[] args) {

        // Create an object of type Person
        Person p1 = new Person();
        p1.setName("John");
        p1.setAge(30);

        // Call ShowDetails
        p1.showDetails();

        
    }
}
