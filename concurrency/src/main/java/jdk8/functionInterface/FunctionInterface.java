package jdk8.functionInterface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author:zsk
 * @CreateTime:2018/7/26 13:53
 *
 * 函数式接口(Functional Interface)就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。
 * 函数式接口可以被隐式转换为lambda表达式。
 * 函数式接口可以现有的函数友好地支持 lambda。
 */
public class FunctionInterface {

    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Predicate<Integer> predicate = n -> true
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // n 如果存在则 test 方法返回 true

        System.out.println("输出所有数据:");

        // 传递参数 n
        eval(list, n->true);

        // Predicate<Integer> predicate1 = n -> n%2 == 0
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n%2 为 0 test 方法返回 true

        System.out.println("输出所有偶数:");
        eval(list, n-> n%2 == 0 );

        // Predicate<Integer> predicate2 = n -> n > 3
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n 大于 3 test 方法返回 true

        System.out.println("输出大于 3 的所有数字:");
        eval(list, n-> n > 3 );
    }

    /*
    * Predicate <T> 接口是一个函数式接口，它接受一个输入参数 T，返回一个布尔值结果。
    * 该接口包含多种默认方法来将Predicate组合成其他复杂的逻辑（比如：与，或，非）。
    * 该接口用于测试对象是 true 或 false。
    *
    * **/
    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list) {

            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }
}
