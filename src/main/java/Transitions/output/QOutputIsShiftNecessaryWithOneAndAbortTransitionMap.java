package Transitions.output;

import Transitions.Transition;
import enums.Direction;
import enums.Symbol;
import enums.states.State;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class QOutputIsShiftNecessaryWithOneAndAbortTransitionMap implements TransitionMap {
    private final  Map<Symbol, Transition> map;
    public QOutputIsShiftNecessaryWithOneAndAbortTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.ZERO, new Transition(State.Q_SHIFT_ZERO_AND_ABORT, Symbol.ONE, Direction.RIGHT));  // Overwrite with result
        map.put(Symbol.ONE, new Transition(State.Q_SHIFT_ONE_AND_ABORT, Symbol.ONE, Direction.RIGHT));
        map.put(Symbol.BLANK, new Transition(State.Q_OUTPUT_WRITE_ONE, Symbol.ONE, Direction.RIGHT)); // Move left on finding delimiter
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
