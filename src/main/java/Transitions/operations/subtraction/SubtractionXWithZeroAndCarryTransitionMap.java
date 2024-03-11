package Transitions.operations.subtraction;

import Transitions.Transition;
import enums.Direction;
import enums.Symbol;
import enums.states.State;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class SubtractionXWithZeroAndCarryTransitionMap implements TransitionMap {

    private final  Map<Symbol, Transition> map;

    public SubtractionXWithZeroAndCarryTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.ZERO, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE, Symbol.CARRY, Direction.RIGHT));
        map.put(Symbol.ONE, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ZERO, Symbol.X, Direction.RIGHT));
        map.put(Symbol.CARRY, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE, Symbol.CARRY, Direction.RIGHT));
        map.put(Symbol.X, new Transition(State.Q_SUBTRACTION_X_WITH_ZERO, Symbol.X, Direction.RIGHT));
        map.put(Symbol.START, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE, Symbol.START, Direction.RIGHT));
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
