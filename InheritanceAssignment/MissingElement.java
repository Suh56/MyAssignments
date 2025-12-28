package InheritanceAssignment;

public class MissingElement {
    public static void main(String[] args) {
        // Given array
        int arr[] = {1, 4, 3, 2, 8, 6, 7};
        
        // Find the length of array + 1 for total numbers including missing
        int n = arr.length + 1;
        
        // Calculate expected sum of 1 to n numbers
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate actual sum of array elements
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        
        // Missing number = expectedSum - actualSum
        int missingNumber = expectedSum - actualSum;
        
        // Print the missing number
        System.out.println("Missing Number is: " + missingNumber);
    }
}
