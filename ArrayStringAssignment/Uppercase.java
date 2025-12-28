package ArrayStringAssignment;

public class Uppercase {

    public static void main(String[] args) {

        String test = "changeme";

        // Convert the String to a character array
        char[] charArray = test.toCharArray();

        // Loop from end to start
        for (int i = charArray.length - 1; i >= 0; i--) {

            // Check if index is odd
            if (i % 2 != 0) {

                // Change character to uppercase
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        // Print the result
        for (char c : charArray) {
            System.out.print(c);
        }
    }
}
