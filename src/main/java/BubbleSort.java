/**
 * @author peirong
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {1,9,4,6,5,-4};

        String DecValue = "af71";
        System.out.println(DecValue.charAt(0));

        for (int k = 1; k < list.length; k++){
            for (int i = 0; i < list.length - k; i++){
                int currentElement = list[i];
                if (list[i] > list[i+1]) {
                    list[i] = list[i+1];
                    list[i+1] = currentElement;
                }
            }
        }

        for (int j : list) {
            System.out.print(j + " ");
        }
    }
}

