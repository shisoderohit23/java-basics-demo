package main.java.com.java.basics.control.loops;

public class LoopDemo {

    private static void forDemo() {
        // for(init[optional];condition[optional];incr/decr[optional] {body}
        // executes until condition becomes false
        // When to use - when number of iterations are finite

        for (int i = 0; i <= 2; i++) {
            System.out.printf("[For-Loop] %d iteration\n", i);
        }
    }

    public static void main(String[] args) {
        forDemo();
        forEachDemo();
        labeledForLoopDemo();
        whileDemo();
        doWhileDemo();
        printHalfPyramid();
        printInvertedHalfPyramid();
    }

    private static void printInvertedHalfPyramid() {
        /**
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         */
        int rows = 5;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printHalfPyramid() {
        /**
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         */
        int rows = 5;
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void doWhileDemo() {
        // executes code block at least once
        int i = 1;
        do {
            System.out.printf("[Do-While] %d iteration\n", i);
            i++;
        } while (i <= 0);
    }

    private static void labeledForLoopDemo() {
        // label a code block and use that label for break or continue inside nested code
        outerCode:
        for (int i = 0; i <= 3; i++) {
            innerCode:
            for (int j = 0; j <= 3; j++) {
                if (j == 1) continue innerCode;
                if (i == 2 && j == 2) {
                    break outerCode;
                }
                System.out.printf("[Labeled-For-Loop] %d - %d\n", i, j);
            }
        }
    }

    private static void forEachDemo() {
        // Works with arrays and collections
        // works on element basis and not index
        int[] intArray = {1, 2, 3, 4, 5};
        for (int i : intArray) {
            System.out.printf("[For-Each] %d iteration\n", i);
        }
    }

    private static void whileDemo() {
        // while(condition)
        int i = 1;
        while (i <= 1) {
            System.out.printf("[While-Loop] %d iteration\n", i);
            i++;
        }
    }
}
