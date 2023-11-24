package second_package;
import first_package.Geek;

// This class is having default access modifier  
class GeekDefault  
{  
    public static void main(String args[])  
    {  
        // Accessing class Geek from package p1  
        Geek obj = new Geek();
        obj.display();  
    }  
}  