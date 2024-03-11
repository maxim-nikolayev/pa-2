package Transitions.operations.subtraction;

import Transitions.Transition;
import enums.Direction;
import enums.Symbol;
import enums.states.State;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class SubtractionYTransitionMap implements TransitionMap {

    private final  Map<Symbol, Transition> map;

    public SubtractionYTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.ZERO, new Transition(State.Q_FIND_DELIMITER_FROM_ZERO, Symbol.Y, Direction.LEFT));
        map.put(Symbol.ONE, new Transition(State.Q_FIND_DELIMITER_FROM_ONE, Symbol.Y, Direction.LEFT));
        map.put(Symbol.Y, new Transition(State.Q_SUBTRACTION_Y, Symbol.Y, Direction.LEFT));
        map.put(Symbol.SUBTRACTION, new Transition(State.Q_CHECK_FOR_LEFT_OVER_BITS, Symbol.SUBTRACTION, Direction.LEFT));
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
