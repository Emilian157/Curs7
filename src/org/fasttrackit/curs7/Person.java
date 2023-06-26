package org.fasttrackit.curs7;

public class Person {
    protected String name;
    private int age;


    public Person(String nume, int varstaMea) {
        name = nume;
        age = varstaMea;
    }

    public String prezentare() {
        return "Numele meu este " + name + ", iar varsta mea este de " + age;
    }

    public String toString() {
        return "Numele meu este " + name + ", iar varsta mea este de " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        //logare
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person compareWithADifferentPerson(Person toComparoTo) {
        if (this.age > toComparoTo.age) {
            return this;
        } else {
            return toComparoTo;
        }
    }


}