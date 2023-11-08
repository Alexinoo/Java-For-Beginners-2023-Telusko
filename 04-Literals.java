class Literals{
    public static void main(String [] args){

        /* 

        Literals - Literals are basically values
        
        Binary Integer: 
        =====================

        Base 2, whose digits consists of the numbers 0 and 1 (you can create binary literals in Java SE 7 and later). 
        Prefix 0b represents the Binary system. For example, 0b11010.

        Hexa-Decimal: 
        =====================

        The sequence of digits preceded by 0x or 0X is considered as hexadecimal integers. It may also include a character from a to f or A to F that represents numbers from 10 to 15, respectively. For example, 0xd, 0xf,

        Octal Integer:
        =====================
        
        It is a combination of number have digits from 0 to 7 with a leading 0. For example, 045, 026

        Real Literals :
        =====================

        The numbers that contain fractional parts are known as real literals. We can also represent real literals in exponent form. For example, 879.90, 99E-3, etc.

        Backslash Literals
        =====================

        Java supports some special backslash character literals known as backslash literals. They are used in formatted output. For example:

        \n: It is used for a new line

        \t: It is used for horizontal tab

        \b: It is used for blank space

        \v: It is used for vertical tab

        \a: It is used for a small beep

        \r: It is used for carriage return

        \': It is used for a single quote

        \": It is used for double quotes


        Real Literals :
        ==================
        The numbers that contain fractional parts are known as real literals. We can also represent real literals in exponent form. For example, 879.90, 99E-3, etc.


        String Literals
        ===================

        String literal is a sequence of characters that is enclosed between double quotes ("") marks. 
        It may be alphabet, numbers, special characters, blank space, etc. 
        For example, "Jack", "12345", "\n", etc.

        Character Literals
        ====================
        A character literal is expressed as a character or an escape sequence, enclosed in a single quote ('') mark. It is always a type of char. For example, 'a', '%', '\u000d', etc.

        Null Literals
        ====================

        Null literal is often used in programs as a marker to indicate that reference type object is unavailable. The value null may be assigned to any variable, except variables of primitive types.

        Floating Point Literals
        =========================

        The values that contain decimal are floating literals. In Java, float and double primitive types fall into floating-point literals. 
        Keep in mind while dealing with floating-point literals.
        
        Floating-point literals for float type end with F or f. For example, 6f, 8.354F, etc. It is a 32-bit float literal.

        Floating-point literals for double type end with D or d. It is optional to write D or d. For example, 6d, 8.354D, etc. It is a 64-bit double literal.

        It can also be represented in the form of the exponent.
        */

        //Integer
        
         int binVal  = 0b101;
         int hexVal = 0x1a;  
         int octVal = 067;  

        //  Float
        double doubleVal = 56;
        double expVal = 1.234e2;

        //  Character
        char c = 'a';
        c++;



         System.out.println("Binary Value : " +binVal);
         System.out.println("Hexadecimal Value : " +hexVal);
         System.out.println("Octal Value : " +octVal);

         System.out.println("-------------------------------");
         System.out.println("Double Value : " +doubleVal);
         System.out.println("Exponential Value : " +expVal);


         System.out.println("-------------------------------");
         System.out.println("Character Value : " +c);




    }
}