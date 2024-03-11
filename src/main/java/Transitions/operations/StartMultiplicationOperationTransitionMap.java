package Transitions.operations;

import Transitions.Transition;
import enums.Direction;
import enums.Symbol;
import enums.states.State;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class StartMultiplicationOperationTransitionMap implements TransitionMap {
    private final Map<Symbol, Transition> map;
    public StartMultiplicationOperationTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.START, new Transition(State.Q_MULTIPLICATION_Y, Symbol.START, Direction.LEFT));
        map.put(Symbol.BLANK, new Transition(State.START_MULTIPLICATION_OPERATION, Symbol.BLANK, Direction.RIGHT));
        map.put(Symbol.ZERO, new Transition(State.START_MULTIPLICATION_OPERATION, Symbol.ZERO, Direction.RIGHT));
        map.put(Symbol.ONE, new Transition(State.START_MULTIPLICATION_OPERATION, Symbol.ONE, Direction.RIGHT));
        map.put(Symbol.EQUALS, new Transition(State.START_MULTIPLICATION_OPERATION, Symbol.EQUALS, Direction.RIGHT));
        map.put(Symbol.MULTIPLICATION, new Transition(State.START_MULTIPLICATION_OPERATION, Symbol.MULTIPLICATION, Direction.RIGHT));
    }

    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
