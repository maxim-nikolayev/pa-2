package Transitions.operations;

import Transitions.Transition;
import enums.Direction;
import enums.states.State;
import enums.Symbol;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class FindDelimiterFromOneTransitionMap implements TransitionMap {

    private final  Map<Symbol, Transition> map;

    public FindDelimiterFromOneTransitionMap(){
        map = new HashMap<>();
        map.put(Symbol.ZERO, new Transition(State.Q_FIND_DELIMITER_FROM_ONE, Symbol.ZERO, Direction.LEFT));
        map.put(Symbol.ONE, new Transition(State.Q_FIND_DELIMITER_FROM_ONE, Symbol.ONE, Direction.LEFT));
        map.put(Symbol.ADDITION, new Transition(State.Q_ADDITION_X_WITH_ONE, Symbol.ADDITION, Direction.LEFT)); // Move left on finding delimiter
        map.put(Symbol.SUBTRACTION, new Transition(State.Q_SUBTRACTION_X_WITH_ONE, Symbol.SUBTRACTION, Direction.LEFT)); // Move left on finding delimiter
        map.put(Symbol.MULTIPLICATION, new Transition(State.Q_MULTIPLICATION_X_WITH_ONE, Symbol.MULTIPLICATION, Direction.LEFT)); // Move // Move left on finding delimiter
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
