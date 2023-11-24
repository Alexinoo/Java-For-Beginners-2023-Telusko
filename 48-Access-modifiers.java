
    /* Access Modifiers in Java
       ========================
     * 
     * Access modifiers help to restrict the scope of a class, constructor, variable, method, or data member. It provides security, accessibility, etc to the user depending upon the access modifier used with the element.
     * 
     * Types of Access Modifiers in Java
     * ===================================
     * 
     * There are four types of access modifiers available in Java: 

        > Default – No keyword required
        > Private
        > Protected
        > Public

     * 1. Default Access Modifier
     * ==========================
     * 
     * When no access modifier is specified for a class, method, or data member – It is said to be having the default access modifier by default. The data members, classes, or methods that are not declared using any access modifiers i.e. having default access modifiers are accessible only within the same package.
     * 
     * 
     * 2. Private Access Modifier
     * ==========================
     * 
     * The private access modifier is specified using the keyword private. The methods or data members declared as private are accessible only within the class in which they are declared.
          
        > Any other class of the same package will not be able to access these members.

        > Top-level classes or interfaces can not be declared as private because
            - private means 'only visible within the enclosing class'.
            - protected means 'only visible within the enclosing class and any subclasses'
     * Hence these modifiers in terms of application to classes, apply only to nested classes and not on top-level classes
     * 
     * In this example, we will create two classes A and B within the same package p1. We will declare a method in class A as private and try to access this method from class B and see the result. (Refer to second_package.GeekPrivate.java)
     * 
     * 
     * 3. Protected Access Modifier
     * ============================
     * 
     * The protected access modifier is specified using the keyword protected.
     * 
     * The methods or data members declared as protected are accessible within the same package or subclasses in different packages.
     * 
     * In this example, we will create two packages p1 and p2. Class A in p1 is made public, to access it in p2. 
     * 
     * The method display in class A is protected and class B is inherited from class A and this protected method is then accessed by creating an object of class B.
     * 
     * 
     * 4. Public Access modifier
     * =========================
     * 
     * The public access modifier is specified using the keyword public. 
     * 
     * The public access modifier has the widest scope among all other access modifiers.
     * 
     * Classes, methods, or data members that are declared as public are accessible from everywhere in the program. There is no restriction on the scope of public data members.
     * 
     * 
     * 
     Important Points:
     ===================

        >   If other programmers use your class, try to use the most restrictive access level that makes sense for a particular member. Use private unless you have a good reason not to.

        >   Avoid public fields except for constants.

     * Check first_package and second _package folder for more examples
     * 
     
                            Public      Private     Protected       Default     
        
        Same Class          Yes         Yes

        Same Package        Yes         No
        subclass

        Same Package
        non-subclass        Yes         No

        Different package
        subclass            Yes         No

        Different package
        non subclass        Yes         No




     */

class Geek {
    public static void main(String[] args) {      
        
    }
    
}
