import java.util.Scanner;
public class StringArrays { 
     
    // TODO: Create a method that takes a string array of names 
    // and returns the longest name 
    public static String findLongestName(String[] names) { 
        String longestName = "";
        for(String name : names){
            if(name.length() > longestName.length()){
                longestName = name;
            }
        }
        return longestName;
    } 
     
    // TODO: Create a method that counts how many names 
    // start with a given letter (case-insensitive) 
    public static int countNamesStartingWith(String[] names, char letter) { 
        
        int count = 0;
        for(String name : names) {
            if(name.toLowerCase().charAt(0) == Character.toLowerCase(letter)) {
                count++;
            }
        }
        return count;
    } 
 
     
    // TODO: Create a method that formats all names to "Last, First" format 
    // Assume names are given as "First Last" 
    public static String[] formatNames(String[] names) { 
        for(int i = 0; i < names.length; i++) {
            String[] parts = names[i].split(" ");
            if(parts.length == 2) {
                names[i] = parts[1] + ", " + parts[0];
            }
        }
        return names;
    } 
     
    public static void main(String[] args) { 

        String[] students = {"John Smith", "Alice Johnson", "Aobunia Arownnnnn", "Carol Davis", "David Wilson"}; 
        Scanner input = new Scanner(System.in);
        
         
        // TODO: Test all your methods and display results 
        String longest = findLongestName(students);
        System.out.println("Longest Name: " + longest);

        System.out.print("\nEnter a letter to count names starting with it: ");
        char letter = input.next().charAt(0);
        int countA = countNamesStartingWith(students, letter);
        System.out.println("Names starting with "+letter+": " + countA);

        String[] formattedNames = formatNames(students);
        System.out.println("\nFormatted Names:");
        for(String name : formattedNames) {
            System.out.println(name);
        }
    }
}