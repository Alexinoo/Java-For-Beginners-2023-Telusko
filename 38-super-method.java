 /*
     * super() method in Java
     * ==================================
     * 
     * In java, super() is used to call Base class’s(Parent class’s) constructor. 
     * 
     * Every constructor has a super() method that is invisible but called behind the scenes to invoke it's parent class constructor
     * 
     * That means even if we don't define it, it will be created behind the scenes to invoke it's parent class constructor
     * 
     * However, it will always invoke the default constructor of the parent class if we don't pass any parameters to the super() in the sub classes
     * 
     * 
     * If we pass params to the super() of the sub classes, the it will invoke parameterized constructor of it's parent/Base class.
     * 
     * Example
     * 
     * Child defaultConst = new Child();
     * ==================================
     * 
     * This will invoke the default constructor of the Child class which then calls super() of the parent class that automatically invoke default constructor of the Parent class
     * 
     * Child paraConst = new Child(5);
     * ==================================
     * 
     * This will invoke the parameterized constructor of the Child class which then calls super(5) of the parent class that automatically invoke parameterized constructor of the Parent class     *      
     * 
     */

 class Parent extends Object{
      public Parent(){ 
        super();       
        System.out.println(" [Parent] Default constructor called..");
    }
      public Parent(int value){ 
        super();       
        System.out.println(" [Parent] Parameterized constructor called..");
    }
}

 class Child extends Parent {
    public Child(){
        super();
       System.out.println(" [Child] Default constructor called..");
    }
    public Child(int value){
        super(value);
       System.out.println(" [Child] Parameterized constructor called..");
    }
}

class Geek {   

    public static void main(String[] args) {  

        Child defaultConst = new Child(); 
        Child paraConst = new Child(5);
    }
}
