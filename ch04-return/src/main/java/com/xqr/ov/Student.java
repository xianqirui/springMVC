package com.xqr.ov;
//保存请求参数值，的普通类
public class Student {
    private String name;
    private String age;

    public Student() {
        System.out.println("无参构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setaName:"+name);
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        System.out.println("setAge:"+age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
