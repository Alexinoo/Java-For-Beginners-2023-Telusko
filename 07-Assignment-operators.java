class Assignment_operators {
    public static void main(String[] args) {
        /*
         * Java Assignment Operators
         * A list of all assignment operators:

            Operator	    Example	    Same As	
                =	        x = 5	    x = 5	
                +=	        x += 3	    x = x + 3	
                -=	        x -= 3	    x = x - 3	
                *=	        x *= 3	    x = x * 3	
                /=	        x /= 3	    x = x / 3	
                %=	        x %= 3	    x = x % 3	
                &=	        x &= 3	    x = x & 3	
                |=	        x |= 3	    x = x | 3	
                ^=	        x ^= 3	    x = x ^ 3	
                >>=	        x >>= 3	    x = x >> 3	
                <<=	        x <<= 3	    x = x << 3
        */

        int sum = 10;
        sum += 5;      //sum = sum + 5

        int difference = 10;
        difference -= 5;      //difference = difference - 5

        int product = 10;
        product *= 5;      //product = product * 5

        int quotient = 10;
        quotient /= 5;      //quotient = quotient / 5

        int modulus = 10;
        modulus %= 5;      //modulus = modulus % 5


        double base = 10;
        int exp = 5;
        double power  = Math.pow(base, exp);

        System.out.println("Sum : "+sum);
        System.out.println("Difference : "+difference);
        System.out.println("Product : "+product);
        System.out.println("Quotient : "+quotient);
        System.out.println("Modulus : "+modulus);
        System.out.println("Power : "+power);

    }
}
