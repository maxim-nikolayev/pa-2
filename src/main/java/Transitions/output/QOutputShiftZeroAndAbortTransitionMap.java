package Transitions.output;

import Transitions.Transition;
import enums.Direction;
import enums.Symbol;
import enums.states.State;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class QOutputShiftZeroAndAbortTransitionMap implements TransitionMap {

    private final  Map<Symbol, Transition> map;

    public QOutputShiftZeroAndAbortTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.ZERO, new Transition(State.Q_SHIFT_ZERO_AND_ABORT, Symbol.ZERO, Direction.RIGHT));  // Overwrite with result
        map.put(Symbol.ONE, new Transition(State.Q_SHIFT_ONE_AND_ABORT, Symbol.ZERO, Direction.RIGHT));
        map.put(Symbol.BLANK, new Transition(State.QN, Symbol.ZERO, Direction.LEFT)); // Move left on finding delimiter
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
