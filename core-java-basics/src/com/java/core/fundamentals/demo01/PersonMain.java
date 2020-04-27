package com.java.core.fundamentals.demo01;

class Person {

    private String firstName;
    private String lastName;
    private String emailId;

   /* public Person(String firstName,String lastName,String emailId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }*/

    public String personDetail(String firstName, String lastName){
        return firstName+" "+lastName;
    }

    public String personDetail(String firstName, String lastName, String emailId){
        return firstName+" "+lastName+" "+emailId;
    }
}

public class PersonMain{
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.personDetail("Somnath","Musib"));
        System.out.println(person.personDetail("Jhinuk","Musib","abc@gmail.com"));

    }
}
