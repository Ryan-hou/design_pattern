package com.github.ryan.compound_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: DuckSimulator
 * @date April 04,2017
 */
public class DuckSimulator {
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        // 适配器模式: 适配Goose类为Quackable类型,然后进行方法转发
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Observer");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

//        Flock flockOfMallards = new Flock();
//        Quackable mallardOne = duckFactory.createMallardDuck();
//        Quackable mallardTwo = duckFactory.createMallardDuck();
//        Quackable mallardThree = duckFactory.createMallardDuck();
//        Quackable mallardFour = duckFactory.createMallardDuck();

//        flockOfMallards.add(mallardOne);
//        flockOfMallards.add(mallardTwo);
//        flockOfMallards.add(mallardThree);
//        flockOfMallards.add(mallardFour);
//
//        flockOfDucks.add(flockOfMallards);

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);
//        System.out.println("\nDuck Simulator: Whole Flock Simulation");
//        simulate(flockOfDucks);
//
//        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
//        simulate(flockOfMallards);

//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);

        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }
}
