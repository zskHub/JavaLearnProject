package jdk8.stream;

/**
 * @author:zsk
 * @CreateTime:2018/7/18 16:20
 */
public class StudentEntity {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StudentEntity(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public StudentEntity() {
    }


    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
