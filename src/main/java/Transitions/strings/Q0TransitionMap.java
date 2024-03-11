package Transitions.strings;

import Transitions.Transition;
import enums.Direction;
import enums.states.State;
import enums.Symbol;
import interfaces.TransitionMap;

import java.util.HashMap;
import java.util.Map;


public class Q0TransitionMap implements TransitionMap {
    private final  Map<Symbol, Transition> q0;
    public Q0TransitionMap(){
        q0 = new HashMap<>();
        q0.put(Symbol.ZERO, new Transition(State.Q0, Symbol.ZERO, Direction.RIGHT));
        q0.put(Symbol.ONE, new Transition(State.Q0, Symbol.ONE, Direction.RIGHT));
        q0.put(Symbol.BLANK, new Transition(State.Q1, Symbol.BLANK, Direction.LEFT));


    }
    @Override
    public Map<Symbol, Transition> getTransitionMap(){
        return q0;
    }
}
