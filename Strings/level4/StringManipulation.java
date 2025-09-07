public class StringManipulation{ 
    public static void main(String[] args) { 
        // TODO: Create the same string "Java Programming" using 3 different methods: 
        // 1. String literal 
        // 2. new String() constructor 
        // 3. Character array 
        String st1 = "java";
        String st2 = new String("java");
        char[] charArray = {'j', 'a', 'v', 'a'};
         
        // TODO: Compare the strings using == and .equals() 
        // Print the results and explain the difference 

        boolean isEqualUsingEquals = st1.equals(st2);
        boolean isEqualUsingDoubleEquals = (st1 == st2);
        System.out.println("Using equals(): " + isEqualUsingEquals); 
        System.out.println("Using ==: " + isEqualUsingDoubleEquals); 
         
        // TODO: Create a string with escape sequences that displays: 
        // Programming Quote: 
        //     "Code is poetry" - Unknown 
        //     Path: C:\Java\Projects 
        String quote = "Programming Quote:\n\t\"Code is poetry\" - Unknown\n\tPath: C:\\Java\\Projects";
        System.out.println(quote);
    } 
}