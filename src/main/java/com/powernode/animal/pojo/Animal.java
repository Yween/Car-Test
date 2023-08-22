package com.powernode.animal.pojo;

/**
 * @version 1.0
 * @Author Ywenn
 * @Date 2023/8/22 14:53
 * @注释
 */
public class Animal {

    private String id;
    private String name;
    private String kind;
    private int age;
    private String master;

    public Animal() {
    }

    public Animal(String name, String kind, int age, String master) {
        this.name = name;
        this.kind = kind;
        this.age = age;
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", age=" + age +
                ", master='" + master + '\'' +
                '}';
    }
}
