package Transitions.operations;

import Transitions.Transition;
import enums.Direction;
import enums.states.State;
import enums.Symbol;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class ReturnToDelimiterFromOutputTransitionMap implements TransitionMap {

    private final Map<Symbol, Transition> map;

    public ReturnToDelimiterFromOutputTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.BLANK, new Transition(State.Q_RETURN_TO_EQUALS_FROM_OUTPUT, Symbol.BLANK, Direction.LEFT));
        map.put(Symbol.ZERO, new Transition(State.Q_RETURN_TO_EQUALS_FROM_OUTPUT, Symbol.ZERO, Direction.LEFT));
        map.put(Symbol.ONE, new Transition(State.Q_RETURN_TO_EQUALS_FROM_OUTPUT, Symbol.ONE, Direction.LEFT));
        map.put(Symbol.EQUALS, new Transition(State.Q_RETURN_TO_EQUALS_FROM_OUTPUT, Symbol.EQUALS, Direction.LEFT));
        map.put(Symbol.Y, new Transition(State.Q_RETURN_TO_EQUALS_FROM_OUTPUT, Symbol.Y, Direction.LEFT));
        map.put(Symbol.ADDITION, new Transition(State.START_ADDITION_OPERATION, Symbol.ADDITION, Direction.RIGHT));
        map.put(Symbol.SUBTRACTION, new Transition(State.START_SUBTRACTION_OPERATION, Symbol.SUBTRACTION, Direction.RIGHT));

    }

    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
