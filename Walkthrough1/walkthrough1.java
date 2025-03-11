import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Variable Declaration
        int age = 25;
        double price = 99.99;
        char grade = 'A';
        boolean isPassed = true;

        
        System.out.println("Age: " + age);
        System.out.println("Price: $" + price);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);

       
        String message = "hello\nden mark";
        System.out.println("Message: " + message);
        System.out.println("Message Length: " + message.length());

        
        LocalDate currentDate = LocalDate.now();
        System.out.println("Today's Date: " + currentDate);
    }
}

