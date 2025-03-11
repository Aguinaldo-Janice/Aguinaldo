public class Main {
    public static void main(String[] args) {
        // Declare and initialize an array with new values
        int[] scores = {5, 15, 25, 35, 45};

        // Printing array elements
        System.out.println("Array Elements:");
        for (int index = 0; index < scores.length; index++) {
            System.out.println(scores[index]);
        }

        // Updating an element in the array
        scores[2] = 88; // Changing the third element
        System.out.println("Updated Third Element: " + scores[2]);
    }
}

