package jdk8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author:zsk
 * @CreateTime:2018/7/26 17:57
 */
public class sort {
    public static void main(String[] args) {
        List<StudentEntity> list = new ArrayList<StudentEntity>();
        list.add(new StudentEntity(1, "a" , 1));
        list.add(new StudentEntity(3, "c" , 3));
        list.add(new StudentEntity(2, "b" , 2));
        list.add(new StudentEntity(4, "f" , 1));

        List<StudentEntity> slist = new ArrayList<>();
        System.out.println("----------------------------------按照名称排序-------------------------------");
        slist = list.stream().sorted(Comparator.comparing(StudentEntity::getName)).collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));

        System.out.println("-----------------------------按照名称反向排序的自然排序------------------------");
        slist = list.stream().sorted(Comparator.comparing(StudentEntity::getName).reversed()).collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));

        System.out.println("----------------------------------按照年龄排序--------------------------------");
        slist = list.stream().sorted(Comparator.comparing(StudentEntity::getAge)).collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));

        System.out.println("---------------------------------按照年龄倒序排序-----------------------------");
        slist = list.stream().sorted(Comparator.comparing(StudentEntity::getAge).reversed()).collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));

        System.out.println("----------------------------------先按照年龄排序,再按照id排序--------------------------------");
        slist = list.stream().sorted(Comparator.comparing(StudentEntity::getAge).thenComparing(StudentEntity::getId)).collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
    }
}
