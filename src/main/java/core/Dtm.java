package core;

import Transitions.*;
import enums.states.State;
import enums.Symbol;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class Dtm {
    private int headPosition;
    private State currentState;
    private final Tape tape;

    private static final String OUTPUT_FILE = "dtm_output.txt";
    private Map<State, Map<Symbol, Transition>> stringFunction;
    private final Map<State, Map<Symbol, Transition>> additionFunction;
    private final Map<State, Map<Symbol, Transition>> multiplicationFunction;
    private final Map<State, Map<Symbol, Transition>> subtractionFunction;

    public Dtm(int size) {
        tape = new Tape(size);
        initializeTransitionFunction();
        headPosition = 0;
        additionFunction = new AdditionFunction().initializeTransitionFunction();
        subtractionFunction = new SubtractionFunction().initializeTransitionFunction();
        multiplicationFunction = new MultiplicationFunction().initializeTransitionFunction();

    }
    private void initializeTransitionFunction() {
        //transitionFunction = new HashMap<>();
        //transitionFunction.put(State.Q0, new Q0TransitionMap().getTransitionMap());
        //transitionFunction.put(State.Q1, new Q1TransitionMap().getTransitionMap());
        //transitionFunction.put(State.Q2, new Q2TransitionMap().getTransitionMap());
        //transitionFunction.put(State.Q3, new Q3TransitionMap().getTransitionMap());
        //transitionFunction.put(State.Q_ADDITION, new AdditionXWithZeroTransitionMap().getTransitionMap());
        //transitionFunction.put(State.Q_ADDITION_WITH_CARRY, new AdditionXWithZeroTransitionMap().getTransitionMap());
        //transitionFunction.put(State.Q_FIND_DELIMITER, new FindDelimiterFromZeroTransitionMap().getTransitionMap());
        //transitionFunction.put(State.Q_OUTPUT, new QOutputWriteZeroTransitionMap().getTransitionMap());
        //transitionFunction.put(State.QY, new HashMap<>());
        //transitionFunction.put(State.QN, new HashMap<>());
    }

    public void runString(String input) throws IOException {

        Symbol[] inputTape = tape.initializeTape(input);
        int stepCount = 0;
        try (FileWriter fileWriter = new FileWriter(OUTPUT_FILE)) {
            while (currentState != State.QY && currentState != State.QN) {
                Symbol currentSymbol = inputTape[headPosition];
                Transition transition = stringFunction.get(currentState).get(currentSymbol);
                inputTape[headPosition] = transition.getSymbol();
                printTapeState(inputTape);
                headPosition += transition.getDirection().getMove();

                 // Prints state with transitions
                stepCount++;

                if (stepCount > 30) {
                    fileWriter.write(tape.tapeToString(inputTape) + "\n"); // Writes to file
                }

                currentState = transition.getNextState();
                System.out.println(currentState + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public void runAddition(String input) {
        Symbol[] additionTape =  tape.initializeTape(input);
        currentState = State.START_ADDITION_OPERATION;
        while (currentState != State.QY && currentState != State.QN) {
            Symbol currentSymbol = additionTape[headPosition];
            Transition transition = additionFunction.get(currentState).get(currentSymbol);
            additionTape[headPosition] = transition.getSymbol();
            printTapeState(additionTape);
            headPosition += transition.getDirection().getMove();

            currentState = transition.getNextState();
        }
    }

    public void runSubtraction(String input) {
        Symbol[] subtractionTape =  tape.initializeTape(input);
        currentState = State.START_SUBTRACTION_OPERATION;

        while (currentState != State.QY && currentState != State.QN) { // Process until halt or error
            Symbol currentSymbol = subtractionTape[headPosition];
            Transition transition = subtractionFunction.get(currentState).get(currentSymbol);
            subtractionTape[headPosition] = transition.getSymbol();
            printTapeState(subtractionTape);
            headPosition += transition.getDirection().getMove();

            currentState = transition.getNextState();
        }
    }

    public void runMultiplication(String input) {
        Symbol[] multiplicationTape =  tape.initializeMultiplicationTape(input);
        currentState = State.START_MULTIPLICATION_OPERATION;

        while (currentState != State.QY && currentState != State.QN) { // Process until halt or error
            Symbol currentSymbol = multiplicationTape[headPosition];
            Transition transition = multiplicationFunction.get(currentState).get(currentSymbol);
            multiplicationTape[headPosition] = transition.getSymbol();
            printTapeState(multiplicationTape);
            //System.out.println(currentState + "\n");
            headPosition += transition.getDirection().getMove();

            currentState = transition.getNextState();
        }
    }

    public void printTapeState(Symbol[] tape) {
        StringBuilder sb = new StringBuilder();
        Symbol symbol = tape[headPosition];
        sb.append(symbol.getValue()); // Append symbol value
        sb.append(Arrays.toString(tape)); // Append symbol value

        // Check if there's a transition for the current state and symbol
        Map<Symbol, Transition> transitions = additionFunction.get(currentState);
        if (transitions != null && transitions.containsKey(symbol)) {
            Transition transition = transitions.get(symbol);
            sb.append(" -> (").append(currentState).append(", ").append(transition.getSymbol().getValue()).append(", ").append(transition.getDirection()).append(")");
        }
        System.out.println(sb.toString());
    }


}
