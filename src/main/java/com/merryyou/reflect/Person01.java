package com.merryyou.reflect;

/**
 * Created on 2016/10/31 0031.
 *
 * @author zlf
 * @since 1.0
 */
public class Person01 {
    public Person01() {
    }
    private Person01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayChina(){
        System.out.println("hello China");
    }
    public void sayHello(String name , int age){
        System.out.println(name +"   "+age);
    }
}
