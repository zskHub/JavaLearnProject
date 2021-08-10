package cn.zsk.basic.constructor;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-09   17:54
 */
public class Parent {
    //姓氏
    private String familyName;

    //地址
    private String address;

    public Parent(String familyName, String address){
       this.familyName = familyName;
       this.address = address;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
