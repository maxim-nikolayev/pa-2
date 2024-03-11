package Transitions.operations.addition;

import Transitions.Transition;
import enums.Direction;
import enums.states.State;
import enums.Symbol;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class AdditionXWithZeroTransitionMap implements TransitionMap {

    private final  Map<Symbol, Transition> map;

    public AdditionXWithZeroTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.ZERO, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ZERO, Symbol.X, Direction.RIGHT));
        map.put(Symbol.ONE, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE, Symbol.X, Direction.RIGHT));
        map.put(Symbol.CARRY, new Transition(State.Q_ADDITION_X_WITH_ZERO_AND_CARRY, Symbol.X, Direction.LEFT));
        map.put(Symbol.X, new Transition(State.Q_ADDITION_X_WITH_ZERO, Symbol.X, Direction.LEFT));
        map.put(Symbol.START, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ZERO, Symbol.START, Direction.RIGHT));
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
