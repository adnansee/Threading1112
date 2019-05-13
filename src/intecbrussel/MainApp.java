package intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        MyThread run1 = new MyThread('#',100);
        MyThread run2 = new MyThread('*',1000);
        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);

        System.out.println(thread1.isAlive());
        thread1.start();
        System.out.println("---------------------------");
        thread2.start();
        System.out.println(thread1.isAlive());
    }

}
