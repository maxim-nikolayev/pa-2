package Transitions.operations;

import Transitions.Transition;
import enums.Direction;
import enums.Symbol;
import enums.states.State;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class ReturnToEqualsFromXWithOneAndAbortTransitionMap implements TransitionMap {

    private final Map<Symbol, Transition> map;

    public ReturnToEqualsFromXWithOneAndAbortTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.BLANK, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE_AND_ABORT, Symbol.BLANK, Direction.RIGHT));
        map.put(Symbol.ZERO, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE_AND_ABORT, Symbol.ZERO, Direction.RIGHT));
        map.put(Symbol.ONE, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE_AND_ABORT, Symbol.ONE, Direction.RIGHT));
        map.put(Symbol.X, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE_AND_ABORT, Symbol.X, Direction.RIGHT));
        map.put(Symbol.Y, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE_AND_ABORT, Symbol.Y, Direction.RIGHT));
        map.put(Symbol.CARRY, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE_AND_ABORT, Symbol.CARRY, Direction.RIGHT));
        map.put(Symbol.ADDITION, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE_AND_ABORT, Symbol.ADDITION, Direction.RIGHT));
        map.put(Symbol.SUBTRACTION, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE_AND_ABORT, Symbol.SUBTRACTION, Direction.RIGHT));
        map.put(Symbol.MULTIPLICATION, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE_AND_ABORT, Symbol.MULTIPLICATION, Direction.RIGHT));
        map.put(Symbol.EQUALS, new Transition(State.Q_OUTPUT_IS_SHIFT_NECESSARY_WITH_ONE_AND_ABORT, Symbol.EQUALS, Direction.RIGHT));
    }

    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
