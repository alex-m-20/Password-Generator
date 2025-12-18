## Password-Generator
This project is a Java Console Application to generate random passwords based on user preferences.

## Introduction
I built this project to practice Java and apply concepts from object-oriented programming in a practical way. The idea came from everyday conversations about online security and the importance of strong, 
unique passwords. I wanted a tool that could quickly generate secure passwords without unnecessary complexity and to explore design principles such as separation of concerns, encapsulation and secure randomness.

The application is kept deliberately simple whereby it runs in the console, asks the user for their preferences and produces a password that is both customizable and secure. 

## Functionalities
1. **Generating a Password**  
   - The user specifies the desired length of the password (validated to be between 5 and 40 characters).  
   - The user answers either with a "Y" for yes or "N" for no to whether digits and special characters should be included.  
   - A character pool is built based on these choices combining uppercase letters, lowercase letter, and optionally digits and symbols.  
   - Random characters are selected from this pool using `SecureRandom` and combined to form the password.  
   - The generated password is displayed on the console.  

2. **Input Validation**  
   - The program accepts only integers for password length and enforces the 5–40 range.  
   - For options, only single-character responses (`y` or `n`) are accepted.  
   - Invalid inputs trigger clear prompts until the user provides valid entries.  

3. **Multiple Passwords**  
   - After generating a password, the user can choose to create another one or exit the program.  
   - This loop continues until the user decides to stop, making the tool flexible for repeated use.  

## Future Work
- **Having a Graphical User Interface (GUI):** Replace console prompts with buttons or sliders for easier interaction.  
- **Password Strength Indicator:** Provide immediate feedback on the strength of generated passwords.  
- **Excluding certain characters:** Automatically omit visually confusing characters such as `O`, `0`, `I`, and `l`.  
