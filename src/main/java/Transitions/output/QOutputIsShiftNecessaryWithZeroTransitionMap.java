package Transitions.output;

import Transitions.Transition;
import enums.Direction;
import enums.Symbol;
import enums.states.State;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class QOutputIsShiftNecessaryWithZeroTransitionMap implements TransitionMap {
    private final  Map<Symbol, Transition> map;
    public QOutputIsShiftNecessaryWithZeroTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.ZERO, new Transition(State.Q_SHIFT_ZERO, Symbol.ZERO, Direction.RIGHT));  // Overwrite with result
        map.put(Symbol.ONE, new Transition(State.Q_SHIFT_ONE, Symbol.ZERO, Direction.RIGHT));
        map.put(Symbol.BLANK, new Transition(State.Q_OUTPUT_WRITE_ZERO, Symbol.ZERO, Direction.RIGHT)); // Move left on finding delimiter
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
