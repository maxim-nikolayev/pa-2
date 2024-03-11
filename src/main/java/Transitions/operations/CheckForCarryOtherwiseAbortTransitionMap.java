package Transitions.operations;

import Transitions.Transition;
import enums.Direction;
import enums.Symbol;
import enums.states.State;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;

public class CheckForCarryOtherwiseAbortTransitionMap implements TransitionMap {

    private final  Map<Symbol, Transition> map;

    public CheckForCarryOtherwiseAbortTransitionMap(){
        map = new HashMap<>();

        map.put(Symbol.X, new Transition(State.QN, Symbol.X, Direction.RIGHT));
        map.put(Symbol.CARRY, new Transition(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE_AND_ABORT, Symbol.CARRY, Direction.RIGHT));
    }
    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return map;
    }
}
