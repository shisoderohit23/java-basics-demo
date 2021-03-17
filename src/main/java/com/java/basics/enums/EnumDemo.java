package main.java.com.java.basics.enums;

public class EnumDemo {

    private static void staticParentMethods() {

        System.out.println("Printing all values iteratively");
        // values() - returns array of all possible values of an enum
        for (Level l : Level.values()) {
            System.out.println(l);
        }

        System.out.println("Printing single enum value using string");
        //valueOf() - returns instance of enum from string value
        Level highLevel = Level.valueOf("HIGH");
        System.out.println(highLevel);

        //toString() - gives string representation of enum instance
        System.out.println("ToString = " + Level.LOW.toString());
    }

    public static void main(String[] args) {
        staticParentMethods();
        fieldsAndMethods();
    }

    private static void fieldsAndMethods() {
        Level l = Level.MEDIUM;
        System.out.println("Custom field levelCode for MEDIUM = " + l.getLevelCode());

        for (Level level : Level.values()) {
            System.out.println(level.scrambleCase());
        }
    }

}
