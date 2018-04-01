package com.github.ryan.singleton_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: SingletonTestDrive
 * @date February 11,2017
 */
public class SingletonTestDrive extends Thread {

    private String threadName;

    public SingletonTestDrive(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
//        super.run();
        System.out.println(threadName + " is running....");
        System.out.println("Singleton's hashCode is: " + SingletonUseEnum.SINGLETON.hashCode());
    }

    public static void main(String[] args) {
        SingletonTestDrive threadOne = new SingletonTestDrive("threadOne");
        SingletonTestDrive threadTwo = new SingletonTestDrive("threadTwo");
        SingletonTestDrive threadThree = new SingletonTestDrive("threadThree");
        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}
