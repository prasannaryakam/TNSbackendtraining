// Program Name: ConditionalStms.java
// Description: Demonstrates conditional statements and the ternary operator in Java.

public class Conditionalstmts {
    public static void main(String[] args) {

        // ---------- Conditional Statements ----------
        int x = 10;
        int y = 15;
        int z = 20;

        // if-else if-else ladder
        if (x < y) {
            System.out.println("x is less than y");
        } 
        else if (z > y) {
            System.out.println("z is greater than y");
        } 
        else if (y < z) {
            System.out.println("y is less than z");
        } 
        else {
            System.out.println("None of the conditions are true");
        }

        // ---------- Ternary Operator ----------
        int score = 85;
        String grade = (score >= 50) ? "Pass" : "Fail";
        System.out.println("Result: " + grade);
    }
}

