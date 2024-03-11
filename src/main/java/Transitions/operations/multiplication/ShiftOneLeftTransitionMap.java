package Transitions.operations.multiplication;

import Transitions.Transition;
import enums.Direction;
import enums.Symbol;
import enums.states.State;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class ShiftOneLeftTransitionMap implements TransitionMap {

    private final  Map<Symbol, Transition> map;

    public ShiftOneLeftTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.ZERO, new Transition(State.Q_SHIFT_ZERO_LEFT, Symbol.ONE, Direction.LEFT));  // Overwrite with result
        map.put(Symbol.ONE, new Transition(State.Q_SHIFT_ONE_LEFT, Symbol.ONE, Direction.LEFT));
        map.put(Symbol.EQUALS, new Transition(State.Q_SHIFT_EQUALS_LEFT, Symbol.ONE, Direction.LEFT)); // Move left on finding delimiter
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
