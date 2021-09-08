package cn.zsk.jdkversion.jdk8.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author:zsk
 * @CreateTime:2018/7/26 18:58
 */
public class Stream {
    public static void main(String [] arg){
        List<StudentEntity> studentList = new ArrayList<StudentEntity>();
        studentList.add(new StudentEntity(4, "e",  4));
        studentList.add(new StudentEntity(1, "a" , 1));
        studentList.add(new StudentEntity(3, "c" , 3));
        studentList.add(new StudentEntity(2, "b" , 2));

        List studentEntities = new ArrayList<>();
         studentEntities = studentList.stream().filter(s1 -> s1.getAge() < 4).sorted(Comparator.comparing(StudentEntity::getAge)).map(studentEntity -> {
            Map map = new HashMap<>();
            map.put("id",studentEntity.getId());
           return map;
        }).collect(Collectors.toList());



    }


}
