// Program Name: Operators.java
// Description: Demonstrates different types of operators in Java.

public class Operators {
    public static void main(String[] args) {

        // ---------- Arithmetic Operators ----------
        int X = 10, Y = 2;
        System.out.println("The addition value: " + (X + Y));
        System.out.println("The subtraction value: " + (X - Y));
        System.out.println("The division value: " + (X / Y));
        System.out.println("The multiplication value: " + (X * Y));
        System.out.println("The modulus value: " + (X % Y));

        // ---------- Assignment Operators ----------
        int z = X;
        System.out.println("The value of z = " + z); // 10
        z += Y;  // equivalent to z = z + Y
        System.out.println("After z += Y, value of z = " + z); // 12

        // ---------- Relational Operators ----------
        System.out.println("Is X equal to Y? " + (X == Y)); // false
        System.out.println("Is X greater than Y? " + (X > Y)); // true
        System.out.println("Is X less than Y? " + (X < Y)); // false

        // ---------- Logical Operators ----------
        System.out.println("Logical AND (X > Y && Y < 5): " + (X > Y && Y < 5));
        System.out.println("Logical OR (X < Y || X == 10): " + (X < Y || X == 10));
        System.out.println("Logical NOT (!(X == Y)): " + (!(X == Y)));

        // ---------- Unary Operators ----------
        int d = 10;
        d++; // post increment
        System.out.println("After post increment, d = " + d);
        d--; // post decrement
        System.out.println("After post decrement, d = " + d);

        // ---------- Bitwise Operators ----------
        System.out.println("Bitwise AND (X & Y): " + (X & Y));
        System.out.println("Bitwise OR (X | Y): " + (X | Y));
        System.out.println("Bitwise XOR (X ^ Y): " + (X ^ Y));
    }
}
