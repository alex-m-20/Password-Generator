import java.util.Scanner;

public class PasswordConfig {

    private Scanner scanner; // we first declare a scanner variable.

    // This constructor creates the scanner.
    public PasswordConfig() {
        this.scanner = new Scanner(System.in);
    }

    public int passwordLength() {

        System.out.print("Desired password length (5-40): ");

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.print("\nInvalid entry, please try again: ");
                scanner.next();  // skip invalid input
                continue;
            }

            int length = scanner.nextInt();
            if (length >= 5 && length <= 40) {
                return length;
            }
            System.out.print("\nInvalid range. Password should be between 5 to 40 characters.\n  Please try again: ");
        }
    }

    public boolean passwordOptions(String prompt) {
        String userInput = readPasswordOptions(prompt);

        while (!userInput.equals("y") && !userInput.equals("n")) {
            userInput = readPasswordOptions("\nInvalid choice. Reply with a 'Y' for YES or 'N' for NO." +
                    "\n" + "Please try again: ");
        }
        return userInput.equals("y");
    }

    public String readPasswordOptions(String prompt) {
        System.out.print(prompt);
        return scanner.next().trim().toLowerCase();
    }
}


/*
After refactoring the code, I converted the methods to instance methods mainly for encapsulation, thereby hiding all
the implementation details
*/