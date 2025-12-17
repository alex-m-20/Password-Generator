import java.security.SecureRandom;

public class Main {

    public static void main(String[] args) {
        var config = new PasswordConfig();
        var generator = new PasswordGenerator();
        SecureRandom random = new SecureRandom();

        while (true) {

            System.out.println("PASSWORD GENERATOR \n");

            int passwordLength = config.passwordLength();

            boolean includeDigits =  config.passwordOptions("Would you like to have numbers in the combination? (y/n): ");
            boolean includeSymbols = config.passwordOptions("What about special characters? (y/n): ");

            String characterPool = generator.buildCharacterPool(includeDigits, includeSymbols);

            String password = generator.generatePassword(characterPool, passwordLength, random);

            System.out.print("\n" + "PASSWORD: ");
            System.out.println(password + "\n");

            if (!config.passwordOptions("Would you like another password? (y/n): ")) {
                System.out.println("\n\n" + "Thank you for using our services, goodbye!");
                break;
            }
        }
    }
}




