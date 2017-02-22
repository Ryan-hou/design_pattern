package com.github.ryan.state_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: WinnerState
 * @date February 22,2017
 */
public class WinnerState implements State {
    /**
     * WinnerState 状态会发两颗糖果,你当然可以把发两颗糖果的代码放在SoldState中,但是这样做,等于用
     * 一个状态表示两个状态,不符合单一职责原则,牺牲了状态类的清晰易懂来减少一些冗余代码,而且在促销方案结束后
     * 或者赢家的几率改变后,你该怎么办呢?所以这里必须要作出适当的折衷
     */

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject the quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but nothing will happen");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
