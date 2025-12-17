import java.security.SecureRandom;

public class PasswordGenerator {
    public String buildCharacterPool(boolean digits, boolean symbols) {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numerals = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+[]{};:,.<>?/\\|";

        StringBuilder charArchive = new StringBuilder();

        // "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
        charArchive.append(upperCase);
        charArchive.append(lowerCase);

        if (digits) charArchive.append(numerals);
        if (symbols) charArchive.append(specialCharacters);

        return charArchive.toString();
    }

    public String generatePassword(String characterPool, int passwordLength, SecureRandom random) {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < passwordLength; i++) {
            int charIndex = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(charIndex));
        }

        return password.toString();
    }
}
