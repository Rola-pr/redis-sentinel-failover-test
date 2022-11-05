package Sortion;

public class threadUse {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("线程 1 开始执行！");
            for(int i = 0; i < 50; i++){
                System.out.println("1打印 " + i);
            }
        });

        Thread thread1 = new Thread(()->{
            System.out.println("线程 2 开始执行！");

            for (int i = 0; i < 50; i++){
                System.out.println("2打印 " + i);
                if (i == 10)
                    try {
                        System.out.println("线程 1 加入");
                        thread.join();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
            }
        });
        thread.start();
        thread1.start();

    }
}
