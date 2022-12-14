package JavaSE.StandardEnterpise;

import java.util.Timer;

public class threadUse {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            System.out.println("线程 1 开始执行！");
            for(int i = 0; i < 100; i++){
                System.out.print("1打印 " + i + " ");
                if(i % 15 == 0) System.out.println();
            }
        });

        Thread thread1 = new Thread(()->{
            System.out.println("线程 2 开始执行！");

            for (int i = 0; i < 50; i++){
                System.out.print("2打印 " + i + " ");
                if (i % 15 == 0) System.out.println();
                if (i == 10)
                    try {
                        System.out.println("\n线程 1 加入\n");
                        thread.join();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
            }
        });
        thread.start();
        thread1.start();


        Object o = new Object();

        Thread t1 = new Thread(()->{
            synchronized (o) {
                System.out.println("\n我是线程t1: ");
                    try {
                        for (int i = 0; i < 50; i++) {
                            System.out.print(i + " ");
                            if(i == 20) System.out.println();
                        }
                        o.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                System.out.println();
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (o) {
                System.out.println("\n我是线程t2: ");
                for (int i = 0; i < 50; i++) {
                    System.out.print(i + " ");
                    if (i == 20) System.out.println();
                }
                o.notify();
            }
        });

        t1.start();
        t2.start();

        Timer timer = new Timer();


    }
}
