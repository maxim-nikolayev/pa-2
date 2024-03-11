package Transitions.operations;

import Transitions.Transition;
import enums.Direction;
import enums.states.State;
import enums.Symbol;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class FindDelimiterFromZeroTransitionMap implements TransitionMap {

    private final  Map<Symbol, Transition> map;

    public FindDelimiterFromZeroTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.ZERO, new Transition(State.Q_FIND_DELIMITER_FROM_ZERO, Symbol.ZERO, Direction.LEFT));
        map.put(Symbol.ONE, new Transition(State.Q_FIND_DELIMITER_FROM_ZERO, Symbol.ONE, Direction.LEFT));
        map.put(Symbol.ADDITION, new Transition(State.Q_ADDITION_X_WITH_ZERO, Symbol.ADDITION, Direction.LEFT)); // Move left on finding delimiter
        map.put(Symbol.SUBTRACTION, new Transition(State.Q_SUBTRACTION_X_WITH_ZERO, Symbol.SUBTRACTION, Direction.LEFT)); // Move left on finding delimiter
        map.put(Symbol.MULTIPLICATION, new Transition(State.Q_MULTIPLICATION_X_WITH_ZERO, Symbol.MULTIPLICATION, Direction.LEFT)); // Move left on finding delimiter
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
