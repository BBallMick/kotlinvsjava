package javaproject.boilerplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaExpression {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(list.stream().filter(integer -> integer > 2).collect(Collectors.toList()));

    }
}
