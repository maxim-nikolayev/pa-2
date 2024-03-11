package Transitions.operations;

import Transitions.Transition;
import enums.Direction;
import enums.states.State;
import enums.Symbol;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class ReturnToEqualsFromXWithOneTransitionMap implements TransitionMap {

    private final Map<Symbol, Transition> map;

    public ReturnToEqualsFromXWithOneTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.BLANK, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE, Symbol.BLANK, Direction.RIGHT));
        map.put(Symbol.ZERO, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE, Symbol.ZERO, Direction.RIGHT));
        map.put(Symbol.ONE, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE, Symbol.ONE, Direction.RIGHT));
        map.put(Symbol.X, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE, Symbol.X, Direction.RIGHT));
        map.put(Symbol.Y, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE, Symbol.Y, Direction.RIGHT));
        map.put(Symbol.CARRY, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE, Symbol.CARRY, Direction.RIGHT));
        map.put(Symbol.ADDITION, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE, Symbol.ADDITION, Direction.RIGHT));
        map.put(Symbol.SUBTRACTION, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE, Symbol.SUBTRACTION, Direction.RIGHT));
        map.put(Symbol.MULTIPLICATION, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE, Symbol.MULTIPLICATION, Direction.RIGHT));
        map.put(Symbol.EQUALS, new Transition(State.Q_OUTPUT_IS_SHIFT_NECESSARY_WITH_ONE, Symbol.EQUALS, Direction.RIGHT));
    }

    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
