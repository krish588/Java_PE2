package com.stackroute.pe2;

public class Member {

    String name;
    int age;
    double salary;

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class MemberVariable {
    Member member = new Member();

    public String initialiseVariables(String name, int age, double salary){
        member.name = name;
        member.age = age;
        member.salary = salary;

        if (name == null)
            return null;

        return member.toString();
    }
}
