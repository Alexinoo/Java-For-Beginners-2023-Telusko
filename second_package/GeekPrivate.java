package second_package;

class A  
{  
private void display()  
    {  
        System.out.println("GeeksforGeeks");  
    }  
}  

public class GeekPrivate {
    public static void main(String args[])  
    {  
        A obj = new A();  
        // Trying to access private method 
        // of another class  
        // obj.display();  
    }  
}

/*
  Output:

    error: display() has private access in A
            obj.display();
 */
