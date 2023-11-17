/* Naming Conventions in Java 
 * ==========================
 * 
 * In java, it is good practice to name class, variables, and methods name as what they are actually supposed to do instead of naming them randomly. 
 * 
 * Below are some naming conventions of the java programming language. They must be followed while developing software in java for good maintenance and readability of code. 
 * 
 * Java uses CamelCase as a practice for writing names of methods, variables, classes, packages, and constants. 
 * 
 * 
 * Type 1: Classes and Interfaces
 * ==============================
 * 
 * Class names should be nouns, in mixed cases with the first letter of each internal word capitalized. Interfaces names should also be capitalized just like class names.
 * 
 * Use whole words and must avoid acronyms and abbreviations.
 * 
 * Example
 * ========
 * 
     Classes: 
         class Student { }
         class Integer {}
         class Scanner {}

    Interfaces : 
             Runnable
             Remote
             Serializable 

 *
 * 
 * Type 2: Methods 
 * ================
 * 
 * Methods should be verbs, in mixed case with the first letter lowercase and with the first letter of each internal word capitalized.
 * 
   public static void main(String [] args)  {

   }
 *
 * As the name suggests the method is supposed to be primarily method which indeed it is as main() method in java is the method from where the program begins its execution.
 * 
 * Type 3: Variables
 * =================
 * 
 * Variable names should be short yet meaningful.
 * 
 * Variable names should not start with underscore _ or dollar sign $ characters, even though both are allowed.
 * 
 * Should be mnemonic i.e, designed to indicate to the casual observer the intent of its use.
 * 
 * One-character variable names should be avoided except for temporary variables.
 * 
 * Common names for temporary variables are i, j, k, m, and n for integers; c, d, and e for characters.
    int[] marks;
    double double answer,
 *
 * 
 * Type 4: Constant variables
 * ===========================
 * 
 * 
 * Should be all uppercase with words separated by underscores (“_”).
 * 
 * There are various constants used in predefined classes like Float, Long, String etc.
 * 
 * As the name suggests it should look like as we read it looks like it is fixed .
 * 
        PI, MAX_INT, MIN_INT
 *
 * 
 * Type 5: Packages
 * ================
 * 
 * The prefix of a unique package name is always written in all-lowercase ASCII letters and should be one of the top-level domain names, like com, edu, gov, mil, net, org.
 * 
 * Subsequent components of the package name vary according to an organization’s own internal naming conventions.
 
    java.util.Scanner ;
    java.io.*;
 *
 * As the name suggests in the first case we are trying to access the Scanner class from the java.util package and in other all classes(* standing for all) input-output classes making it so easy for another programmer to identify.
 * 
 * 
 * 
 * Note:
 * =========
 * 
 * For class and interfaces, the first letter has to be uppercase.
 * 
 * For method , variable, package_name, and constants, the first letter has to be lowercase.
 * 
 * 
 */


class Naming_conventions {
   public static void main(String[] args) {
    
   } 
}
