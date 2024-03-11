package Transitions.operations.addition;

import Transitions.Transition;
import enums.Direction;
import enums.states.State;
import enums.Symbol;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class AdditionYTransitionMap implements TransitionMap {

    private final  Map<Symbol, Transition> map;

    public AdditionYTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.ZERO, new Transition(State.Q_FIND_DELIMITER_FROM_ZERO, Symbol.Y, Direction.LEFT));
        map.put(Symbol.ONE, new Transition(State.Q_FIND_DELIMITER_FROM_ONE, Symbol.Y, Direction.LEFT));
        map.put(Symbol.Y, new Transition(State.Q_ADDITION_Y, Symbol.Y, Direction.LEFT));
        map.put(Symbol.ADDITION, new Transition(State.Q_CHECK_FOR_LEFT_OVER_BITS, Symbol.ADDITION, Direction.LEFT));
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
