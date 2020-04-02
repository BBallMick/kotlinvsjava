package javaproject.typecast;

import javaproject.boilerplate.Person;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class TypeCast {

    public static void main(String[] args) {

        List<Object> list = List.of("string", new Person("John"));

        list.forEach(o -> {
                    if(o instanceof String) {
                        System.out.println(((String) o).toUpperCase());
                    } else if (o instanceof Person) {
                        System.out.println(((Person) o).getName());
                    }
                });
    }
}
