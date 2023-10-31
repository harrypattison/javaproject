1) ATM Program in Java
Introduction:
This article explains the code for an ATM program implemented in Java. The program simulates an ATM machine that allows users to check their account balance, make deposits, and withdraw money. It uses the concept of classes and objects to model a bank account and an ATM machine.

Key Concepts :
    Classes and Objects: The code defines two classes - BankAccount and ATM. The BankAccount class represents a user's bank account and contains methods to deposit and withdraw money. The ATM class represents the ATM machine and provides methods to interact with the bank account.
    Encapsulation: The BankAccount class encapsulates the balance variable and provides getter and setter methods to access and modify it. This ensures data integrity and prevents direct access to the balance from outside the class.
    User Input: The code uses the Scanner class to read user input from the console. It prompts the user for their choice and the amount to deposit or withdraw.

Code Structure:
The code consists of two classes - BankAccount and ATM. The BankAccount class has private instance variables for the balance and methods to get the balance, deposit money, and withdraw money. The ATM class has an instance variable of type BankAccount and methods to check the balance, deposit money, withdraw money, and the main method to run the ATM program.

Conclusion:
The provided code demonstrates the implementation of an ATM program in Java. It showcases the use of classes, objects, encapsulation, and user input handling. By understanding this code, you can gain insights into how to create a basic ATM system and expand upon it to add more features and functionality.

2) Grade Calculator :

Introduction:
The Grade Calculator is a Java program that allows users to calculate their average percentage and corresponding grade based on the marks obtained in a given number of subjects. This program is useful for students or teachers who want to quickly determine their overall performance.

Key Concepts:
    Scanner: The Scanner class is used to read user input from the console. It provides various methods to read different types of data, such as integers and doubles.
    Looping: The program uses a for loop to iterate over each subject and prompt the user to enter the marks obtained. The loop continues until the desired number of subjects is reached.
    Calculating Average Percentage: The program calculates the average percentage by dividing the total marks obtained by the product of the number of subjects and the maximum marks per subject (100). The result is then multiplied by 100 to get the percentage.
    Grading System: The program uses a grading system to assign a grade based on the average percentage. The grading system in this program is as follows:
        A+: 90% and above
        A: 80% - 89%
        B: 70% - 79%
        C: 60% - 69%
        D: 50% - 59%
        F: Below 50%

Code Structure:
The code is structured as follows:
    Import the Scanner class from the java.util package.
    Define the GradeCalculator class.
    Define the main method, which is the entry point of the program.
    Create a new instance of the Scanner class to read user input.
    Prompt the user to enter the number of subjects.
    Initialize a variable totalMarks to keep track of the sum of marks obtained.
    Use a for loop to iterate over each subject.
    Prompt the user to enter the marks obtained in each subject and add them to totalMarks.
    Calculate the average percentage by dividing totalMarks by the product of numSubjects and 100, and then multiplying by 100.
    Print the total marks and average percentage.
    Call the calculateGrade method to determine the grade based on the average percentage.
    Print the grade.

Conclusion:
The Grade Calculator program is a useful tool for calculating the average percentage and grade based on the marks obtained in a given number of subjects. By following the prompts and entering the marks, users can quickly determine their overall performance. This program demonstrates the use of the Scanner class, looping, and conditional statements in Java.

3) Number Guessing Game :
Introduction:
The Number Guessing Game is a simple Java program that allows users to guess a randomly generated number within a specified range. The program provides feedback to the user, indicating whether their guess is too high or too low. The game continues until the user either guesses the correct number or runs out of attempts.

Key Concept :
    Random Number Generation: The program uses the Random class from the java.util package to generate a random number within the specified range. The nextInt() method is used to generate a random integer.
    User Input: The program uses the Scanner class from the java.util package to read user input from the console. The nextInt() method is used to read an integer input from the user.
    Looping: The program uses a while loop to allow the user to play the game multiple times. The loop continues until the user chooses not to play again.
    Conditional Statements: The program uses if-else statements to check if the user's guess is correct and provide appropriate feedback.

Code Structure:
The code is structured as follows:
    Import necessary classes from the java.util package.
    Define the NumberGuessingGame class.
    Declare and initialize variables for the lower and upper bounds of the number range, the number to guess, the maximum number of attempts, and the user's score.
    Print a welcome message and the range of numbers.
    Use a while loop to allow the user to play the game multiple times.
    Generate a random number within the range.
    Use another while loop to prompt the user for their guess and provide feedback.
    Check if the user's guess is correct and update the score if necessary.
    Check if the user has run out of attempts and reveal the correct number if necessary.
    Ask the user if they want to play again and update the playAgain variable accordingly.
    Print the user's score and a thank you message.

Conclusion:
The Number Guessing Game is a fun and interactive Java program that allows users to test their guessing skills. By using random number generation, user input, looping, and conditional statements, the program provides an engaging experience for players. Feel free to modify the code and add your own features to enhance the game further. Happy coding!

4) Student Management System
Introduction:
The Student Management System is a Java program that allows users to manage student information. It provides options to add students, remove students, search for students, and display all students. The program uses classes and methods to organize and manipulate student data.

Key Concepts:
    Classes: The program defines two classes: Student and StudentManagementSystem. The Student class represents a student with attributes such as name, roll number, and grade. The StudentManagementSystem class manages a list of students and provides methods to add, remove, search, and display students.
    List: The StudentManagementSystem class uses an ArrayList to store the list of students. The ArrayList provides dynamic resizing and convenient methods for adding and removing elements.
    User Input: The program uses the Scanner class to read user input from the console. It prompts the user for options and student information, and performs actions based on the user's choices.
    Switch Statement: The program uses a switch statement to handle different options selected by the user. Each option corresponds to a specific action, such as adding a student or searching for a student.

Code Structure:
The code is structured into two classes: Student and StudentManagementSystem. The Student class represents a student with attributes and methods to access and manipulate the student's information. The StudentManagementSystem class manages a list of students and provides methods to add, remove, search, and display students. The main method is located in the StudentManagementSystem class and serves as the entry point of the program.

Conclusion:
The Student Management System is a Java program that allows users to manage student information. It provides options to add, remove, search, and display students. The program uses classes, lists, user input, and a switch statement to organize and manipulate student data. By understanding the code structure and examples provided, you can easily customize and extend the functionality of the Student Management System to suit your specific needs.
