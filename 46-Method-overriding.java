 /* Overriding in Java
       ==================
     * 
     * In Java, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
     * 
     * 
     * When a method in a subclass has the same name, the same parameters or signature, and the same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.
     * 
     * In simple terms, method overriding is a scenario where two methods exist with the same name in both the Super and sub class but implemented differently in the child class
     * 
     * It is said to override the super class method
     */

class Parent {
    public void show(){
        System.out.println("Parent Show() called");
    }
}
class Child extends Parent {
    public void show(){
        System.out.println("Child Show() called");
    }
}


class Geek {

     public static void main(String[] args) {

        Child obj = new Child();
        obj.show();
        
     }
    
}
