class StopThreadFunctionality {
}
class ThreadStopDemo {
    public static void main(String[] args) {
        Counter1 t1 = new Counter1(1);
        Counter1 t2 = new Counter1(2);
        new Thread(t1).start();
        new Thread(t2).start();
    }
//    Main method and child threads have completed execution
}

class Counter1 implements Runnable {
    private boolean stopCalled = false;
    private int id;
    public Counter1(int id) {
        this.id = id;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (stopCalled) {
                return;
            }
            System.out.println("t[" + id + "] : " + i);
        }
    }

    // the below method is used to stop the execution of a running thread.
    public void stopExecution() {
        stopCalled = true;
        System.out.println("t[" + id + "] stop called...");
    }
}