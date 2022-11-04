package Sortion;

/**
 * @author peirong
 * 以下为改进过的冒泡排序算法：
 * 增加了一个布尔值变量，用于判断某次遍历中是否执行交换。
 * 如果没有发生交换则说明数组已经有序，退出循环。
 */

public class BubbleSort {
    public static void bubbleSort(int[] list){
        boolean needNextPass = true;
        for (int k = 1; k <= list.length && needNextPass; k++){
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++){
                if (list[i] > list[i+1]){
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;

                    needNextPass = true;
                }
            }
        }
    }
    public static void main(String[] args) {

        int[] list = {3,4,8,-7,3,1,4,-1,12,9};

        bubbleSort(list);

        for (int j : list) {
            System.out.print(j + " ");
        }
    }
}

