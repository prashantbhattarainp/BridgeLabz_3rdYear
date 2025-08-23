// Class VotingCheck determines if a person can vote based on age
import java.util.Scanner;

class VotingCheck {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input value for age
        System.out.print("Enter the person's age: ");
        int age = input.nextInt();

        // Check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
