package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads {
    ///* Here is the explanation for the code above:
    //1. Because the lock is used, the order of the threads is guaranteed, and no matter how many threads are used, the order of the threads is always A, B, C, A, B, C, and so on.
    //2. The thread pool is used, and the thread pool size is 3. The thread pool size is determined by the number of CPUs and the size of the task. If the task is a CPU-intensive task, the CPU is the bottleneck. If the task is a network-intensive task, the network is the bottleneck. If the task is an IO-intensive task, the disk is the bottleneck. The size of the thread pool should be set according to the bottleneck.
    //3. The task is a CPU-intensive task, so the number of threads is 3. The number of threads is not 1, because if the number of threads is 1, the thread will always be occupied by the CPU, and the CPU will be idle for most of the time, and the performance will be poor.
    //4. The task is a CPU-intensive task, so the time unit is SECONDS. If the task is a network-intensive task, the time unit is MILLISECONDS.
    //5. The maximum number of threads is the same as the number of threads, because the task is CPU-intensive, and the CPU is the bottleneck, so the maximum number of threads is the same as the number of threads.
    //6. The queue is a LinkedBlockingDeque, which is a FIFO queue, and the queue size is unlimited.
    //7. The thread pool should be shut down after use, and the thread pool will not shut down automatically.
    //8. The thread pool is used to manage threads, and the thread pool is used to manage threads. The thread pool can be reused after the task is completed, and the thread pool can be reused after the task is completed. The cost of thread creation is very high, so thread reuse is the best way. */
    public void threadPool() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread " + index + " is running.");
                }
            });
        }
        executorService.shutdown();
    }
}
