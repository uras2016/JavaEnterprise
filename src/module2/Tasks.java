package module2;

public class Tasks implements Task<Long> {
    Long number;
    Long res = 0L;

    public Tasks(Long number) {
        this.number = number;

    }

    @Override
    public void execute() {
        res = number+10;

    }

    @Override
    public Long getResult() {
        return res;
    }
}
