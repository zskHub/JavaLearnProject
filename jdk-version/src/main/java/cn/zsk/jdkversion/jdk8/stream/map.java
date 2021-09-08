package cn.zsk.jdkversion.jdk8.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author:zsk
 * @CreateTime:2018/7/26 18:32
 */
public class map {

    public static void main(String[] args) {
        List<StudentEntity> studentList = new ArrayList<StudentEntity>();
        studentList.add(new StudentEntity(4, "e",  4));
        studentList.add(new StudentEntity(1, "a" , 1));
        studentList.add(new StudentEntity(3, "c" , 3));
        studentList.add(new StudentEntity(2, "b" , 2));

        List<Map> studentMap = studentList.stream().map(entity -> {
            Map map = new HashMap();
            map.put("id",entity.getId());
            map.put("age",entity.getAge());
            map.put("name",entity.getName());
            return map;
        }).collect(Collectors.toList());

        System.out.println(studentMap.toString());
    }
}
