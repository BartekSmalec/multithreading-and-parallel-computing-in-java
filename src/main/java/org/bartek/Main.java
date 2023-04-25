package org.bartek;

public class Main {
    public static void main(String[] args) {

        // Example of sequential processing

        System.out.println("=======================================");
        System.out.println("Sequential processing. \n");

        RunnerOne runnerOne = new RunnerOne();
        RunnerTwo runnerTwo = new RunnerTwo();

        runnerOne.execute();
        runnerTwo.execute();

        // Example of multithreaded execution

        System.out.println("=======================================");
        System.out.println("Multithreaded execution. \n");

        Thread threadOne = new Thread(new RunnerOne());
        Thread threadTwo = new Thread(new RunnerTwo());

        threadOne.start();
        threadTwo.start();


    }
}

class RunnerOne implements Runnable {
    public void execute() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner one: " + i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner one: " + i);
        }
    }
}

class RunnerTwo implements Runnable {
    public void execute() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner two: " + i);
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner two: " + i);
        }
    }
}