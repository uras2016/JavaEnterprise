package module2;

public class Tasks<T extends Number> implements Task<T> {
    T number;
    T res;

    public Tasks(T number) {
        res = number;

    }

    @Override
    public void execute() {

    }

    @Override
    public T getResult() {
        return res;
    }
}
