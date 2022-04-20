public class ThreadStates {
    /*
    Thread States:
    NEW: when thread is just created and is not started yet (i.e. start() method is not yet called on it)
    RUNNABLE: when start method is called & the thread is executing the code in run() method
    BLOCKED: when a thread is unable to proceed with execution because it is waiting for a monitor lock
    WAITING: when a thread is waiting indefinitely for another thread to perform a particular action.
    TIMED WAITING: when a thread that is waiting for another thread to perform an action for a specified waiting time,
    after which it will resume.
    TERMINATED: when a thread finishes.

    The getState() method on a thread, returns the state of the thread.

    Note that when a new Thread is created it does not start automatically. At that moment it is in the NEW state.
    And after a thread's state changes to TERMINATED, it cannot be started again.
    */
    public static void main(String[] args) {
    }
}
