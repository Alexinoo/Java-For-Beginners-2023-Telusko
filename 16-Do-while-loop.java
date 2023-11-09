 class Do_while {
    public static void main(String[] args) {

        //  The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:

        int i = 5;

        do {
            System.out.println(i);
            i++;
        }while (i < 4);
   }
}
