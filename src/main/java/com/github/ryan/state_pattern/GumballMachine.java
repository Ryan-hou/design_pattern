package com.github.ryan.state_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: GumballMachine
 * @date February 22,2017
 */
public class GumballMachine {
    // 组合状态对象集合
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    // 实例变量,保存当前状态
    State state = soldOutState;
    int count = 0;

    public GumballMachine(int count) {
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    /**
     * 允许其他对象将机器的状态转换到不同的状态
     * @param state
     */
    public void setState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    /**
     * 我们不需要在Gumball中准备一个dispense()方法,因为这只是一个内部的动作,用户不可以直接
     * 要求机器发糖果.但是我们可以在状态对象的turnCrank()方法中调用dispense()方法
     */
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count -= 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public String toString() {
        return "\nMighty Gumball, Inc.\nJava-enabled Standing Gumball Model #2004\nInventory: " +
                count + " gumballs\n" + "Machine is waiting for quarter\n";
    }
}
