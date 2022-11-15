package section1.Thread;

public class ThreadExam3 {
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {


                System.out.println("Thread.currentThread(): "+Thread.currentThread());
                System.out.println("Thread.currentThread().getName(): "+Thread.currentThread().getName());
            }
        });
        th.start();

        System.out.println("th.getName() : "+th.getName());
        System.out.println("Thread.currentThread() 밖: "+Thread.currentThread());
        System.out.println("Thread.currentThread().getName() 밖: "+Thread.currentThread().getName());
    }
}
