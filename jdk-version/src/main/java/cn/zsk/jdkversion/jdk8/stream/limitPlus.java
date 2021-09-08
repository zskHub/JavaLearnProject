package cn.zsk.jdkversion.jdk8.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author:zsk
 * @CreateTime:2018/8/2 17:05
 */
public class limitPlus {
    public static void main(String [] args) {

        Map map = new HashMap();

        List<StudentEntity> studentList = new ArrayList();

        StudentEntity student4 = new StudentEntity();
        student4.setId(4);
        student4.setAge(4);
        student4.setName("e");
        studentList.add(student4);

        StudentEntity student1 = new StudentEntity();
        student1.setId(1);
        student1.setAge(1);
        student1.setName("a");
        studentList.add(student1);

        StudentEntity student3 = new StudentEntity();
        student3.setId(3);
        student3.setAge(3);
        student3.setName("c");
        studentList.add(student3);

        StudentEntity student2 = new StudentEntity();
        student2.setId(2);
        student2.setAge(2);
        student2.setName("b");
        studentList.add(student2);

        map.put("totol",10);
        map.put("studentList",studentList);


        //控制输出个数
//        List<StudentEntity> studentEntities = studentList.stream().limit(2).collect(Collectors.toList());
//        for (StudentEntity studentEntity : studentEntities) {
//            System.out.println(studentEntity.toString());
//        }
        List<Map> test = new ArrayList<>();
        test.add(map);
        test.stream().map(n -> ((List)n.get("studentList")).stream().limit(2).collect(Collectors.toList())).collect(Collectors.toList());
        System.out.println(test);

    }
}
