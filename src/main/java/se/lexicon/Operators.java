package se.lexicon;

public class Operators {
    public static void main (String[] args) {

        // Arithmetic operators
        int a = 10;
        int b = 3;

        System.out.println("\n" + "Arithmetic operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Using unary operators
        System.out.println("\n" + "Unary operators:");
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));

        // Assignment operators
        int f = 7;
        System.out.println("\n" + "Assignment operators:");
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));
        System.out.println("f &= 0b1010: " + (f &= 0b1010));
        System.out.println("f |= 0b1100: " + (f |= 0b1100));
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
        System.out.println("f <<= 2: " + (f <<= 2));
        System.out.println("f >>= 1: " + (f >>= 1));
        System.out.println("f >>>= 1: " + (f >>>= 1));

        // Comparison operators
        a = 10;
        b = 3;
        int c = 5;
        System.out.println("\n" + "Comparison operators:");

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));

        // Logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("\n" + "Logical operators:");

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // ternary operator.
        a = 20;
        b = 10;
        c = 30;
        int result;

        // result holds max of three
        // numbers
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("\n" + "Terniary operator:");
        System.out.println("Max of three numbers = " + result);

        // Bitwise operators
        int d = 0b1010;
        int e = 0b1100;
        System.out.println("\n" + "Bitwise operators:");
        System.out.println("d & e: " + (d & e));
        System.out.println("d | e: " + (d | e));
        System.out.println("d ^ e: " + (d ^ e));
        System.out.println("~d: " + (~d));
        System.out.println("d << 2: " + (d << 2));
        System.out.println("e >> 1: " + (e >> 1));
        System.out.println("e >>> 1: " + (e >>> 1));

        System.out.println("\n" + "Binary shift operators:");
        a = 10;

        // using left shift
        System.out.println("a<<1 : " + (a << 1));

        // using right shift
        System.out.println("a>>1 : " + (a >> 1));

        // Java program to illustrate instance of operator
        // See subclasses at bottom of File

        Person obj1 = new Person();
        Person obj2 = new Boy();
        System.out.println("\n" + "Instance relationships:");

        // As obj is of type person, it is not an
        // instance of Boy or interface
        System.out.println("obj1 instanceof Person: "
                + (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: "
                + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof MyInterface));

        // Since obj2 is of type boy,
        // whose parent class is person,
        // and it implements the interface Myinterface
        // it is instance of all of these classes
        System.out.println("obj2 instanceof Person: "
                + (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: "
                + (obj2 instanceof Boy));
        System.out.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof MyInterface));

        // precedence rules for arithmetic operators.
        // (* = / = %) > (+ = -)
        a = 20;
        b = 10;
        c = 0;
        d = 20;
        e = 40;
        f = 30;
        // prints a+(b/d)
        System.out.println("\n" + "Arithmetic precedence:");
        System.out.println("a+b/d = " + (a + b / d));

        // if same precedence then associative
        // rules are followed.
        // e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f)
        System.out.println("a+b*d-e/f = "
                + (a + b * d - e / f));

        System.out.println("\n" + "Compiling a=b+++c:");
        a = 20;
        b = 10;
        c = 0;

        // a=b+++c is compiled as
        // b++ +c
        // a=b+c then b=b+1
        a = b++ + c;
        System.out.println("Value of a(b+c), "
                + " b(b+1), c = " + a + ", " + b
                + ", " + c);

        // a=b+++++c is compiled as
        // b++ ++ +c
        // which gives error.
        // a=b+++++c;
        // System.out.println(b+++++c);


    }

}
class Person {
}

class Boy extends Person implements MyInterface {
}

interface MyInterface {
}
