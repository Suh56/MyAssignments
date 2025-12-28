package ArrayStringAssignment;

public class RemoveDuplicateWord {

    public static void main(String[] args) {

        String text = "We learn Java basics as part of java sessions in java week1";

        // Initialize count variable
        int count = 0;

        // Split the string into words
        String[] words = text.split(" ");

        // Compare each word with every other word
        for (int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {

                // Check for duplicate words (case-insensitive)
                if (words[i].equalsIgnoreCase(words[j])) {

                    // Replace duplicate word with empty string
                    words[j] = "";
                    count++;
                }
            }
        }

        // If duplicates are found, print the result
        if (count > 0) {
            for (String word : words) {
                if (!word.equals("")) {
                    System.out.print(word + " ");
                }
            }
        }
    }
}
