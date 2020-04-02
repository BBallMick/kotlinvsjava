package kotlinproject.interoperability

import java.time.Instant
import java.util.Date

fun main() {

    val date = Date.from(Instant.now())
    println(date)

}