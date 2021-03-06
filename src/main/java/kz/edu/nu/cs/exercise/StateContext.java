package kz.edu.nu.cs.exercise;

public class StateContext {
	
    final State state1 = new State_1(this);
    final State state2 = new State_2(this);
    final State state3 = new State_3(this);

    private State currentState;

    public StateContext() {
        this.currentState = state1;
    }

    public void actionA() {
        // complete this method by
        // delegation to the current state
    	this.currentState.actionA();
    }

    public void actionB() {
        // complete this method
        // delegate to the current state
    	this.currentState.actionB();
    }

    public boolean inAcceptState() {
        // complete this method and return correct value
        // delegate to the current state
        return this.currentState.isAccept();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

}
