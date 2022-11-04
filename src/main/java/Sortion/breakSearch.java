package Sortion;

public class breakSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int target = 8;
        System.out.println(breaksearch(arr, 4));
        //breaksearch(arr, target);
    }


    private static int breaksearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target) return i;
        return -1;
    }
}