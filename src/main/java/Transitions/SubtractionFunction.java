package Transitions;

import Transitions.operations.*;
import Transitions.operations.addition.AdditionCheckForLeftOverBitsTransitionMap;
import Transitions.operations.addition.AdditionForLeftOverBitsWithCarryTransitionMap;
import Transitions.operations.subtraction.*;
import Transitions.output.*;
import enums.Symbol;
import enums.states.State;
import interfaces.TransitionFunction;

import java.util.HashMap;
import java.util.Map;

public class SubtractionFunction implements TransitionFunction {

    private final Map<State, Map<Symbol, Transition>> transitionFunction;

    public SubtractionFunction() {
        transitionFunction = new HashMap<>();
    }
    @Override
    public Map<State, Map<Symbol, Transition>> initializeTransitionFunction() {
        transitionFunction.put(State.START_SUBTRACTION_OPERATION, new StartSubtractionOperationTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_SUBTRACTION_Y, new SubtractionYTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_SUBTRACTION_X_WITH_ZERO, new SubtractionXWithZeroTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_SUBTRACTION_X_WITH_ZERO_AND_CARRY, new SubtractionXWithZeroAndCarryTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_SUBTRACTION_X_WITH_ONE, new SubtractionXWithOneTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_SUBTRACTION_X_WITH_ONE_AND_CARRY, new SubtractionXWithOneAndCarryTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_FIND_DELIMITER_FROM_ZERO, new FindDelimiterFromZeroTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_FIND_DELIMITER_FROM_ONE, new FindDelimiterFromOneTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ZERO, new ReturnToEqualsFromXWithZeroTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE, new ReturnToEqualsFromXWithOneTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_OUTPUT_RETURN_TO_EQUALS_WITH_ONE_AND_ABORT, new ReturnToEqualsFromXWithOneAndAbortTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_OUTPUT_IS_SHIFT_NECESSARY_WITH_ZERO, new QOutputIsShiftNecessaryWithZeroTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_OUTPUT_IS_SHIFT_NECESSARY_WITH_ONE, new QOutputIsShiftNecessaryWithOneTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_OUTPUT_IS_SHIFT_NECESSARY_WITH_ONE_AND_ABORT, new QOutputIsShiftNecessaryWithOneAndAbortTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_OUTPUT_WRITE_ZERO, new QOutputWriteZeroTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_OUTPUT_WRITE_ONE, new QOutputWriteOneTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_SHIFT_ZERO, new QOutputShiftZeroTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_SHIFT_ZERO_AND_ABORT, new QOutputShiftZeroAndAbortTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_SHIFT_ONE, new QOutputShiftOneTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_SHIFT_ONE_AND_ABORT, new QOutputShiftOneAndAbortTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_RETURN_TO_EQUALS_FROM_OUTPUT, new ReturnToDelimiterFromOutputTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_CHECK_FOR_LEFT_OVER_BITS, new SubtractionCheckForLeftOverBitsTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_CHECK_FOR_LEFT_OVER_BITS_WITH_CARRY, new SubtractionForLeftOverBitsWithCarryTransitionMap().getTransitionMap());
        transitionFunction.put(State.Q_CHECK_FOR_CARRY_OTHERWISE_ABORT, new CheckForCarryOtherwiseAbortTransitionMap().getTransitionMap());

        return transitionFunction;
    }
}
