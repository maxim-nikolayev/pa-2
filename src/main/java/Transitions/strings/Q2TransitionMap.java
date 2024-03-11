package Transitions.strings;

import Transitions.Transition;
import enums.Direction;
import enums.states.State;
import enums.Symbol;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;


public class Q2TransitionMap implements TransitionMap {
    private final Map<Symbol, Transition> q2;
    public Q2TransitionMap(){
        q2 = new HashMap<>();
        q2.put(Symbol.ZERO, new Transition(State.QY, Symbol.BLANK, Direction.LEFT));
        q2.put(Symbol.ONE, new Transition(State.QN, Symbol.BLANK, Direction.LEFT));
        q2.put(Symbol.BLANK, new Transition(State.QN, Symbol.BLANK, Direction.LEFT));
    }

    @Override
    public Map<Symbol, Transition> getTransitionMap() {
        return q2;
    }
}
