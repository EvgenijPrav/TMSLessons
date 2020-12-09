package com.company.less7;

public class Human {
    private final int age;
    private final String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public final String getName() {
        return name;
    }

    public void say() {
        System.out.println("I'm human");
    }

    public void getInfo() {
        System.out.println("The person is " + name + " with age of " + age);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Human) {
            Human human = (Human) obj;
            return human.age == this.age && human.name.equals(this.name);
        }
        return false;
    }

}
