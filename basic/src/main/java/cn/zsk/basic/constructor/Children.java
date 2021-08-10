package cn.zsk.basic.constructor;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-09   17:57
 */
public class Children extends Parent{

    private String name;

    private Integer age;

    //如果这里继承了父类，那么就必须要继承父类的构造函数
    public Children(String familyName, String address, String name, Integer age) {
        super(familyName, address);
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
