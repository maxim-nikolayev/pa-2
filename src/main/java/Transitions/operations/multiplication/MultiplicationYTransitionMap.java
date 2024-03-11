package Transitions.operations.multiplication;

import Transitions.Transition;
import enums.Direction;
import enums.Symbol;
import enums.states.State;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class MultiplicationYTransitionMap implements TransitionMap {

    private final  Map<Symbol, Transition> map;

    public MultiplicationYTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.ZERO, new Transition(State.Q_FIND_DELIMITER_FROM_ZERO, Symbol.ZERO, Direction.LEFT));
        map.put(Symbol.ONE, new Transition(State.Q_FIND_DELIMITER_FROM_ONE, Symbol.ONE, Direction.LEFT));
        map.put(Symbol.Y, new Transition(State.Q_MULTIPLICATION_Y, Symbol.Y, Direction.LEFT));
        map.put(Symbol.MULTIPLICATION, new Transition(State.Q_CHECK_FOR_LEFT_OVER_BITS, Symbol.MULTIPLICATION, Direction.LEFT));
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
