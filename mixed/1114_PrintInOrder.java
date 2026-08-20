/**
 * Problem: Print in Order (#1114)
 * Difficulty: Easy
 * Pattern: Semaphore, Thread Synchronization
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/print-in-order/
 */

import java.util.concurrent.*;
class Foo {

    Semaphore second = new Semaphore(0);
    Semaphore third = new Semaphore(0);

    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        second.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        second.acquire();

        printSecond.run();
        third.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        third.acquire();

        printThird.run();
    }
}