package com.example.task7;

public class Boxer {

    private int id;
    private String name;
    private int age;
    private String gimName;

    public Boxer(int id, String name, int age, String gimName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gimName = gimName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGimName() {
        return gimName;
    }
}
