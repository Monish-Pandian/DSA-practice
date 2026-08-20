/**
 * Problem: Fizz Buzz Multithreaded (#1195)
 * Difficulty: Medium
 * Pattern: Semaphore, Thread Synchronization, Concurrency
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/fizz-buzz-multithreaded/
 */
import java.util.concurrent.*;
import java.util.function.IntConsumer;
class FizzBuzz {
    private int n;
    private int current = 1;

    private final Semaphore fizzSem = new Semaphore(0);
    private final Semaphore buzzSem = new Semaphore(0);
    private final Semaphore fizzbuzzSem = new Semaphore(0);
    private final Semaphore numberSem = new Semaphore(1); 

    public FizzBuzz(int n) {
        this.n = n;
    }

    private boolean isFizz(int x)     { return x % 3 == 0 && x % 5 != 0; }
    private boolean isBuzz(int x)     { return x % 5 == 0 && x % 3 != 0; }
    private boolean isFizzBuzz(int x) { return x % 3 == 0 && x % 5 == 0; }
    private boolean isNumber(int x)   { return x % 3 != 0 && x % 5 != 0; }

    public void fizz(Runnable printFizz) throws InterruptedException {
        while (true) {
            fizzSem.acquire();
            if (current > n) { release(); return; }
            printFizz.run();
            advance();
        }
    }

    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (true) {
            buzzSem.acquire();
            if (current > n) { release(); return; }
            printBuzz.run();
            advance();
        }
    }

    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (true) {
            fizzbuzzSem.acquire();
            if (current > n) { release(); return; }
            printFizzBuzz.run();
            advance();
        }
    }

    public void number(IntConsumer printNumber) throws InterruptedException {
        while (true) {
            numberSem.acquire();
            if (current > n) { release(); return; }
            if (isNumber(current)) {
                printNumber.accept(current);
                advance();
            } else {
                dispatchOnly();
            }
        }
    }

    private synchronized void advance() {
        current++;
        dispatchOnly();
    }

    private synchronized void dispatchOnly() {
        if (current > n) {
            release();
            return;
        }
        if (isFizz(current)) fizzSem.release();
        else if (isBuzz(current)) buzzSem.release();
        else if (isFizzBuzz(current)) fizzbuzzSem.release();
        else numberSem.release();
    }

    private void release() {
        fizzSem.release();
        buzzSem.release();
        fizzbuzzSem.release();
        numberSem.release();
    }
}