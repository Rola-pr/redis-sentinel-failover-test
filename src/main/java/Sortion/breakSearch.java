package Sortion;

public class breakSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int target = 8;
        System.out.println("所要找的数在第" + breaksearch(arr, 4) + "+1位");

        System.out.println("所要找的数在第" + search(arr,6) + "+1位");

        System.out.println("所要找的数在第" +
                binarySearch(arr,0,arr.length - 1, 10) + "+1位");
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

    /**
     * 改进版本二分搜索
     * 使用递归
     */

    public static int binarySearch(int[] arr, int left, int right, int target){

        if (left > right) return -1;
        int mid = (left + right) / 2;

        if(arr[mid] > target)
            return binarySearch(arr, left,mid -1, target);
        else if(arr[mid] < target)
            return binarySearch(arr, mid + 1, right, target);
        else
            return mid;
    }
}