package StackQueue;

public class MaxQueue {
    /* Here is the explanation for the code above:
1. The queue is the original queue, which stores the elements.
2. The max is the queue that stores the max value of the original queue.
3. The max queue is a monotonic queue, which means the elements in the queue are in ascending order.
4. When we push an element to the original queue, we need to find the right position for it in the max queue. So we should pop the elements in the max queue from the end until the last element is larger than the element we are going to push.
5. When we pop an element from the original queue, we need to check whether the element is the largest element in the max queue. If it is, we should pop it from the max queue. */
    private int[] queue;
    private int[] max;
    private int front;
    private int rear;
    private int maxFront;
    private int maxRear;

    public MaxQueue(int k) {
        queue = new int[k];
        max = new int[k];
        front = 0;
        rear = 0;
        maxFront = 0;
        maxRear = 0;
    }

    public int max_value() {
        if (maxFront == maxRear) {
            return -1;
        }
        return max[maxFront];
    }

    public void push_back(int value) {
        while (maxFront != maxRear && max[maxRear - 1] < value) {
            maxRear--;
        }
        max[maxRear++] = value;
        queue[rear++] = value;
    }

    public int pop_front() {
        if (front == rear) {
            return -1;
        }
        int res = queue[front++];
        if (res == max[maxFront]) {
            maxFront++;
        }
        return res;
    }
}
