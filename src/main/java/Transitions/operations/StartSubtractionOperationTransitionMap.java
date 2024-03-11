package Transitions.operations;

import Transitions.Transition;
import enums.Direction;
import enums.Symbol;
import enums.states.State;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class StartSubtractionOperationTransitionMap implements TransitionMap {
    private final Map<Symbol, Transition> map;
    public StartSubtractionOperationTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.START, new Transition(State.START_SUBTRACTION_OPERATION, Symbol.START, Direction.RIGHT));
        map.put(Symbol.BLANK, new Transition(State.START_SUBTRACTION_OPERATION, Symbol.BLANK, Direction.RIGHT));
        map.put(Symbol.ZERO, new Transition(State.START_SUBTRACTION_OPERATION, Symbol.ZERO, Direction.RIGHT));
        map.put(Symbol.ONE, new Transition(State.START_SUBTRACTION_OPERATION, Symbol.ONE, Direction.RIGHT));
        map.put(Symbol.Y, new Transition(State.START_SUBTRACTION_OPERATION, Symbol.Y, Direction.RIGHT));
        map.put(Symbol.SUBTRACTION, new Transition(State.START_SUBTRACTION_OPERATION, Symbol.SUBTRACTION, Direction.RIGHT));
        map.put(Symbol.EQUALS, new Transition(State.Q_SUBTRACTION_Y, Symbol.EQUALS, Direction.LEFT));
    }

    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
