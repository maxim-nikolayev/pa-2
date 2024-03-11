package Transitions.operations.addition;

import Transitions.Transition;
import enums.Direction;
import enums.Symbol;
import enums.states.State;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class AdditionForLeftOverBitsWithCarryTransitionMap implements TransitionMap {

    private final  Map<Symbol, Transition> map;

    public AdditionForLeftOverBitsWithCarryTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.ZERO, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE, Symbol.X, Direction.RIGHT));
        map.put(Symbol.ONE, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ZERO, Symbol.CARRY, Direction.RIGHT));
        map.put(Symbol.X, new Transition(State.Q_CHECK_FOR_LEFT_OVER_BITS_WITH_CARRY, Symbol.X, Direction.LEFT));
        map.put(Symbol.CARRY, new Transition(State.Q_CHECK_FOR_LEFT_OVER_BITS_WITH_CARRY, Symbol.X, Direction.LEFT));
        map.put(Symbol.START, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE_AND_ABORT, Symbol.START, Direction.RIGHT)); // Move left on finding delimiter
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
