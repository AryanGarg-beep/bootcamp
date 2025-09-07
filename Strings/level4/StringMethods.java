import java.util.Scanner; 
 
public class StringMethods{ 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        // TODO: Ask user for their full name (first and last name) 
        // TODO: Ask user for their favorite programming language 
        // TODO: Ask user for a sentence about their programming experience 
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your favorite programming language: ");
        String favlang = scanner.nextLine();
        System.out.print("Enter a sentence about your programming experience: ");
        String exp = scanner.nextLine();
         
        // TODO: Process the input: 
        // 1. Extract first and last name separately 
        // 2. Count total characters in the sentence (excluding spaces) 
        // 3. Convert programming language to uppercase 
        // 4. Display a formatted summary 
        String[] nameParts = name.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1]; 
        int charCount = exp.replace(" ", "").length();
        String upperFavLang = favlang.toUpperCase();    
        System.out.println("\nSummary:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Favorite Programming Language: " + upperFavLang);
        System.out.println("Programming Experience: " + exp);
        System.out.println("Total Characters in Experience (excluding spaces): " + charCount);

         
        scanner.close(); 
    } 
} 