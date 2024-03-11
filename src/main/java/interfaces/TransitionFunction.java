package interfaces;

import Transitions.Transition;
import enums.Symbol;
import enums.states.State;

import java.util.Map;

public interface TransitionFunction {

    public Map<State, Map<Symbol, Transition>> initializeTransitionFunction();
}
