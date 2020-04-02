package javaproject.interoperability;

import java.time.Instant;
import java.util.Date;

public class Interoperability {
    public static void main(String[] args) {

        Date date = Date.from(Instant.now());
        System.out.println(date);

    }
}
