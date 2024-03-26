package se.lexicon;

import java.util.ArrayList;

public class Wrappers {
}

class Autoboxing {
    public static void main(String[] args)
    {
        char ch = 'a';

        // Autoboxing- primitive to Character object conversion
        Character a = ch;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Autoboxing because ArrayList stores only objects
        arrayList.add(25);

        // printing the values from object
        System.out.println(arrayList.get(0));
    }
}

class Unboxing {
    public static void main(String[] args)
    {
        Character ch = 'a';

        // unboxing - Character object to primitive conversion
        char a = ch;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(24);
        arrayList.add(26);

        // unboxing because get method returns an Integer object
        int num = arrayList.get(1);

        // printing the values from primitive data types
        System.out.println(num);
    }
}

class GFG1 {
    public static void main(String[] args)
    {
        // byte data type
        byte a = 1;

        // wrapping around Byte object
        Byte byteobj = new Byte(a);
        // Use with Java 9
        // Byte byteobj = Byte.valueOf(a);

        // int data type
        int b = 10;

        // wrapping around Integer object
        Integer intobj = new Integer(b);
        // Use with Java 9
        // Integer intobj = Integer.valueOf(b);

        // float data type
        float c = 18.6f;

        // wrapping around Float object
        Float floatobj = new Float(c);
        // Use with Java 9
        // Float floatobj = Float.valueOf(c);

        // double data type
        double d = 250.5;

        // Wrapping around Double object
        Double doubleobj = new Double(d);
        // Use with Java 9
        // Double doubleobj = Double.valueOf(d);

        // char data type
        char e = 'a';

        // wrapping around Character object
        Character charobj = e;

        // printing the values from objects
        System.out.println(
                "Values of Wrapper objects (printing as objects)");
        System.out.println("\nByte object byteobj: "
                + byteobj);
        System.out.println("\nInteger object intobj: "
                + intobj);
        System.out.println("\nFloat object floatobj: "
                + floatobj);
        System.out.println("\nDouble object doubleobj: "
                + doubleobj);
        System.out.println("\nCharacter object charobj: "
                + charobj);

        // objects to data types (retrieving data types from
        // objects) unwrapping objects to primitive data
        // types
        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;

        // printing the values from data types
        System.out.println(
                "\nUnwrapped values (printing as data types)");
        System.out.println("\nbyte value, bv: " + bv);
        System.out.println("\nint value, iv: " + iv);
        System.out.println("\nfloat value, fv: " + fv);
        System.out.println("\ndouble value, dv: " + dv);
        System.out.println("\nchar value, cv: " + cv);
    }
}

class Maximum {
    private int maxi = 0;
    private int size = 0;

    public void insert(int x)
    {
        this.size++;
        if (x <= this.maxi)
            return;
        this.maxi = x;
    }

    public int top() { return this.maxi; }

    public int elementNumber() { return this.size; }
};

//
class GFG2 {
    public static void main(String[] args)
    {
        Maximum x = new Maximum();
        x.insert(12);
        x.insert(3);
        x.insert(23);

        System.out.println("Maximum element: " + x.top());
        System.out.println("Number of elements inserted: "
                + x.elementNumber());
    }
}