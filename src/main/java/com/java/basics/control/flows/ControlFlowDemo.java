package main.java.com.java.basics.control.flows;

public class ControlFlowDemo {
    private static void ifDemo(int greaterNumber) {
        // must be a condition / expression that results in boolean - true / false
        // scripting lang object coercion to bool is not available in java.
        // So this gives compile time error - if(5) or if(obj)
        if (greaterNumber > 10) {
            System.out.printf("%d is greater than 10\n", greaterNumber);
        } else {
            System.out.printf("%d is less than 10\n", greaterNumber);
        }
    }

    private static void switchDemo() {
        // Switch in java works with following expressions -
        // byte, short, int, long
        // String (since 7) and Enums
        // Wrapper classes Byte, Short, Integer, Long

        for (Day d : Day.values()) {
            switch (d) {
                case SUN:
                    System.out.println("Sunday");
                    break;
                case MON:
                    System.out.println("Monday");
                    break;
                case TUE: {
                    System.out.println("Tuesday");
                    break;
                }
                case WED:
                    System.out.println("Wednesday");
                    break;
                case THU:
                    System.out.println("Thursday");
                    break;
                case FRI:
                    System.out.println("Friday");
                    break;
                case SAT:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Invalid day");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        ifDemo(5);
        switchDemo();
    }

    public enum Day {SUN, MON, TUE, WED, THU, FRI, SAT}
}
