package enums;

public enum Symbol {
    ZERO('0'),
    ONE('1'),
    BLANK('b'),
    ADDITION('+'),
    SUBTRACTION('-'),
    MULTIPLICATION('*'),
    EQUALS('='),
    START('$'),
    X('x'),
    Y('y'),
    CARRY('c');

    private final char value;

    Symbol(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
