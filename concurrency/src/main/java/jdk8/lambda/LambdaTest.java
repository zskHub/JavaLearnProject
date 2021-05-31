package jdk8.lambda;


/**
 * @author:zsk
 * @CreateTime:2018/7/26 11:25
 *
 * lambda编程
 */
public class LambdaTest {
    public static void main(String args[]){
        LambdaTest tester = new LambdaTest();

        /*MathOperation是接口，使用普通方式，需要先实现接口，然后再使用.
        * 使用的是匿名函数的方式，在使用lambda表达式时，将匿名函数变成了lambda表达式。
        *
        * **/
        MathOperation test = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        };


        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句,带有返回语句的只能放在大括号中。
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("使用普通方式：10 + 5 = " + tester.operate(10, 5, test));
        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
