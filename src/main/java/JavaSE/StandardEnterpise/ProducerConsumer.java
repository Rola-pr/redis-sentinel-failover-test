package JavaSE.StandardEnterpise;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

    private static final Queue<Object> queue = new LinkedList<>();

    public static void main(String[] args) {

        new Thread(ProducerConsumer::producer,"生产者1").start();
        new Thread(ProducerConsumer::producer,"生产者2").start();

        new Thread(ProducerConsumer::consumer,"消费者1").start();
        new Thread(ProducerConsumer::consumer,"消费者2").start();
        new Thread(ProducerConsumer::consumer,"消费者3").start();

    }


    private static void producer(){
        while(true){
            try {
                Thread.sleep(3000);
                synchronized (queue){
                    String name = Thread.currentThread().getName();
                    System.out.println(new Date() + " " + name + "消费品");
                    queue.offer(new Object());
                    queue.notifyAll();
                }

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    private static void consumer(){

        while (true){
            try{
                synchronized (queue){
                    while (queue.isEmpty()) queue.wait();
                    queue.poll();
                    String name = Thread.currentThread().getName();
                    System.out.println(new Date()+ " " + name + "取用消费品");
                }

                Thread.sleep(4000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
