package Transitions.output;

import Transitions.Transition;
import enums.Direction;
import enums.states.State;
import enums.Symbol;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class QOutputWriteOneTransitionMap implements TransitionMap {

    private final  Map<Symbol, Transition> map;

    public QOutputWriteOneTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.ZERO, new Transition(State.Q_OUTPUT_WRITE_ZERO, Symbol.ZERO, Direction.RIGHT));
        map.put(Symbol.ONE, new Transition(State.Q_OUTPUT_WRITE_ZERO, Symbol.ONE, Direction.RIGHT));
        map.put(Symbol.BLANK, new Transition(State.Q_RETURN_TO_EQUALS_FROM_OUTPUT, Symbol.BLANK, Direction.LEFT));
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
