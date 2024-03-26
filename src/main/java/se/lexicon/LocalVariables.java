package se.lexicon;

// Run each class separately

public class LocalVariables {

    public static void main(String[] args)
    {
        // Declared a Local Variable
        int var = 10;

        // This variable is local to this main method only
        System.out.println("\nLocal Variable: " + var);

        System.out.println("\n" +"More local variables: ");
        // x is a local variable
        int x = 10;

        // message is also a local
        // variable
        String message = "Hello, world!";

        System.out.println("x = " + x);
        System.out.println("message = " + message);

        if (x > 5) {
            // result is a
            // local variable
            String result = "x is greater than 5";
            System.out.println(result);
        }

        // Uncommenting the line below will result in a
        // compile-time error System.out.println(result);

        for (int i = 0; i < 3; i++) {
            String loopMessage
                    = "Iteration "
                    + i; // loopMessage is a local variable
            System.out.println(loopMessage);
        }

        // Uncommenting the line below will result in a
        // compile-time error
        // System.out.println(loopMessage);

    }
}

class GFG {

    // Declared Instance Variable
    public String geek;
    public int i;
    public Integer I;
    public GFG()
    {
        // Default Constructor
        // initializing Instance Variable
        this.geek = "Shubham Jain";
    }
    public static String geek2 = "Thomas Sjövy";

    // Main Method
    public static void main(String[] args)
    {
        // Object Creation
        GFG name = new GFG();

        // Displaying O/P
        System.out.println("Geek name is: " + name.geek);
        System.out.println("Default value for int is "
                + name.i);

        // toString() called internally
        System.out.println("Default value for Integer is "
                + name.I);

        System.out.println("Geek2 Name is : " + GFG.geek2);
    }
}


