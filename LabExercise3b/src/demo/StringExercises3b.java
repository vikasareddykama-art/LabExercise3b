package demo;

//3b. String Exercise Programs (Q1–Q5)

public class StringExercises3b {

 public static void main(String[] args) {

     String str1 = "   ";
     String str2 = "hello world hello";
     String str3 = "Java";
     String str4 = "Madam";
     String str5 = "Hello World";

     // Q1
     System.out.println("Q1: isNullOrEmpty -> " + isNullOrEmpty(str1));

     // Q2
     System.out.println("Q2: countOccurrences -> " + countOccurrences(str2, "hello"));

     // Q3
     System.out.println("Q3: reverseString -> " + reverseString(str3));

     // Q4
     System.out.println("Q4: isPalindrome -> " + isPalindrome(str4));

     // Q5
     System.out.println("Q5: removeWhitespace -> " + removeWhitespace(str5));
 }

 // Q1: Check null or only whitespace
 public static boolean isNullOrEmpty(String str) {
     return (str == null || str.trim().isEmpty());
 }

 // Q2: Count substring occurrences
 public static int countOccurrences(String mainStr, String subStr) {
     int count = 0;
     int index = 0;

     while ((index = mainStr.indexOf(subStr, index)) != -1) {
         count++;
         index += subStr.length();
     }
     return count;
 }

 // Q3: Reverse string
 public static String reverseString(String str) {
     return new StringBuilder(str).reverse().toString();
 }

 // Q4: Check palindrome (ignore case)
 public static boolean isPalindrome(String str) {
     String cleaned = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
     String reversed = new StringBuilder(cleaned).reverse().toString();
     return cleaned.equals(reversed);
 }

 // Q5: Remove all whitespace
 public static String removeWhitespace(String str) {
     return str.replaceAll("\\s", "");
 }
}