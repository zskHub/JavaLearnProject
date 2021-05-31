package jdk8.optional;

import zsk.learn.java8.stream.StudentEntity;

import java.util.Optional;

/**
 * @author:zsk
 * @CreateTime:2018/7/27 14:08
 */
public class OptionalUse {
    public static void main(String [] args){
        orElse();

        orElseGet();
    }
    private static StudentEntity createNewUser(String param) {
        System.out.println("Creating New User"+param);
        return new StudentEntity(500,"ex",10);
    }
    public static void orElse(){
        //如果有值则返回该值，否则返回传递给它的参数值
//        StudentEntity studentEntity = null;
        StudentEntity studentEntity = new StudentEntity(1,"zzz",10);
        //注意：如果此时studentEntity不为空，执行的时候，会发现createNewUser()方法中依旧打印了东西即依旧执行了createNewUser()
        Object result = Optional.ofNullable(studentEntity).orElse(createNewUser("*********1******"));

        System.out.println("orElse:::::"+result.toString());
    }

    public static void orElseGet(){
//        StudentEntity studentEntity = null;
        StudentEntity studentEntity = new StudentEntity(2,"sss",20);
        //注意：如果此时studentEntity不为空，执行的时候，会发现createNewUser()方法中没有执行打印
        StudentEntity result = Optional.ofNullable(studentEntity).orElseGet(() -> createNewUser("********2*********"));
        System.out.println("orElseGet:::"+result.toString());
    }
}
