package queue;

import java.util.Random;

/**
 * @author: snake
 * @create: 2019-07-25 23:02
 */
public class Main {

    //测试使用q运行opCount个enqueue和dequeue操作所需要的时间, 单位:秒
    private static double testQueue(Queue<Integer> q, int opCount) {

        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }
        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }


    public static void main(String[] args) {

        int opCount = 1000000;

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        System.out.println(testQueue(arrayQueue, opCount));

        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        System.out.println(testQueue(loopQueue, opCount));
    }
}
