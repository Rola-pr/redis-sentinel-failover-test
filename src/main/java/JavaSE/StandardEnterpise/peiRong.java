package JavaSE.StandardEnterpise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class peiRong {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.
                parallelStream()
                .forEach(i ->{
                    System.out.println(Thread.currentThread().getName());
                });

        System.out.println(java.util.Collections.max(list));
        System.out.println(java.util.Collections.min(list));

    }
}
