package Transitions.operations;

import Transitions.Transition;
import enums.Direction;
import enums.states.State;
import enums.Symbol;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class ReturnToEqualsFromXWithZeroTransitionMap implements TransitionMap {

    private final Map<Symbol, Transition> map;

    public ReturnToEqualsFromXWithZeroTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.BLANK, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ZERO, Symbol.BLANK, Direction.RIGHT));
        map.put(Symbol.ZERO, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ZERO, Symbol.ZERO, Direction.RIGHT));
        map.put(Symbol.ONE, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ZERO, Symbol.ONE, Direction.RIGHT));
        map.put(Symbol.ADDITION, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ZERO, Symbol.ADDITION, Direction.RIGHT)); // Move left on finding delimiter
        map.put(Symbol.SUBTRACTION, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ZERO, Symbol.SUBTRACTION, Direction.RIGHT)); // Move left on finding delimiter
        map.put(Symbol.MULTIPLICATION, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ZERO, Symbol.MULTIPLICATION, Direction.RIGHT)); // Move
        map.put(Symbol.X, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ZERO, Symbol.X, Direction.RIGHT));
        map.put(Symbol.Y, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ZERO, Symbol.Y, Direction.RIGHT));
        map.put(Symbol.CARRY, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ZERO, Symbol.CARRY, Direction.RIGHT));
        map.put(Symbol.EQUALS, new Transition(State.Q_OUTPUT_IS_SHIFT_NECESSARY_WITH_ZERO, Symbol.EQUALS, Direction.RIGHT));
    }

    @Override
    public Map<Symbol, Transition> getTransitionMap(){
        return map;
    }
}
