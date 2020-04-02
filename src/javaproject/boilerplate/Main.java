package javaproject.boilerplate;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person);
        System.out.println(person.equals(person2));
    }
}
