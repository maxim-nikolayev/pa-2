package Transitions.operations.multiplication;

import Transitions.Transition;
import enums.Direction;
import enums.Symbol;
import enums.states.State;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class ShiftEqualsLeftTransitionMap implements TransitionMap {

    private final  Map<Symbol, Transition> map;

    public ShiftEqualsLeftTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.ZERO, new Transition(State.Q_SHIFT_ZERO_LEFT, Symbol.EQUALS, Direction.LEFT));  // Overwrite with result
        map.put(Symbol.ONE, new Transition(State.Q_SHIFT_ONE_LEFT, Symbol.EQUALS, Direction.LEFT));
        map.put(Symbol.BLANK, new Transition(State.Q_RETURN_TO_EQUALS_FROM_OUTPUT, Symbol.ZERO, Direction.LEFT)); // Move left on finding delimiter
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
