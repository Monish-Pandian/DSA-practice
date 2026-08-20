/**
 * Problem: Print FooBar Alternately (#1115)
 * Difficulty: Medium
 * Pattern: Semaphore, Thread Synchronization, Concurrency
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/print-foobar-alternately/
 */
import java.util.concurrent.*;
class FooBar {
    private int n;

    private Semaphore fooSemaphore = new Semaphore(1);
    private Semaphore barSemaphore = new Semaphore(0);

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            fooSemaphore.acquire();

            printFoo.run();

            barSemaphore.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            barSemaphore.acquire();

            printBar.run();

            fooSemaphore.release();
        }
    }
}