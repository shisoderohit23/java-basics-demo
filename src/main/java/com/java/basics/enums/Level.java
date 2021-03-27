package main.java.com.java.basics.enums;

public enum Level {
    HIGH(3) {
        @Override
        public String scrambleCase() {
            return this.getLevelCode() + " ==> " + HIGH.toString().toLowerCase();
        }
    }, MEDIUM(2) {
        @Override
        public String scrambleCase() {
            return this.getLevelCode() + " == " + MEDIUM.toString().toLowerCase();
        }
    }, LOW(1) {
        @Override
        public String scrambleCase() {
            return this.getLevelCode() + " <== " + LOW.toString().toUpperCase();
        }
    }; // semicolon needed when fields and methods follows
    private final int levelCode;

    // must be package-private or private access and can not be called from outside
    Level(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return levelCode;
    }

    public abstract String scrambleCase();
}
