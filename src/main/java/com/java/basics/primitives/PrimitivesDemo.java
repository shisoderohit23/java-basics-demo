package main.java.com.java.basics.primitives;

public class PrimitivesDemo {
    protected byte aByte;
    protected short aShort;
    protected int anInt;
    protected long aLong;
    protected float aFloat;
    protected double aDouble;
    protected String aStr; // not exactly primitive, but is closely related
    protected char aChar;

    public PrimitivesDemo() {
        System.out.println(">>> Default constructor called");
    }

    public static void defaultValueDemo() {
        // byte=0 - 1 byte
        // short=0 - 2 byte
        // int=0 - 4 bytes (32 bit)
        // long=0 - 8 bytes (64 bit)
        // float=0.00.. - 4 bytes
        // double=0.00.. - 8 bytes
        // String (not a primitive) = null
        // char=\u0000 - null character (not printable) decimal equivalent of 0

        PrimitivesDemo defaultValueDemo = new PrimitivesDemo();
        defaultValueDemo.printValues();
    }

    public static void typeConversionDemo() {
        // https://www.geeksforgeeks.org/type-conversion-java-examples/

        PrimitivesDemo typeConversionDemo = new PrimitivesDemo();

        // Must of compatible data types. i.e. numbers. Char to int is not possible
        // ------->widening | Implicit
        // byte -> short -> int -> long -> float -> double
        typeConversionDemo.aByte = 1;

        typeConversionDemo.aShort = typeConversionDemo.aByte;
        System.out.println("Byte<>Short = " + typeConversionDemo.aShort);

        typeConversionDemo.anInt = typeConversionDemo.aShort;
        System.out.println("Short<>Integer = " + typeConversionDemo.anInt);

        typeConversionDemo.aLong = typeConversionDemo.anInt;
        System.out.println("Integer<>Long = " + typeConversionDemo.aLong);

        typeConversionDemo.aFloat = typeConversionDemo.aLong;
        System.out.println("Long<>Float = " + typeConversionDemo.aFloat);

        typeConversionDemo.aDouble = typeConversionDemo.aFloat;
        System.out.println("Float<>Double = " + typeConversionDemo.aDouble);

        System.out.println("Widening / Implicit conversion --");
        typeConversionDemo.printValues();

        // Narrowing / Explicit
        typeConversionDemo.aDouble = 154564654564667866746876876.3212154548775242454564676822435786643468776843234;

        typeConversionDemo.aFloat = (float) typeConversionDemo.aDouble;
        System.out.println("Double > Float = " + typeConversionDemo.aFloat);

        typeConversionDemo.aLong = (long) typeConversionDemo.aFloat;
        System.out.println("Float > Long = " + typeConversionDemo.aLong);
    }

    public static void main(String[] args) {

        System.out.println(">>> Default values");
        defaultValueDemo();

        System.out.println(">>> Type conversion");
        typeConversionDemo();
    }

    private void printValues() {
        System.out.printf("Default values of byte=%d | short=%d | int=%d | long=%d | float=%f | " + "double=%f | " +
                        "str=%s | char=%c%n", this.aByte, this.aShort, this.anInt, this.aLong, this.aFloat,
                this.aDouble, this.aStr, this.aChar);
    }
}
