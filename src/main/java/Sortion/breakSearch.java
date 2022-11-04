package Sortion;

public class breakSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int target = 8;
        System.out.println(breaksearch(arr, 4));

        System.out.println(search(arr,6));

        //breaksearch(arr, target);
    }


    private static int breaksearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target) return i;
        return -1;
    }


    /**
     * 改进版二分搜索（二分查找）
     * @param arr
     * @param target
     * @return
     */
    private static int search(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        while(left < right){
            int mid = (left + right) / 2;
            int i = arr[mid];

            if(i < target)
                left = mid +1;
            else if(i > target)
                right = mid - 1;
            else
                return mid;
        }
        return -1;
    }

}