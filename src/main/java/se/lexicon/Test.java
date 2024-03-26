package se.lexicon;

public class Test {

    static int x = 11;
    private int y = 33;
    public void method1(int x)
    {
        se.lexicon.Test t = new se.lexicon.Test();
        this.x = 22;
        y = 44;

        System.out.println("Test.x: " + se.lexicon.Test.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }

    public static void main(String args[])
    {
        se.lexicon.Test t = new se.lexicon.Test();
        t.method1(5);
    }
}

class Test1
{
    public static void main(String args[])
    {
        int x;
        for (x = 0; x < 4; x++)
        {
            System.out.println(x);
        }

        System.out.println(x);
    }
}

class Test2 {
    public static void main(String args[])
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 20;
        System.out.println(i);
    }
}


