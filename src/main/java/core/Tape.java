package core;

import enums.Symbol;

import java.util.HashMap;
import java.util.Map;

public class Tape {

    private final int size;
    private Symbol[] tape;

    public Tape(int size){
        this.size = size;
    }

    public Symbol[] initializeTape(String input) {
        tape = new Symbol[size];
        for (int i = 0; i < size; i++) {
            tape[i] = Symbol.BLANK;
        }

        Map<Character, Symbol> charToSymbol = new HashMap<>();
        charToSymbol.put('0', Symbol.ZERO);
        charToSymbol.put('1', Symbol.ONE);
        charToSymbol.put('+', Symbol.ADDITION);
        charToSymbol.put('-', Symbol.SUBTRACTION);
        charToSymbol.put('*', Symbol.MULTIPLICATION);
        charToSymbol.put('=', Symbol.EQUALS);
        charToSymbol.put('$', Symbol.START);

        // Input conversion using the mapping
        for (int i = 0; i < input.length(); i++) {
            char inputChar = input.charAt(i);
            if (charToSymbol.containsKey(inputChar)) {
                tape[i] = charToSymbol.get(inputChar);
            }
        }
        return tape;
    }
    public Symbol[] initializeMultiplicationTape(String input) {
        int j = 0;
        tape = new Symbol[size];
        for (int i = 0; i < size; i++) {
            tape[i] = Symbol.BLANK;
        }

        Map<Character, Symbol> charToSymbol = new HashMap<>();
        charToSymbol.put('0', Symbol.ZERO);
        charToSymbol.put('1', Symbol.ONE);
        charToSymbol.put('+', Symbol.ADDITION);
        charToSymbol.put('-', Symbol.SUBTRACTION);
        charToSymbol.put('*', Symbol.MULTIPLICATION);
        charToSymbol.put('=', Symbol.EQUALS);
        charToSymbol.put('$', Symbol.START);

        // Input conversion using the mapping
        for (int i = size - 1; i > 0; i--) {
            System.out.println(i);
            if(j < 10) {
                char inputChar = input.charAt(j);
                if (charToSymbol.containsKey(inputChar)) {
                    tape[i] = charToSymbol.get(inputChar);
                }
            }
            j++;
        }
        return tape;
    }

    public String tapeToString(Symbol[] tape) {
        StringBuilder sb = new StringBuilder();
        for (Symbol s : tape) {
            sb.append(s.getValue());
        }
        return sb.toString();
    }


}
