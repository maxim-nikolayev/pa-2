package Transitions.strings;

import Transitions.Transition;
import enums.Direction;
import enums.states.State;
import enums.Symbol;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;


public class Q1TransitionMap implements TransitionMap {
    private final Map<Symbol, Transition> q1;
    public Q1TransitionMap(){
        q1 = new HashMap<>();
        q1.put(Symbol.ZERO, new Transition(State.Q2, Symbol.BLANK, Direction.LEFT));
        q1.put(Symbol.ONE, new Transition(State.Q3, Symbol.BLANK, Direction.LEFT));
        q1.put(Symbol.BLANK, new Transition(State.QN, Symbol.BLANK, Direction.LEFT));

    }

    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return q1;
    }
}
