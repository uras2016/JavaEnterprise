package module2;

import java.util.ArrayList;
import java.util.List;

public class ExecutorImplementation<T> implements Executor<T> {
    List<Task<? extends T>> tasks=new ArrayList<>();
    List<T> validTasks = new ArrayList<>();
    List<T> inValidTasks = new ArrayList<>();

    boolean isExecute;

    @Override
    public void addTask(Task<? extends T> task) throws Exceptions{
        if (isExecute)throw new Exceptions("method execute() have already been running");
        tasks.add(task);
        validTasks.add(task.getResult());
    }

    @Override
    public void addTask(Task<? extends T> task, Validator<? super T> validator) {

    }

    @Override
    public void execute() {

    }

    @Override
    public List<T> getValidResults() throws Exceptions {
        return null;
    }

    @Override
    public List<T> getInvalidResults() throws Exceptions {
        return null;
    }
}
