package module3;

public class JustSemaphore implements Semaphore {
    private final int maxPermits;
    private final Object lock = new Object();
    private int permits;

    public JustSemaphore(int maxPermits, int permits) {
        this.permits = permits;
        this.maxPermits = maxPermits;
    }

    @Override
    public void acquire() throws InterruptedException {
        synchronized (lock){
            if (permits>0){
                permits--;
            }else {
                lock.wait();
            }
        }

    }

    @Override
    public void acquire(int permits) throws InterruptedException {
        synchronized (lock){
            if (this.permits - permits>0){
                this.permits-=permits;
            }else {
                if (this.permits>0){
                    lock.notify();
                }
            }lock.wait();
        }

    }

    @Override
    public void release() {
        synchronized (lock){
            permits++;
            lock.notify();
        }

    }

    @Override
    public void release(int permits) {
        synchronized (lock){

            this.permits = ((this.permits + permits)<maxPermits) ? this.permits : maxPermits;
            lock.notify();
        }

    }

    @Override
    public int getAvailablePermits() {
        synchronized (lock){

            return permits;
        }
    }
}
