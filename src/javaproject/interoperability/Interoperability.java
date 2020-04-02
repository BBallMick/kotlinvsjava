package javaproject.interoperability;

import java.time.Instant;
import java.util.Date;

public class Interoperability {
    public static void main(String[] args) {

        Date date = Date.from(Instant.now());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(date);

    }
}
