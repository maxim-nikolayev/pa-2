package Transitions.operations;

import Transitions.Transition;
import enums.Direction;
import enums.states.State;
import enums.Symbol;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class StartAdditionOperationTransitionMap implements TransitionMap {
    private final Map<Symbol, Transition> map;
    public StartAdditionOperationTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.START, new Transition(State.START_ADDITION_OPERATION, Symbol.START, Direction.RIGHT));
        map.put(Symbol.BLANK, new Transition(State.START_ADDITION_OPERATION, Symbol.BLANK, Direction.RIGHT));
        map.put(Symbol.ZERO, new Transition(State.START_ADDITION_OPERATION, Symbol.ZERO, Direction.RIGHT));
        map.put(Symbol.ONE, new Transition(State.START_ADDITION_OPERATION, Symbol.ONE, Direction.RIGHT));
        map.put(Symbol.Y, new Transition(State.START_ADDITION_OPERATION, Symbol.Y, Direction.RIGHT));
        map.put(Symbol.ADDITION, new Transition(State.START_ADDITION_OPERATION, Symbol.ADDITION, Direction.RIGHT));
        map.put(Symbol.EQUALS, new Transition(State.Q_ADDITION_Y, Symbol.EQUALS, Direction.LEFT));
    }

    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
