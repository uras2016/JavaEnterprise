package module2;

import java.util.ArrayList;
import java.util.List;

public class ExecutorImplementationTest {
ExecutorImplementation executor;
NumValid val;
    @org.junit.Test
    public void testExecutor() throws Exception {

        List<Task<Long>> list = new ArrayList<Task<Long>>();

        list.add(new Tasks(10L));
        list.add(new Tasks(100L));
        list.add(new Tasks(15L));
//        executor.addTask(list,val );
    }
}