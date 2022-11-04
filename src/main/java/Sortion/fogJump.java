package Sortion;

import java.util.Scanner;

/**
 * 类似斐波那契数列的一个算法
 */
public class fogJump {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("请输入青蛙跳台阶的阶数：");
        int n = input.nextInt();
        System.out.println("总共有" + jump(n) + "种方法");
        System.out.print("递归求出总共有" + jump1(n) + "种方法");
    }

    public static int jump(int n){
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];
        return arr[n];
    }


    /**
     * 递归方法
     * @param n
     * @return
     */
    public static int jump1(int n){
        if (n == 0 || n == 1) return 1;
        return jump1(n - 1) + jump1(n - 2);

    }
}
