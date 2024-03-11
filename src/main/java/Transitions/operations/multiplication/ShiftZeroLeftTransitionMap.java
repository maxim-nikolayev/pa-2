package Transitions.operations.multiplication;

import Transitions.Transition;
import enums.Direction;
import enums.Symbol;
import enums.states.State;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class ShiftZeroLeftTransitionMap implements TransitionMap {

    private final  Map<Symbol, Transition> map;

    public ShiftZeroLeftTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.ZERO, new Transition(State.Q_SHIFT_ZERO_LEFT, Symbol.ZERO, Direction.LEFT));  // Overwrite with result
        map.put(Symbol.ONE, new Transition(State.Q_SHIFT_ONE_LEFT, Symbol.ZERO, Direction.LEFT));
        map.put(Symbol.EQUALS, new Transition(State.Q_SHIFT_EQUALS_LEFT, Symbol.ZERO, Direction.LEFT)); // Move left on finding delimiter
        map.put(Symbol.BLANK, new Transition(State.Q_SHIFT_EQUALS_LEFT, Symbol.ZERO, Direction.LEFT)); // Move left on finding delimiter
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
