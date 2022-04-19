class MultiThreadingInJava {
    public static void main(String[] args) throws InterruptedException{
        Counter c1 = new Counter("Ganga");
        Counter c2 = new Counter("Yamuna");
        Counter c3 = new Counter("Saraswati");
//        new Thread(c1).start();    // this will also start a thread but the reference variable will not be there
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        t1.start();     //start thread t1
        t2.start();     // start thread t2
        System.out.println("started t1 and t2 threads");
        t1.join();  // pause the execution of current thread here, and let t1 finish first
        // then current thread resume

        t3.start();     // start thread t3 (note: this will run after t1 finishes, because t1.join() will pause the
        // execution of current(main()) thread as soon it is encountered.
        // so t1 will finish first, (t2 may/may not finish, because it is also running in parallel with t1, as it was
        // started with just after t1 and before pausing of current thread.)
        System.out.println("t1 has completed. t1.isAlive() = " + t1.isAlive());
//        t2.join();
        System.out.println("t2 has completed. t2.isAlive() = " + t2.isAlive());
    }
}

class Counter implements Runnable {
    private String name;
    public Counter(String name) {
        this.name = name;
    }
    public void run() {
        for(int i = 0; i < 3; ++i) {
            System.out.println(name + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}