package Threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {
///* Here is the explanation for the code above:
//1. The lock is initialized to a ReentrantLock object, and the condition variable is initialized to a condition object of the lock, which is equivalent to creating a queue of threads waiting for the condition variable.
//2. Producer and Consumer implement the Runnable interface, and the Producer and Consumer threads are created by creating two threads.
//3. When the producer produces, first judge whether the queue is full, if it is full, wait for the consumer to consume, then release the lock, and then wait for the consumer to consume, if it is not full, then the producer produces, count++, and then signal the consumer to consume.
//4. When the consumer consumes, first judge whether the queue is empty. If it is empty, wait for the producer to produce, then release the lock, and then wait for the producer to produce. If it is not empty, then the consumer consumes, count--, and then signal the producer to produce.
//5. The main function creates 5 producers and 5 consumers, which are executed in sequence according to the order of the threads. */
    private static final int MAX = 10;

    private static int count = 0;

    public Lock lock = new ReentrantLock();

    public Condition c1 = lock.newCondition();
    public Condition c2 = lock.newCondition();

    class Producer implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.lock();
                try {
                    while (count == MAX) {
                        c1.await();
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName() + "producer produce，total：" + count);
                    c2.signal();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    class Consumer implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.lock();
                try {
                    while (count == 0) {
                        c2.await();
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName() + "consumer consume，total：" + count);
                    c1.signal();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    public void producerConsumer() {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Producer producer = producerConsumer.new Producer();
        Consumer consumer = producerConsumer.new Consumer();
        for (int i = 0; i < 5; i++) {
            new Thread(producer, "producer" + i).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(consumer, "consumer" + i).start();
        }
    }
}
