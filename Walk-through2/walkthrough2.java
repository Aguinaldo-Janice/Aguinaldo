import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // If-Else Example
        System.out.print("Enter your age: ");
        int userAge = inputScanner.nextInt();
        
        if (userAge >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // Loop Example - Printing numbers 1 to 5
        System.out.println("Counting from 1 to 5:");
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println("Number: " + counter);
        }

        inputScanner.close();
    }
}
