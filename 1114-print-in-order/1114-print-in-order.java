class Foo {
    
    private boolean firstRelease;
    private boolean secondRelease;

    public Foo() {
        this.firstRelease = false;
        this.secondRelease = false;
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        this.firstRelease = true;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        while (!this.firstRelease) {
            wait();
        }
        printSecond.run();
        this.secondRelease = true;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while (!this.secondRelease) {
            wait();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}