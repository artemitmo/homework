package Threads1;

public class taskLesson {
    static volatile boolean currentAction = true;
    static class FirstThread implements Runnable {
        String threadName;
        boolean action;

        public FirstThread(String threadName, boolean action) {
            this.threadName = threadName;
            this.action = action;
        }

        @Override
        public void run() {
            while (true) {
                if (action == currentAction) {
                    System.out.println(threadName);
                    currentAction = !action;
                }
            }
        }
        public static void main(String[] args) {
           new Thread(new FirstThread("FirstThread", false)).start();
           new Thread(new FirstThread("SecondThread", true)).start();
        }
    }
}
