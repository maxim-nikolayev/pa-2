package interfaces;

import Transitions.Transition;
import enums.Symbol;

import java.util.Map;

public interface TransitionMap {

    Map<Symbol, Transition> getTransitionMap();
}
