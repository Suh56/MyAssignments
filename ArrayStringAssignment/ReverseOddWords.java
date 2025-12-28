package ArrayStringAssignment;

public class ReverseOddWords {

    public static void main(String[] args) {

        String test = "I am a software tester";

        // Split the string into words
        String[] words = test.split(" ");

        // Loop through each word
        for (int i = 0; i < words.length; i++) {

            // Check for odd index
            if (i % 2 != 0) {

                // Convert String to character array
                char[] charArray = words[i].toCharArray();

                // Reverse the character array
                for (int j = charArray.length - 1; j >= 0; j--) {
                    System.out.print(charArray[j]);
                }
            } 
            else {
                // Print even position words
                System.out.print(words[i]);
            }

            // Print space after each word
            System.out.print(" ");
        }
    }
}
