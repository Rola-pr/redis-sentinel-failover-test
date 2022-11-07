package JavaSE.StandardEnterpise;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class fourFuntionInterfaces {


    /**
     * 2_Consumer函数式接口
     */
    private static final Consumer<Student> STUDENT_CONSUMER = student -> System.out.println("调用");


    /**
     * 3_toString函数式接口
     */
    private static final Function<Integer,String> INTEGER_STRING_FUNCTION = Objects::toString;


    /**
     *4_判断学生的分数
     */
    private static final Predicate<Student> STUDENT_PREDICATE = student -> student.score >= 60;


    public static void main(String[] args) {

        String str = INTEGER_STRING_FUNCTION.apply(10);
        System.out.println(str);

        System.out.println("接下来将字符串'lylzpr'转化为整数，且预计输出为6。");
        String str1 = INTEGER_STRING_FUNCTION
                .compose(String::length)
                .apply("lylzpr");
        System.out.println(str1);

        Student student = new Student();
        student.hello();

        STUDENT_CONSUMER
                .andThen(st -> System.out.println("yo!"))
                .accept(student);


        /**
         * 1_Supplier函数式接口
         * 提供返回功能
         */
        Supplier<Student> studentSupplier = new Supplier<Student>() {
            @Override
            public Student get() {
                return new Student();
            }
        };


        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生的分数：");
        student.score = input.nextInt();

        //Student.setScore(score);

        if(STUDENT_PREDICATE.test(student)){
            System.out.println("及格了");
        } else {
            System.out.println("不及格");
        }
    }

    public static class Student{


        int score;

        /**
         * 获得学生的成绩
         * @param score
         * @return
         */
        public static int setScore(int score){
            //this.score = score;
            return score;
        }


        public void hello(){
            System.out.println("学生调用");
        }
    }
}
