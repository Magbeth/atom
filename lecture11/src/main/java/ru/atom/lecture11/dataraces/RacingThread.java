package ru.atom.lecture11.dataraces;

import java.util.concurrent.atomic.AtomicInteger;

public final class RacingThread extends Thread {
    private final Stopper checker;
    private static AtomicInteger value = new AtomicInteger();

    public RacingThread(Stopper checker) {
        this.checker = checker;
    }

    public void run() {
        while (!checker.stop()) {
            increment();
        }
    }

    public void increment() {
        value.incrementAndGet();
    }

    public AtomicInteger getValue() {
        return value;
    }
}
