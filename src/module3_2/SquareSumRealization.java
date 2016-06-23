package module3_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class SquareSumRealization implements SquareSum {




    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {


        ExecutorService service = Executors.newFixedThreadPool(numberOfThreads);


        int part = values.length/numberOfThreads;

        List<Long> runnables = Collections.synchronizedList(new ArrayList<>());
        Phaser phaser = new Phaser(1);
        int start = 0;
        int end = part;
        for (int i = 0; i < numberOfThreads; i++) {
            if (i + 1 == numberOfThreads) end = values.length;
            Future<Long> f = service.submit(new MyCallable(values, start, end, runnables, phaser));
            phaser.register();
            start= start+part;
            end = end+part;
        }


        phaser.arriveAndAwaitAdvance();
        phaser.arriveAndDeregister();
        service.shutdown();


        long finalResult =0;
        for (Long number : runnables) {
            finalResult+=number;
        }
        return finalResult;
    }





    public class MyCallable implements Callable<Long>{
        int[] values;
        int start;
        int end;
        List<Long> result;
        Phaser ph;

        public MyCallable(int[] values, int start, int end, List<Long> result, Phaser ph) {
            this.values = values;
            this.start = start;
            this.end = end;
            this.result = result;
            this.ph = ph;
        }

        @Override
        public Long call() {

            Long sum = 0L;

            for (int i = start; i < end; i++) {
                sum += values[i] * values[i];
            }
//            System.out.println(sum);

            result.add(sum);
            ph.arriveAndDeregister();

            return sum;
        }
    }




}
