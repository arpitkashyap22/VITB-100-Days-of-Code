package Day16;



import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ValidateRegexPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of test cases
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after the integer

        for (int i = 0; i < t; i++) {
            // Check if there is another line before trying to read it
            if (scanner.hasNextLine()) {
                // Input the regex pattern
                String pattern = scanner.nextLine();

                // Check if the syntax is valid
                try {
                    Pattern.compile(pattern);
                    System.out.println("Valid");
                } catch (PatternSyntaxException e) {
                    System.out.println("Invalid");
                }
            } else {
                System.out.println("Invalid");
            }
        }

        scanner.close();
    }
}
