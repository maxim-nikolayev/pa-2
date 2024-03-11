package Transitions;

import enums.Direction;
import enums.states.State;
import enums.Symbol;

public class Transition {
    State nextState;
    Symbol writeSymbol;
    Direction direction;

    public Transition(State nextState, Symbol writeSymbol, Direction direction) {
        this.nextState = nextState;
        this.writeSymbol = writeSymbol;
        this.direction = direction;
    }
    public State getNextState() {
            return nextState;
        }

    public Symbol getSymbol() {
        return writeSymbol;
    }
    public Direction getDirection() {
        return direction;
    }
}
