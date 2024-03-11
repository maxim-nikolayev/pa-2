package Transitions.output;

import Transitions.Transition;
import enums.Direction;
import enums.Symbol;
import enums.states.State;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class QOutputShiftOneAndAbortTransitionMap implements TransitionMap {

    private final  Map<Symbol, Transition> map;

    public QOutputShiftOneAndAbortTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.ZERO, new Transition(State.Q_SHIFT_ZERO_AND_ABORT, Symbol.ONE, Direction.RIGHT));  // Overwrite with result
        map.put(Symbol.ONE, new Transition(State.Q_SHIFT_ONE_AND_ABORT, Symbol.ONE, Direction.RIGHT));
        map.put(Symbol.BLANK, new Transition(State.QN, Symbol.ONE, Direction.LEFT)); // Move left on finding delimiter
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
