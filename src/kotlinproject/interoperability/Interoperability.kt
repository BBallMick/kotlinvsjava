package kotlinproject.interoperability

import java.time.Instant
import java.util.Date

fun main() {

    val date = Date.from(Instant.now())
    Thread.sleep(1000)  //notice no checked exception in Kotlin
    println(date)

}