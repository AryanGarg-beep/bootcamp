import java.util.Scanner;

public class AnalyzeMail {

    public static boolean validateEmail(String email) {
        int atPos = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        int dotPos = email.lastIndexOf('.');

        if (atPos == -1 || atPos != lastAt) return false;

        if (dotPos == -1 || dotPos < atPos) return false;

        if (atPos == 0) return false;

        if (dotPos == email.length() - 1) return false;

        return true;
    }


    public static String[] extractComponents(String email) {
        int atPos = email.indexOf('@');
        int dotPos = email.lastIndexOf('.');

        String username = email.substring(0, atPos);
        String domain = email.substring(atPos + 1);
        String domainName = email.substring(atPos + 1, dotPos);
        String extension = email.substring(dotPos + 1);

        return new String[]{username, domain, domainName, extension};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many emails do you want to enter? ");
        int n = input.nextInt();
        input.nextLine();

        String[] emails = new String[n];
        boolean[] valid = new boolean[n];
        String[] usernames = new String[n];
        String[] domains = new String[n];
        String[] domainNames = new String[n];
        String[] extensions = new String[n];

        int validCount = 0, invalidCount = 0;
        int totalUsernameLength = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter email " + (i + 1) + ": ");
            emails[i] = input.nextLine();

            if (validateEmail(emails[i])) {
                valid[i] = true;
                validCount++;

                String[] parts = extractComponents(emails[i]);
                usernames[i] = parts[0];
                domains[i] = parts[1];
                domainNames[i] = parts[2];
                extensions[i] = parts[3];

                totalUsernameLength += usernames[i].length();
            } else {
                valid[i] = false;
                invalidCount++;

                usernames[i] = domains[i] = domainNames[i] = extensions[i] = "-";
            }
        }

        String mostCommonDomain = "";
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (valid[i]) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (valid[j] && domains[i].equals(domains[j])) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    mostCommonDomain = domains[i];
                }
            }
        }


        double avgUsernameLength = (validCount > 0) ?
                (double) totalUsernameLength / validCount : 0;


        System.out.printf("%-25s %-15s %-20s %-15s %-10s %-10s%n",
                "Email", "Username", "Domain", "Domain Name", "Ext", "Valid?");
        System.out.println("-------------------------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-15s %-20s %-15s %-10s %-10s%n",
                    emails[i], usernames[i], domains[i], domainNames[i], extensions[i],
                    (valid[i] ? "Valid" : "Invalid"));
        }


        System.out.println("\n--- Analysis ---");
        System.out.println("Total valid emails   : " + validCount);
        System.out.println("Total invalid emails : " + invalidCount);
        System.out.println("Most common domain   : " + mostCommonDomain);
        System.out.println("Average username len : " + avgUsernameLength);

        input.close();
    }
}
