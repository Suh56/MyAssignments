package frameassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortingcollection {
    public static void main(String[] args) {

        // Declare the String array
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

        // Add the collection to a list
        List<String> list = new ArrayList<>();
        for (String company : companies) {
            list.add(company);
        }

        // Arrange the collection in ascending order
        Collections.sort(list);

        // Iterate using reverse loop and print output
        System.out.println("Required Output:");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
