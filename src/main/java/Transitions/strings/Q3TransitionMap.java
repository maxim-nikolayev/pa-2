package Transitions.strings;

import Transitions.Transition;
import enums.Direction;
import enums.states.State;
import enums.Symbol;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;


public class Q3TransitionMap implements TransitionMap {
    private final Map<Symbol, Transition> q3;
    public Q3TransitionMap(){
        q3 = new HashMap<>();
        q3.put(Symbol.ZERO, new Transition(State.QN, Symbol.BLANK, Direction.LEFT));
        q3.put(Symbol.ONE, new Transition(State.QY, Symbol.BLANK, Direction.LEFT));
        q3.put(Symbol.BLANK, new Transition(State.QN, Symbol.BLANK, Direction.LEFT));
    }

    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return q3;
    }
}
