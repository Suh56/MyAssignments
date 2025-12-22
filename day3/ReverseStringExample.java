package week2.day3;

public class ReverseStringExample {
    public static void main(String[] args) {

        String companyName = "TestLeaf";
        String str1 = "";
        for (int i = companyName.length() - 1; i >= 0; i--) {
            str1=str1+companyName.charAt(i);
            
        }
        System.out.print(str1);
    }
}
