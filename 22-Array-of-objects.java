/**
 * Student Class
 * Helper class
 */
class Student {

    int rollNo;
    String name;
    int marks;
}

/*
 * Main class
 */

class Array_of_objects {
    
    public static void main(String[] args) {
        
        // Student 1
        Student s1 = new Student();        
        s1.rollNo = 1;
        s1.name = "Bob";
        s1.marks = 90;

        // Student 2
        Student s2 = new Student();        
        s2.rollNo = 2;
        s2.name = "Anna";
        s2.marks = 94;

        // Student 3
        Student s3 = new Student();        
        s3.rollNo = 3;
        s3.name = "Suzy";
        s3.marks = 80;


        // Create an Array that can hold 3 objects (students s1,s2,s3)

        /* 

        ////////// LONG WAY /////////////////////////////////
        
         Student students[] = new Student[3];
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        */

        // //////////////////SHORTHAND //////////////////////
         Student students[] = { s1,s2,s3 };
        

        // Loop
        System.out.println("======= Normal For Loop ===============");

        for (int index = 0; index < students.length; index++) {
            
            System.out.println("Roll no : "+students[index].rollNo );
            System.out.println("Names : "+students[index].name);
            System.out.println("Marks : "+students[index].marks);
            System.out.println("===============================");
        }

        // Enhanced For Loop
         System.out.println("//////////// Enhanced For Loop //////////////");

         for (Student stud : students) {

            System.out.println("Roll no : "+stud.rollNo );
            System.out.println("Names : "+stud.name);
            System.out.println("Marks : "+stud.marks);
            System.out.println("===============================");
         }
    }
}
